/*
 * i_part.hpp
 *
 *  Created on: 10.07.2014
 *      Author: keks
 */

#ifndef I_PART_HPP_
#define I_PART_HPP_

//eclipse indexer fix
#include "../../../indexer_fix.hpp"

//custom includes
//...

//global includes
#include <string>
#include <memory>

namespace mae
{
	namespace fl
	{
		namespace laban
		{
			namespace ps
			{

				class i_part
				{
					public:
						virtual ~i_part(){}

						/**
						 * Returns the XML representation for this element.
						 *
						 * @param indent The applied indent.
						 * @param namesp The prefixed XML namespace.
						 *
						 * @return The XML string.
						 */
						virtual std::string xml(unsigned int indent = 0, std::string namesp = "") const = 0;

						/**
						 * Returns true if elements are equal.
						 *
						 * @param a The element to be compared to.
						 * @return True if equal.
						 */
						virtual bool equals(std::shared_ptr<i_part> a) const = 0;
				};

			} // namespace ps
		} // namespace laban
	} // namespace fl
} // namespace mae

#endif // I_PART_HPP_
