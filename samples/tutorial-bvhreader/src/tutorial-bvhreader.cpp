//============================================================================
// Name        : tutorial-bvhreader.cpp
// Author      : furylynx
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

#include <mae/mae.hpp>

int main()
{
	// print message - program started
	std::cout << "tutorial - bvh reader " << std::endl;

	//create a bvh controller for bvh file reading
	mae::fl::bvh_controller reader = mae::fl::bvh_controller();

	//read the bvh file 'file.bvh' present in the current directory
	std::shared_ptr<mae::fl::bvh_data> data = reader.read_bvh_file("file.bvh", mae::fl::bvh_spec::default_spec());

	//get the skeleton data from the bvh data
	std::vector<std::shared_ptr<mae::general_skeleton> > skeleton_data = data->get_skeleton_data();

	//create a movement controller to handle the skeleton data
	mae::fl::fl_movement_controller mcontroller = mae::fl::fl_movement_controller();

	//iterate the frames of skeletons
	for (std::size_t i = 0; i < skeleton_data.size(); i++)
	{
		//hand the skeleton data to the movement controller
		mcontroller.next_frame(i, skeleton_data.at(i));
	}

	//get the produced laban sequence
	std::shared_ptr<mae::fl::laban::laban_sequence> sequence = mcontroller.get_current_sequence();

	//print the sequence in the xml format
	sequence->xml_file("file.laban");

	//print the sequence in the svg format (landscape format, 1920x1080)
	sequence->svg_file("file.svg", 1080, 1920);


	return 0;
}
