#ifndef MAE_FL_LABAN_PS_I_LIMB_HPP_
#define MAE_FL_LABAN_PS_I_LIMB_HPP_

//custom includes
#include "i_part.hpp"

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

				class i_limb: public i_part
				{
					public:
						virtual ~i_limb(){}

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

						/**
						 * Returns true if elements are equal.
						 *
						 * @param a The element to be compared to.
						 * @return True if equal.
						 */
						virtual bool equals(std::shared_ptr<i_limb> a) const = 0;
				};

			} // namespace ps
		} // namespace laban
	} // namespace fl
} // namespace mae

#endif // MAE_FL_LABAN_PS_I_LIMB_HPP_
