/*
 * bvhspec.hpp
 *
 *  Created on: 20.06.2014
 *      Author: keks
 */

#ifndef BVHSPEC_HPP_
#define BVHSPEC_HPP_

//eclipse indexer fix
#include "../indexer_fix.hpp"

//custom includes
#include "../e_joint.hpp"
#include "../mstr.hpp"

//global includes
#include <map>
#include <string>
#include <memory>

namespace mae
{
	namespace fl
	{

		class bvh_spec
		{
			public:
				/**
				 * Creates a new specification for the bvh import. The specification defines
				 * the IDs that are assigned to the read string values of the joints. If the
				 * id map is empty the position of occurrence in the bvh file is used by the
				 * reader. Additionally the torso joints can be defined by the torso map. If
				 * the torso map is empty a suffix sharp '#' after the joint name is used to
				 * denote torso joints.
				 *
				 * The four anchor names are the names of the joints used for the left-right
				 * top-down direction.
				 *
				 * All strings should be present in lowercase!
				 *
				 * @param left_anchor
				 * @param right_anchor
				 * @param top_anchor
				 * @param bottom_anchor
				 * @param string_id_map
				 * @param string_torso_map
				 */
				bvh_spec(std::string left_anchor, std::string right_anchor, std::string top_anchor, std::string bottom_anchor, std::map<std::string, int> string_id_map, std::map<std::string, bool> string_torso_map);
				virtual ~bvh_spec();

				/**
				 * Returns the string to id map.
				 *
				 * @return The string to id map.
				 */
				virtual std::map<std::string, int> get_id_map() const;

				/**
				 * Returns the string to torso joint map.
				 *
				 * @return
				 */
				virtual std::map<std::string, bool> get_torso_map() const;

				/**
				 * Returns the anchor's joint name.
				 *
				 * @return The name.
				 */
				virtual std::string get_left_anchor();

				/**
				 * Returns the anchor's joint name.
				 *
				 * @return The name.
				 */
				virtual std::string get_right_anchor();

				/**
				 * Returns the anchor's joint name.
				 *
				 * @return The name.
				 */
				virtual std::string get_top_anchor();

				/**
				 * Returns the anchor's joint name.
				 *
				 * @return The name.
				 */
				virtual std::string get_bottom_anchor();

				/**
				 * Creates a default specification that fits the default hierarchy definition.
				 *
				 * @return The default specification.
				 */
				static std::shared_ptr<bvh_spec> default_spec();

			private:
				std::map<std::string, int> string_id_map_;
				std::map<std::string, bool> string_torso_map_;

				std::string left_anchor_;
				std::string right_anchor_;
				std::string top_anchor_;
				std::string bottom_anchor_;

		};

	} // namespace fl
} // namespace mae

#endif // BVHSPEC_HPP_
