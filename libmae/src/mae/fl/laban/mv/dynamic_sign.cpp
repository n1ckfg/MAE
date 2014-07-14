/*
 * dynamics_sign.cpp
 *
 *  Created on: 10.07.2014
 *      Author: keks
 */

#include "dynamic_sign.hpp"

namespace mae
{
	namespace fl
	{
		namespace laban
		{
			namespace mv
			{

				dynamic_sign::dynamic_sign(e_dynamic dynamic)
				{
					dynamic_ = dynamic;

					if (dynamic == e_dynamic::NONE)
					{
						throw std::invalid_argument("Dynamic must not be NONE.");
					}
				}

				dynamic_sign::~dynamic_sign()
				{
				}

				e_dynamic dynamic_sign::get_dynamic()
				{
					return dynamic_;
				}

				std::string dynamic_sign::xml(unsigned int indent)
				{
					std::stringstream indent_stream;

					for (unsigned int i = 0; i < indent; i++)
					{
						indent_stream << "\t";
					}

					std::stringstream sstr;

					//print accent sign
					sstr << indent_stream.str() << "<dynamics>" << std::endl;

					sstr << indent_stream.str() << "\t" << "<dynamic>" << e_dynamic_str::str(dynamic_) << "</dynamic>" << std::endl;

					sstr << indent_stream.str() << "</dynamics>" << std::endl;

					return sstr.str();
				}

			} // namespace mv
		} // namespace laban
	} // namespace fl
} // namespace mae