/*
 * body_part.cpp
 *
 *  Created on: 10.07.2014
 *      Author: keks
 */

#include "body_part.hpp"

namespace mae
{
	namespace fl
	{
		namespace laban
		{
			namespace ps
			{

				body_part::body_part(e_side side, std::shared_ptr<i_part> part)
				{
					side_ = side;
					part_ = part;
				}

				body_part::~body_part()
				{
				}

				e_side body_part::get_side()
				{
					return side_;
				}
				std::shared_ptr<i_part> body_part::get_part()
				{
					return part_;
				}

				std::string body_part::xml(unsigned int indent)
				{
					std::stringstream indent_stream;

					for (unsigned int i = 0; i < indent; i++)
					{
						indent_stream << "\t";
					}

					std::stringstream sstr;

					//print definition
					sstr << indent_stream.str() << "<preSign>" << std::endl;

					sstr << indent_stream.str() << "\t" << "<bodyPart>" << std::endl;

					//print part
					sstr << part_->xml(indent + 2);

					//print side
					sstr << indent_stream.str() << "\t\t" << "<side>" << e_side_str::str(side_) << "</side>" << std::endl;

					sstr << indent_stream.str() << "\t" << "</bodyPart>" << std::endl;

					sstr << indent_stream.str() << "</preSign>" << std::endl;

					return sstr.str();
				}

			} // namespace ps
		} // namespace laban
	} // namespace fl
} // namespace mae
