/*
 * surface_part.cpp
 *
 *  Created on: 10.07.2014
 *      Author: keks
 */

#include "surface_part.hpp"

namespace mae
{
	namespace fl
	{
		namespace laban
		{
			namespace ps
			{

				surface_part::surface_part(e_limb_side lside, std::shared_ptr<i_limb> limb)
				{
					lside_ = lside;
					limb_ = limb;
				}

				surface_part::~surface_part()
				{
				}

				e_limb_side surface_part::get_limb_side()
				{
					return lside_;
				}

				std::shared_ptr<i_limb> surface_part::get_limb()
				{
					return limb_;
				}

				std::string surface_part::xml(unsigned int indent)
				{
					std::stringstream indent_stream;

					for (unsigned int i = 0; i < indent; i++)
					{
						indent_stream << "\t";
					}

					std::stringstream sstr;

					//print definition
					sstr << indent_stream.str() << "<surface>" << std::endl;

					//print part
					sstr << limb_->xml(indent + 1);

					//print side
					sstr << indent_stream.str() << "\t" << "<side>" << e_limb_side_str::str(lside_) << "</side>" << std::endl;

					sstr << indent_stream.str() << "</surface>" << std::endl;

					return sstr.str();

				}

			} // namespace ps
		} // namespace laban
	} // namespace fl
} // namespace mae