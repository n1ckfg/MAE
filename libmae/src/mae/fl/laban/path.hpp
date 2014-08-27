/*
 * path.hpp
 *
 *  Created on: 11.07.2014
 *      Author: keks
 */

#ifndef PATH_HPP_
#define PATH_HPP_

//eclipse indexer fix
#include "../../indexer_fix.hpp"

//custom includes
#include "i_movement.hpp"
#include "e_path_type.hpp"

//global includes
#include <string>
#include <sstream>
#include <stdexcept>
#include <ios>
#include <iomanip>


namespace mae
{
	namespace fl
	{
		namespace laban
		{

			class path: public i_movement
			{
				public:
					/**
					 * Creates a path symbol.
					 *
					 * @param type The type of the path.
					 * @param measure The measure in which this symbol is placed.
					 * @param beat The beat mark of the measure where this symbol begins.
					 * @param duration The duration of the symbol (in beats).
					 */
					path(e_path_type type, unsigned int measure, double beat, double duration);

					virtual ~path();

					/**
					 * Returns the type of the path.
					 *
					 * @return
					 */
					e_path_type get_type();

					/**
					 * Returns the column to which this symbol was added. Since a path symbol is placed
					 * in its own column zero is returned.
					 *
					 * @return Zero.
					 */
					virtual int get_column();

					/**
					 * Returns the measure in which this symbol is placed.
					 * @return
					 */
					virtual unsigned int get_measure();

					/**
					 * Returns the beat where this symbol starts.
					 * @return
					 */
					virtual double get_beat();

					/**
					 * Returns the duration of the symbol in beats.
					 *
					 * @return
					 */
					virtual double get_duration();

					/**
					 * Returns the XML representation for this element.
					 *
					 * @param indent The applied indent.
					 * @param namesp The prefixed XML namespace.
					 *
					 * @return The XML string.
					 */
					virtual std::string xml(unsigned int indent = 0, std::string namesp = "");

					/**
					 * Returns the string representation for this element.
					 *
					 * @return The string.
					 */
					virtual std::string str() const;

					friend std::ostream& operator<<(std::ostream& os, const path& obj)
					{
						os << obj.str();
						return os;
					}

					friend std::ostream& operator<<(std::ostream& os, const std::shared_ptr<path>& obj)
					{
						os << obj->str();
						return os;
					}


				private:
					e_path_type type_;
					unsigned int measure_;
					double beat_;
					double duration_;

			};

		} // namespace laban
	} // namespace fl
} // namespace mae

#endif // PATH_HPP_
