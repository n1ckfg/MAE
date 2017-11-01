#ifndef MAE_FL_LABAN_E_PATH_TYPE_HPP_
#define MAE_FL_LABAN_E_PATH_TYPE_HPP_

//custom includes
#include "../../mstr.hpp"

//global includes
#include <string>
#include <stdexcept>
#include <vector>

namespace mae
{
	namespace fl
	{
		namespace laban
		{

			enum class e_path_type : int
			{
					NONE_PATH_TYPE,
					STRAIGHT,
					CIRCULAR_LEFT,
					CIRCULAR_RIGHT,
					ANY
			};

			class e_path_type_c
			{
				public:
					/**
					 * Returns the string representation for this enum value.
					 *
					 * @param type The element.
					 * @return The string representation.
					 */
					static std::string str(e_path_type type);

					/**
					 * Returns a vector containing all possible enum values.
					 *
					 * @return A vector.
					 */
					static std::vector<e_path_type> vec();

					/**
					 * Returns the integer value corresponding to this element.
					 *
					 * @param epathtype The element.
					 * @return The integer ID.
					 */
					static int to_int(e_path_type epathtype);

					/**
					 * Returns the int value corresponding to the last element making it the maximum int.
					 *
					 * @return The maximum.
					 */
					static int max();

					/**
					 * Parses the string and returns the corresponding element.
					 *
					 * @param str The string to be parsed.
					 * @return The element.
					 */
					static e_path_type parse(std::string str);
			};


		} // namespace laban
	} // namespace fl
} // namespace mae

#endif // MAE_FL_LABAN_E_PATH_TYPE_HPP_
