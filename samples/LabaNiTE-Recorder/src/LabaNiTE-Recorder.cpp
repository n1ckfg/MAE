//============================================================================
// Name        : LabaNiTE-Recorder.cpp
// Author      : Børge
// Version     :
// Copyright   : 
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <fstream>

#include <mae/indexer_fix.hpp>

#include <mae/nite/nite.hpp>
#include <mae/demo/demo.hpp>
#include <mae/mae.hpp>

int main()
{
	std::cout << "LabaNiTE-Recorder started." << std::endl;

	//-----------------------
	//load configuration
	//-----------------------

	std::string sequence_length_str = "10";
	unsigned int sequence_length = 10;
	std::string start_after_str = "3";
	unsigned int start_after = 3;

	std::string stop_record_on_key_str = "false";
	bool stop_record_on_key = false;

	std::string sequence_title = "new_sequence";
	std::string sequence_author = "mae";
	std::string sequence_description = "A recorded sequence by the LabaNiTE-Recorder.";
	std::string sequences_dir = "sequences/";

	std::string sequence_path = "";

	std::string config_path = "SamplesConfig.xml";

	//users are restricted to one
	int max_users = 1;

	std::string window_str = "false";
	bool window = false;

	std::string resources_dir = "resources";

	std::cout << "Loading the configuration...";
	mae::ini_reader ini_reader = mae::ini_reader("config.ini");

	if (ini_reader.get_value_nex("recorder", "sequence_length", &sequence_length_str))
	{
		sequence_length = std::stoul(sequence_length_str);
	}
	if (ini_reader.get_value_nex("recorder", "start_after", &start_after_str))
	{
		start_after = std::stoul(start_after_str);
	}
	if (ini_reader.get_value_nex("recorder", "stop_recording_on_key", &stop_record_on_key_str))
	{
		stop_record_on_key = mae::mbool::parse(stop_record_on_key_str);
	}

	ini_reader.get_value_nex("mae", "sequence_title", &sequence_title);
	ini_reader.get_value_nex("mae", "sequence_author", &sequence_author);
	ini_reader.get_value_nex("mae", "sequence_description", &sequence_description);
	ini_reader.get_value_nex("mae", "sequences_dir", &sequences_dir);

	ini_reader.get_value_nex("nite", "config_path", &config_path);

	if (ini_reader.get_value_nex("demo", "window", &window_str))
	{
		window = mae::mbool::parse(window_str);
	}

	ini_reader.get_value_nex("demo", "resources_dir", &resources_dir);

	std::cout << "done." << std::endl;

	std::cout << "NiTE config path " << config_path << std::endl;
	std::cout << "max users " << max_users << std::endl;

	//sequence path
	std::stringstream sstr;
	sstr << sequences_dir;
	if (sequences_dir.at(sequences_dir.length() - 1) != mae::mos::path_separator())
	{
		sstr << mae::mos::path_separator();
	}
	sstr << sequence_title << ".laban";
	sequence_path = sstr.str();

	//-----------------------
	//set up the controller
	//-----------------------

	std::vector<mae::bone> body_parts;
	body_parts.push_back(mae::bone::create_bone(mae::e_bone::RIGHT_WHOLE_ARM));
	body_parts.push_back(mae::bone::create_bone(mae::e_bone::LEFT_WHOLE_ARM));

	std::vector<std::shared_ptr<mae::fl::laban::column_definition> > column_definitions;

	mae::fl::fl_movement_controller movement_controller = mae::fl::fl_movement_controller(body_parts,
			column_definitions, sequence_length * 30 + 1);

	//add window for demo purposes
	std::shared_ptr<mae::demo::fl::recorder_window> rwin = nullptr;
	if (window)
	{
		//-----------------------
		// initialize window
		//-----------------------

		//TODO font?!!
		rwin = std::shared_ptr<mae::demo::fl::recorder_window>(
				new mae::demo::fl::recorder_window("LabaNiTE-Recorder", resources_dir,
						"/usr/share/fonts/truetype/freefont/FreeSerif.ttf"));
		movement_controller.add_listener(rwin);
	}

	std::cout << "Setting up the OpenNI/NiTE driver...";

	mae::nite::nite_controller nitec = mae::nite::nite_controller(config_path, max_users, true);

	std::cout << "done" << std::endl;

	//-----------------------
	//process frames
	//-----------------------
	std::cout << "started processing..." << std::endl;

	int initial_wait_counter = 30 * start_after;
	int initial_lenght_counter = 30 * sequence_length;
	int wait_counter = initial_wait_counter;
	int length_counter = initial_lenght_counter;
	while (!stop_record_on_key || !nitec.was_keyboard_hit())
	{
		std::vector<std::shared_ptr<mae::general_skeleton> > skeletons = nitec.wait_for_update();
		if (skeletons.size() > 0 && skeletons.at(0) != nullptr)
		{
			if (wait_counter > 0)
			{
				wait_counter--;

				if (rwin != nullptr)
				{
					rwin->update_countdown((int) (wait_counter / 30.0));
				}
			}
			else
			{
				if (length_counter > 0)
				{
					length_counter --;

					movement_controller.next_frame(0, skeletons.at(0));
				}
				else
				{
					//stop
					break;
				}
			}
		}
		else
		{
			wait_counter = initial_wait_counter;
			length_counter = initial_lenght_counter;
		}
	}

	std::cout << "Done recording. Print sequence to file." << std::endl;

	std::shared_ptr<mae::fl::laban::laban_sequence> sequence = movement_controller.get_current_sequence();

	std::ofstream outfile(sequence_path);
	if (sequence != nullptr)
	{
		if (outfile.is_open())
		{
			outfile << sequence->xml();
			outfile.close();
		}
		else
		{
			std::cerr << "Cannot write to the file " << sequence_title << std::endl;
		}
	}
	else
	{
		std::cerr << "Cannot generate the sequence " << std::endl;
	}

	return 0;
}
