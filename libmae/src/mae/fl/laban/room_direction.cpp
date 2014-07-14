/*
 * room_direction.cpp
 *
 *  Created on: 11.07.2014
 *      Author: keks
 */

#include "room_direction.hpp"

namespace mae
{
	namespace fl
	{
		namespace laban
		{

			room_direction::room_direction(unsigned int measure, double beat, std::shared_ptr<mv::pin> direction)
			{
				measure_ = measure;
				beat_ = beat;
				direction_ = direction;

				if (beat < 0)
				{
					throw std::invalid_argument("Beat must not be negative.");
				}

				if (direction == nullptr)
				{
					throw std::invalid_argument("Direction must not be null.");
				}

			}

			room_direction::~room_direction()
			{
			}

			unsigned int room_direction::get_measure()
			{
				return measure_;
			}

			double room_direction::get_beat()
			{
				return beat_;
			}

			std::shared_ptr<mv::pin> room_direction::get_direction()
			{
				return direction_;
			}


			std::string room_direction::xml(unsigned int indent)
			{
				std::stringstream indent_stream;

				for (unsigned int i = 0; i < indent; i++)
				{
					indent_stream << "\t";
				}

				std::stringstream sstr;

				sstr << std::fixed << std::setprecision(2);

				//print turn symbol
				sstr << indent_stream.str() << "<roomDirection>" << std::endl;

				sstr << indent_stream.str() << "\t" << "<measure>" << measure_ << "</measure>" << std::endl;
				sstr << indent_stream.str() << "\t" << "<beat>" << beat_ << "</beat>" << std::endl;
				sstr << direction_->xml(indent+1);

				sstr << indent_stream.str() << "</roomDirection>" << std::endl;

				return sstr.str();

			}


		} // namespace laban
	} // namespace fl
} // namespace mae