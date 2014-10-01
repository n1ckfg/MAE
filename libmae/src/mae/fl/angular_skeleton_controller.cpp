/*
 * angular_skeleton_controller.cpp
 *
 *  Created on: 29.09.2014
 *      Author: keks
 */

#include "angular_skeleton_controller.hpp"

namespace mae
{
	namespace fl
	{

		angular_skeleton_controller::angular_skeleton_controller(bool debug)
		{
			debug_ = debug;

			fl_ctrl_ = std::shared_ptr<fl_skeleton_controller>(new fl_skeleton_controller());

			//initialize extremities

			//use temp vector
			std::vector<int> joints;

			//left arm
			joints.push_back(e_joint_c::to_int(e_joint::LEFT_SHOULDER));
			joints.push_back(e_joint_c::to_int(e_joint::LEFT_ELBOW));
			joints.push_back(e_joint_c::to_int(e_joint::LEFT_HAND));

			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::LEFT_UPPER_ARM));
			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::LEFT_FOREARM));
			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::LEFT_WHOLE_ARM));

			skel_extremities.push_back(joints);
			//skel_main_directions.push_back(r);
			joints.clear();

			//right arm
			joints.push_back(e_joint_c::to_int(e_joint::RIGHT_SHOULDER));
			joints.push_back(e_joint_c::to_int(e_joint::RIGHT_ELBOW));
			joints.push_back(e_joint_c::to_int(e_joint::RIGHT_HAND));

			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::RIGHT_UPPER_ARM));
			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::RIGHT_FOREARM));
			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::RIGHT_WHOLE_ARM));

			skel_extremities.push_back(joints);
			//						md.push_back(r);
			joints.clear();

			//left leg
			joints.push_back(e_joint_c::to_int(e_joint::LEFT_HIP));
			joints.push_back(e_joint_c::to_int(e_joint::LEFT_KNEE));
			joints.push_back(e_joint_c::to_int(e_joint::LEFT_FOOT));

			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::LEFT_THIGH));
			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::LEFT_SHANK));			//unterschenkel
			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::LEFT_WHOLE_LEG));

			skel_extremities.push_back(joints);
			//						md.push_back(u);
			joints.clear();

			//left leg
			joints.push_back(e_joint_c::to_int(e_joint::RIGHT_HIP));
			joints.push_back(e_joint_c::to_int(e_joint::RIGHT_KNEE));
			joints.push_back(e_joint_c::to_int(e_joint::RIGHT_FOOT));

			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::RIGHT_THIGH));
			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::RIGHT_SHANK));			//unterschenkel
			joints.push_back(e_fl_joint_c::to_int(e_fl_joint::RIGHT_WHOLE_LEG));

			skel_extremities.push_back(joints);
			//						md.push_back(u);
			joints.clear();
		}

		angular_skeleton_controller::~angular_skeleton_controller()
		{
		}

		std::shared_ptr<angular_skeleton> angular_skeleton_controller::specified_skeleton(
				std::shared_ptr<general_skeleton> skeleton)
		{
			if (debug_)
			{
				std::cout << "fl_skeleton_controller: specified skeleton" << std::endl;
			}

			std::shared_ptr<basis> torso_basis = fl_ctrl_->create_torso_basis(skeleton);

			cv::Vec3d u = math::maevec_to_vec3d(torso_basis->get_u());
			cv::Vec3d r = math::maevec_to_vec3d(torso_basis->get_r());
			cv::Vec3d t = math::maevec_to_vec3d(torso_basis->get_t());

			//-----
			//calculate angular representation (if wanted)
			//-----
			std::shared_ptr<angular_skeleton> result = calculate_angular_skeleton(skeleton, u, r, t);

			//set hierarchy
			result->set_hierarchy(skeleton->get_hierarchy());
			result->set_right_left(skeleton->get_right_left());
			result->set_top_down(skeleton->get_top_down());
			result->set_weight(skeleton->get_weight());

			//set coordinate system to skeleton
			result->set_torso_basis(torso_basis);

			return result;
		}

		std::shared_ptr<angular_skeleton> angular_skeleton_controller::calculate_angular_skeleton(
				std::shared_ptr<general_skeleton> skeleton, cv::Vec3d u, cv::Vec3d r, cv::Vec3d t)
		{
			// ---
			// Calculate spherical coordinates
			// for the resulting skeleton
			// ---

			//set up the resulting skeleton
			std::shared_ptr<angular_skeleton> result = std::shared_ptr<angular_skeleton>(new angular_skeleton());

			for (unsigned int i = 0; i < skel_extremities.size(); i++)
			{
				int joint_i = skel_extremities[i][0];
				int joint_o = skel_extremities[i][1];
				int joint_e = skel_extremities[i][2];

				int joint_fl_i = skel_extremities[i][3];
				int joint_fl_o = skel_extremities[i][4];
				int joint_fl_w = skel_extremities[i][5];

				if (skeleton->get_joint(joint_i)->is_valid() && skeleton->get_joint(joint_o)->is_valid())
				{
					cv::Vec2d angles;

					angles = first_degree_r(skeleton, joint_i, joint_o, u, r, t);
					result->set_joint(joint_fl_i, std::shared_ptr<angular_joint>(new angular_joint(angles[0], angles[1])));
					result->get_joint(joint_fl_i)->set_confidence(skeleton->get_joint(joint_o)->get_confidence());

					if (skeleton->get_joint(joint_e)->is_valid())
					{
						angles = second_degree(skeleton, joint_i, joint_o, joint_e, u, r, t);
						result->set_joint(joint_fl_o, std::shared_ptr<angular_joint>(new angular_joint(angles[0], angles[1])));
						result->get_joint(joint_fl_o)->set_confidence(skeleton->get_joint(joint_e)->get_confidence());

						//whole extremity joint
						angles = first_degree_r(skeleton, joint_i, joint_e, u, r, t);
						result->set_joint(joint_fl_w, std::shared_ptr<angular_joint>(new angular_joint(angles[0], angles[1])));
						result->get_joint(joint_fl_w)->set_confidence(skeleton->get_joint(joint_e)->get_confidence());
					}
				}
			}

			//spherical coordinates for the head
			int joint_head_i = e_joint_c::to_int(e_joint::NECK);
			int joint_head_o = e_joint_c::to_int(e_joint::HEAD);

			int joint_fl_head_i = e_fl_joint_c::to_int(e_fl_joint::HEAD);

			if (skeleton->get_joint(joint_head_i)->is_valid() && skeleton->get_joint(joint_head_o)->is_valid())
			{
				cv::Vec2d angles = first_degree(skeleton, joint_head_i, joint_head_o, r, t, u);
				result->set_joint(joint_fl_head_i, std::shared_ptr<angular_joint>(new angular_joint(angles[0], angles[1])));
				result->get_joint(joint_fl_head_i)->set_confidence(skeleton->get_joint(joint_head_o)->get_confidence());
			}

			return result;
		}

		cv::Vec2d angular_skeleton_controller::first_degree_md(std::shared_ptr<general_skeleton> skeleton,
				int adjacent_joint, int outer_joint, cv::Vec3d u, cv::Vec3d r, cv::Vec3d t, cv::Vec3d md)
		{
			// ---
			// calculate angles for first degree joints
			// ---

			cv::Vec3d vec_i = math::joint_to_vec(skeleton->get_joint(adjacent_joint));
			cv::Vec3d vec_o = math::joint_to_vec(skeleton->get_joint(outer_joint));

			//set up new rotated basis
			double beta = math::calc_angle_half(md, r);

			cv::Vec3d u_r = u;
			cv::Vec3d r_r = r;
			cv::Vec3d t_r = t;

			if (beta != 0)
			{
				cv::Vec3d b = t;

				if (beta != M_PI)
				{
					//rotate around axis b = md x r ...
					b = cv::normalize(md.cross(r));
				}

				//TODO dont calculate the rotation matrix several times : efficiency!!
				//apply to all
				u_r = math::rotate_around_axis(u, b, -beta);
				// r is not needed to be rotated since the projection will work with the plane spanned by u and t
				r_r = math::rotate_around_axis(r, b, -beta);
				t_r = math::rotate_around_axis(t, b, -beta);
			}

			// get first degree bone vector
			cv::Vec3d fdvec = cv::normalize(vec_o - vec_i);

			// inclination theta
			// calculates theta in radian
			double phi = math::calc_angle_half_deg(r_r, fdvec);

			// calculates phi in radian
			double theta;

			if (math::are_collinear(r_r, fdvec))
			{
				theta = 0;
			}
			else
			{
				//get azimuth phi by projecting the joint on the r-t-plane
				cv::Vec3d vec_o_p = math::project_orthogonal(vec_o, vec_i, u_r, t_r);
				cv::Vec3d fdvec_p = cv::normalize(vec_i - vec_o_p);

				//				theta = FLMath::calcAngleDeg(t_r, fdvec_p);
				theta = math::calc_angle_plane_deg(t_r, fdvec_p, r_r);
			}

			cv::Vec2d angles;
			angles[0] = phi;
			angles[1] = theta;

			return angles;

		}

		cv::Vec2d angular_skeleton_controller::first_degree_r(std::shared_ptr<general_skeleton> skeleton,
				int adjacent_joint, int outer_joint, cv::Vec3d u, cv::Vec3d r, cv::Vec3d t)
		{
			// ---
			// calculate angles for first degree joints
			// ---

			cv::Vec3d vec_i = math::joint_to_vec(skeleton->get_joint(adjacent_joint));
			cv::Vec3d vec_o = math::joint_to_vec(skeleton->get_joint(outer_joint));

			// get first degree bone vector
			cv::Vec3d fdvec = cv::normalize(vec_o - vec_i);

			// inclination theta
			// calculates theta in radian
			double phi = math::calc_angle_half_deg(r, fdvec);

			// calculates phi in radian
			double theta;

			if (math::are_collinear(r, fdvec))
			{
				theta = 0;
			}
			else
			{
				//get azimuth phi by projecting the joint on the u-t-plane
				cv::Vec3d vec_o_p = math::project_orthogonal(vec_o, vec_i, u, t);
				cv::Vec3d fdvec_p = cv::normalize(vec_i - vec_o_p);

				//				theta = FLMath::calcAngleDeg(t, fdvec_p);
				theta = math::calc_angle_plane_deg(t, fdvec_p, r);

			}

			cv::Vec2d angles;
			angles[0] = phi;
			angles[1] = theta;

			return angles;

		}

		cv::Vec2d angular_skeleton_controller::first_degree(std::shared_ptr<general_skeleton> skeleton,
				int adjacent_joint, int outer_joint, cv::Vec3d u, cv::Vec3d r, cv::Vec3d t)
		{
			// ---
			// calculate angles for first degree joints
			// ---

			cv::Vec3d vec_i = math::joint_to_vec(skeleton->get_joint(adjacent_joint));
			cv::Vec3d vec_o = math::joint_to_vec(skeleton->get_joint(outer_joint));

			// get first degree bone vector
			cv::Vec3d fdvec = cv::normalize(vec_o - vec_i);

			// inclination theta
			// calculates theta in radian
			double phi = math::calc_angle_half_deg(u, fdvec);

			// calculates phi in radian
			double theta;

			if (math::are_collinear(u, fdvec))
			{
				theta = 0;
			}
			else
			{
				//get azimuth phi by projecting the joint on the r-t-plane
				cv::Vec3d vec_o_p = math::project_orthogonal(vec_o, vec_i, r, t);
				cv::Vec3d fdvec_p = cv::normalize(vec_i - vec_o_p);

				//				theta = FLMath::calcAngleDeg(r, fdvec_p);
				theta = math::calc_angle_plane_deg(r, fdvec_p, u);
			}

			cv::Vec2d angles;
			angles[0] = phi;
			angles[1] = theta;

			return angles;

		}

		cv::Vec2d angular_skeleton_controller::second_degree(std::shared_ptr<general_skeleton> skeleton,
				int adjacent_joint, int outer_joint, int extremity_joint, cv::Vec3d u, cv::Vec3d r, cv::Vec3d t)
		{

			// ---
			// calculate angles for second degree joints
			// ---

			cv::Vec3d vec_i = math::joint_to_vec(skeleton->get_joint(adjacent_joint));
			cv::Vec3d vec_o = math::joint_to_vec(skeleton->get_joint(outer_joint));
			cv::Vec3d vec_e = math::joint_to_vec(skeleton->get_joint(extremity_joint));

			// get first degree bone vector
			cv::Vec3d fdvec = cv::normalize(vec_o - vec_i);

			// get second degree bone vector
			cv::Vec3d sdvec = cv::normalize(vec_e - vec_o);

			// calc inclination phi
			// angle between fdvec and sdvec which is the angle between r_r and sdvec (angle ranges from 0 to 180 degree
			double phi = math::calc_angle_half_deg(fdvec, sdvec);

			// calc azimuth theta
			double theta;

			if (math::are_collinear(fdvec, sdvec))
			{
				// both joint vectors fdvec and sdvec are collinear
				// therefore we can set phi to zero
				theta = 0;
			}
			else
			{

				// ... by rotation angle beta
				//double beta = std::acos(fdvec.dot(r));
				//double beta = FLMath::calcAngle(fdvec, r);
				double beta = math::calc_angle_half(fdvec, r);

				//rotate around axis b = v x r ...
				cv::Vec3d b = t;

				if (beta != 0 && beta != M_PI)
				{
					b = cv::normalize(fdvec.cross(r));
				}

				//TODO dont calculate the rotation matrix several times : efficiency!!
				//apply to all
				cv::Vec3d u_r = math::rotate_around_axis(u, b, -beta);
				// r is not needed to be rotated since the projection will work with the plane spanned by u and t
				// cv::Vec3d r_r = FLMath::rotateAroundAxis(r, b, beta);
				cv::Vec3d t_r = math::rotate_around_axis(t, b, -beta);

				//plane othogonal to v is E(u,t)
				cv::Vec3d sdvec_p = math::project_orthogonal(vec_e, vec_o, u_r, t_r);
				sdvec_p = cv::normalize(vec_o - sdvec_p);

				//				theta = FLMath::calcAngleDeg(t_r, sdvec_p);
				theta = math::calc_angle_plane_deg(t_r, sdvec_p, fdvec);
			}

			//return the angles
			cv::Vec2d angles;
			angles[0] = phi;
			angles[1] = theta;

			return angles;

		}

	} // namespace fl
} // namespace mae
