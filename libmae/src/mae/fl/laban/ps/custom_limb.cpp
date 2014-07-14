/*
 * custom_limb.cpp
 *
 *  Created on: 10.07.2014
 *      Author: keks
 */

#include "custom_limb.hpp"

namespace mae
{
	namespace fl
	{
		namespace laban
		{
			namespace ps
			{

				custom_limb::custom_limb(std::shared_ptr<i_endpoint> fixed_end, std::shared_ptr<i_endpoint> extremity)
				{
					fixed_end_ = fixed_end;
					extremity_ = extremity;

					if (fixed_end == nullptr)
					{
						throw std::invalid_argument("Fixed end must not be null.");
					}
				}

				custom_limb::~custom_limb()
				{
					// TODO Auto-generated destructor stub
				}

				std::shared_ptr<i_endpoint> custom_limb::get_fixed_end()
				{
					return fixed_end_;
				}

				std::shared_ptr<i_endpoint> custom_limb::get_extremity()
				{
					return extremity_;
				}

				std::string custom_limb::xml(unsigned int indent)
				{
					std::stringstream indent_stream;

					for (unsigned int i = 0; i < indent; i++)
					{
						indent_stream << "\t";
					}

					std::stringstream sstr;

					//print definition
					sstr << indent_stream.str() << "<limb>" << std::endl;

					//custom
					sstr << indent_stream.str() << "\t" << "<custom>" << std::endl;

					//print fixed end
					sstr << fixed_end_->xml(indent+2);

					if (extremity_ != nullptr)
					{
						//print extremity
						sstr << extremity_->xml(indent+2);
					}

					sstr << indent_stream.str() << "\t" << "</custom>" << std::endl;

					sstr << indent_stream.str() << "</limb>" << std::endl;

					return sstr.str();
				}

			} // namespace ps
		} // namespace laban
	} // namespace fl
} // namespace mae