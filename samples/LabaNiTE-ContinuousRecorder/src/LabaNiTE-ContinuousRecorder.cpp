//============================================================================
// Name        : LabaNiTE-Recorder.cpp
// Author      : Børge
// Version     :
// Copyright   : 
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <cstddef>
#include <iostream>
#include <fstream>

#include <mae/indexer_fix.hpp>

#include <mae/nite/nite.hpp>
#include <mae/demo/demo.hpp>
#include <mae/mae.hpp>

std::string construct_path(std::string dir, std::string title, int index, std::string file_extension, int sensor_index = -1)
{
	std::stringstream sstr;
	sstr << dir;

	if (dir.at(dir.length() - 1) != mae::mos::path_separator())
	{
		sstr << mae::mos::path_separator();
	}

	sstr << title;

	if (index >= 0)
	{
		sstr << index;
	}

	if (sensor+_index >= 0)
	{
		sstr << "_sensor" << sensor_index;
	}

	if (file_extension.at(0) != '.')
	{
		sstr << ".";
	}
	sstr << file_extension;

	return sstr.str();
}


int main()
{
	std::cout << "LabaNiTE-ContinuousRecorder started." << std::endl;

	//-----------------------
	//load configuration
	//-----------------------

	std::string sequence_length_str = "10";
	unsigned int sequence_length = 10;
	std::string start_after_str = "3";
	unsigned int start_after = 3;

	std::string number_recordings_str = "10";
	unsigned int number_recordings = 10;

	std::string begin_index_str = "1";
	unsigned int begin_index = 1;

	std::string stop_record_on_key_str = "false";
	bool stop_record_on_key = false;

	std::string sequence_title = "new_sequence";
	std::string sequence_author = "mae";
	std::string sequence_description = "A recorded sequence by the LabaNiTE-Recorder.";
	std::string sequences_dir = "sequences/";
	std::string bones = "RIGHT_WHOLE_ARM,LEFT_WHOLE_ARM";

	std::string debug_str = "false";
	bool debug = false;

	std::string sequence_path = "";
	std::string svg_path = "";
	std::string bvh_path = "";
	std::string plain_pos_path = "";

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
	if (ini_reader.get_value_nex("recorder", "number_recordings", &number_recordings_str))
	{
		number_recordings = std::stoul(number_recordings_str);
	}
	if (ini_reader.get_value_nex("recorder", "begin_index", &begin_index_str))
	{
		begin_index = std::stoul(begin_index_str);
	}
	if (ini_reader.get_value_nex("recorder", "stop_recording_on_key", &stop_record_on_key_str))
	{
		stop_record_on_key = mae::mbool::parse(stop_record_on_key_str);
	}

	ini_reader.get_value_nex("mae", "sequence_title", &sequence_title);
	ini_reader.get_value_nex("mae", "sequence_author", &sequence_author);
	std::vector<std::string> sequence_authors;
	sequence_authors.push_back(sequence_author);
	ini_reader.get_value_nex("mae", "sequence_description", &sequence_description);
	ini_reader.get_value_nex("mae", "sequences_dir", &sequences_dir);

	if (ini_reader.get_value_nex("mae", "debug", &debug_str))
	{
		debug = mae::mbool::parse(debug_str);
	}

	ini_reader.get_value_nex("mae", "bones", &bones);

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

	//svg path
	std::stringstream svgsstr;
	svgsstr << sequences_dir;
	if (sequences_dir.at(sequences_dir.length() - 1) != mae::mos::path_separator())
	{
		svgsstr << mae::mos::path_separator();
	}
	svgsstr << sequence_title << ".svg";
	svg_path = svgsstr.str();

	//bvh path
	std::stringstream bvhsstr;
	bvhsstr << sequences_dir;
	if (sequences_dir.at(sequences_dir.length() - 1) != mae::mos::path_separator())
	{
		bvhsstr << mae::mos::path_separator();
	}
	bvhsstr << sequence_title << ".bvh";
	bvh_path = bvhsstr.str();

	std::stringstream plainpossstr;
	plainpossstr << sequences_dir;
	if (sequences_dir.at(sequences_dir.length() - 1) != mae::mos::path_separator())
	{
		plainpossstr << mae::mos::path_separator();
	}
	plainpossstr << sequence_title << ".plainpos.txt";
	plain_pos_path = plainpossstr.str();

	//-----------------------
	//set up the controller
	//-----------------------

	std::vector<std::string> bones_split = mae::mstr::split(bones, ',');
	std::vector<mae::bone> body_parts;
	std::vector<std::shared_ptr<mae::fl::laban::column_definition> > column_definitions;

	std::cout << "body parts to be regarded:" << std::endl;
	for (unsigned int i = 0; i < bones_split.size(); i++)
	{
		mae::e_bone eb = mae::e_bone_c::parse(mae::mstr::trim(bones_split.at(i)));
		mae::bone b = mae::bone(eb);
		body_parts.push_back(b);
		std::cout << " - " << mae::e_bone_c::str(eb) << std::endl;

		if (std::abs(b.get_id()) != 1 && std::abs(b.get_id()) != 2 && std::abs(b.get_id()) != 4)
		{
			//generate column definition for the bone
			column_definitions.push_back(std::shared_ptr<mae::fl::laban::column_definition>(new mae::fl::laban::column_definition(eb)));
		}
	}

	mae::fl::fl_movement_controller movement_controller = mae::fl::fl_movement_controller(body_parts,
			column_definitions, sequence_length * 30 + 1);

	//-----------------------
	// initialize window
	//-----------------------

	std::shared_ptr<mae::demo::fl::recorder_window> rwin = nullptr;
	if (window)
	{
		rwin = std::shared_ptr<mae::demo::fl::recorder_window>(
				new mae::demo::fl::recorder_window("LabaNiTE-Recorder"));
		movement_controller.add_listener(rwin);
	}

	std::vector<std::shared_ptr<mae::nite::device_info> > devices = mae::nite::nite_farm::list_available_device_infos();

	std::cout << std::endl << "Currently available devices are:" << std::endl;

	if (devices.size() == 0)
	{
		std::cout << "None available." << std::endl;
	}
	else
	{
		for (unsigned int i = 0; i < devices.size(); i++)
		{
			std::cout << devices.at(i)->str() << std::endl;
		}
	}

	std::cout << "Setting up the OpenNI/NiTE driver...";
	mae::nite::nite_farm nitec = mae::nite::nite_farm(config_path, max_users, true);
	std::cout << "done" << std::endl;

	//-----------------------
	//process frames
	//-----------------------
	std::cout << "started processing..." << std::endl;

	int initial_wait_counter = 30 * start_after;
	int initial_lenght_counter = 30 * sequence_length;
	int wait_counter = initial_wait_counter;
	int length_counter = initial_lenght_counter;
	int sequence_counter = 0;

	std::vector<std::shared_ptr<mae::general_skeleton> > stored_merged_skeletons;
	std::vector<std::vector<std::shared_ptr<mae::general_skeleton> > > stored_unmerged_skeletons;

	mae::fl::bvh_controller bvh = mae::fl::bvh_controller();
	mae::fl::msr_data_controller msr = mae::fl::msr_data_controller();


	while ((!stop_record_on_key || !nitec.was_keyboard_hit()) && sequence_counter < number_recordings)
	{
		std::pair<std::vector<std::shared_ptr<mae::general_skeleton> >,
				std::vector<std::vector<std::shared_ptr<mae::general_skeleton> > > > skel_pair =
				nitec.wait_for_update_both();
		std::vector<std::shared_ptr<mae::general_skeleton> > skeletons = skel_pair.first;

		//std::vector<std::shared_ptr<mae::general_skeleton> > skeletons = nitec.wait_for_update();
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
					length_counter--;

					if (rwin != nullptr)
					{
						rwin->update_countdown((int) (length_counter / 30.0));
					}

					for(unsigned int i = 0; i < skel_pair.second.size(); i ++)
					{
						if (skel_pair.second.at(i).size() > 0)
						{
							while (stored_unmerged_skeletons.size() <= i)
							{
								stored_unmerged_skeletons.push_back(std::vector<std::shared_ptr<mae::general_skeleton> >());
							}
							stored_unmerged_skeletons.at(i).push_back(skel_pair.second.at(i).at(0));
						}
					}

					stored_merged_skeletons.push_back(skeletons.at(0));
					movement_controller.next_frame(0, skeletons.at(0));
				}
				else
				{
					int sequence_index = begin_index + sequence_counter;

					//done recording one sequence
					std::cout << "Done recording sequence " << sequence_index << ". Print sequence to file." << std::endl;

					std::shared_ptr<mae::fl::laban::laban_sequence> sequence = movement_controller.get_current_sequence();
					sequence->set_title(sequence_title);
					sequence->set_authors(sequence_authors);

					if (sequence != nullptr)
					{
						sequence->xml_file(construct_path(sequences_dir, sequence_title, sequence_index, ".laban"));
						sequence->svg_file(construct_path(sequences_dir, sequence_title, sequence_index, ".svg"));
					}

					std::cout << "Print bvh to file (" << construct_path(sequences_dir, sequence_title, sequence_index, ".bvh") << ")...";
					bvh.print_bvh_file(stored_merged_skeletons, construct_path(sequences_dir, sequence_title, sequence_index, ".bvh"));
					std::cout << "done." << std::endl;

					std::cout << "Print plain position to file (" << construct_path(sequences_dir, sequence_title, sequence_index, ".plain.txt") << ")...";
					msr.print_msr_file(construct_path(sequences_dir, sequence_title, sequence_index, ".plain.txt"), stored_merged_skeletons);
					std::cout << "done." << std::endl;

					if (stored_unmerged_skeletons.size() > 1)
					{
						for(unsigned int i= 0; i < stored_unmerged_skeletons.size(); i++)
						{
							std::cout << "Print bvh to file (" << construct_path(sequences_dir, sequence_title, sequence_index, ".bvh", i) << ")...";
							bvh.print_bvh_file(stored_unmerged_skeletons.at(i), construct_path(sequences_dir, sequence_title, sequence_index, ".bvh", i));
							std::cout << "done." << std::endl;

							std::cout << "Print plain position to file (" << construct_path(sequences_dir, sequence_title, sequence_index, ".plain.txt", i) << ")...";
							msr.print_msr_file(construct_path(sequences_dir, sequence_title, sequence_index, ".plain.txt", i), stored_unmerged_skeletons.at(i));
							std::cout << "done." << std::endl;
						}
					}

					sequence_counter++;

					//reset counters and buffers
					wait_counter = initial_wait_counter;
					length_counter = initial_lenght_counter;
					stored_merged_skeletons.clear();
					stored_unmerged_skeletons.clear();
					movement_controller.clear_buffer();
					rwin->clear_paint();
				}
			}
		}
		else
		{
			wait_counter = initial_wait_counter;
			length_counter = initial_lenght_counter;
			stored_merged_skeletons.clear();
			stored_unmerged_skeletons.clear();
			movement_controller.clear_buffer();
		}

		mae::demo::sdl_window::update();
	}

	//done recording one sequence
	std::cout << "Done recording all sequences. " << std::endl;


	return 0;
}