/*
 * FLMovementController.cpp
 *
 *  Created on: 29.05.2014
 *      Author: keks
 */

#include "fl_movement_controller.hpp"


namespace mae
{
	namespace fl
	{

		fl_movement_controller::fl_movement_controller(unsigned int pose_buffer_size, bool debug)
				: movement_controller(std::shared_ptr<fl_pose_detector>(new fl_pose_detector(debug)),
						std::shared_ptr<laban::laban_sequence_generator>(new laban::laban_sequence_generator(debug)),
						std::shared_ptr<laban::laban_sequence_recognizer>(new laban::laban_sequence_recognizer(debug)),
						bone::default_bones(), debug)
		{
			this->skel_ctrl = std::shared_ptr<fl_skeleton_controller>(new fl_skeleton_controller(debug));

			if (pose_buffer_size > 1)
			{
				movement_controller<fl_skeleton, laban::laban_sequence>::get_movement_detector()->set_buffer(pose_buffer_size);
			}
		}

		fl_movement_controller::fl_movement_controller(std::vector<bone> body_parts,
				std::vector<std::shared_ptr<laban::column_definition> > column_definitions, unsigned int pose_buffer_size, bool debug)
				: movement_controller(std::shared_ptr<fl_pose_detector>(new fl_pose_detector(debug)),
						std::shared_ptr<laban::laban_sequence_generator>(new laban::laban_sequence_generator(column_definitions, debug)),
						std::shared_ptr<laban::laban_sequence_recognizer>(new laban::laban_sequence_recognizer(debug)),
						body_parts, debug)
		{
			this->skel_ctrl = std::shared_ptr<fl_skeleton_controller>(new fl_skeleton_controller(debug));

			if (pose_buffer_size > 1)
			{
				movement_controller<fl_skeleton, laban::laban_sequence>::get_movement_detector()->set_buffer(pose_buffer_size);
			}
		}

		fl_movement_controller::~fl_movement_controller()
		{
		}

		void fl_movement_controller::next_frame(long timestamp, std::shared_ptr<general_skeleton> skeleton)
		{
			std::shared_ptr<fl_skeleton> fl_skel = skel_ctrl->specified_skeleton(skeleton);

			//call next_frame for base class
			movement_controller<fl_skeleton, laban::laban_sequence>::next_frame(timestamp, fl_skel);
		}

	} // namespace fl
} // namespace mae
