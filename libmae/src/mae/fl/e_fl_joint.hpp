#ifndef MAE_FL_E_FL_JOINT_HPP_
#define MAE_FL_E_FL_JOINT_HPP_

//custom includes
#include "../mstr.hpp"

//global includes
#include <string>
#include <vector>
#include <stdexcept>

namespace mae
{
	namespace fl
	{

		enum class e_fl_joint : int
		{
				INVALID_FL_JOINT = 0,
				HEAD,
				LEFT_UPPER_ARM,
				LEFT_FOREARM,
				LEFT_WHOLE_ARM,
				RIGHT_UPPER_ARM,
				RIGHT_FOREARM,
				RIGHT_WHOLE_ARM,
				LEFT_THIGH, //Oberschenkel
				LEFT_SHANK, //Unterschenkel
				LEFT_WHOLE_LEG,
				RIGHT_THIGH, //Oberschenkel
				RIGHT_SHANK, //Unterschenkel
				RIGHT_WHOLE_LEG
		};

		class e_fl_joint_c
		{
			public:
				/**
				 * Returns the string representation for this enum value.
				 *
				 * @param joint The element.
				 * @return The string representation.
				 */
				static std::string str(e_fl_joint joint);

				/**
				 * Returns the integer value corresponding to this element.
				 *
				 * @param joint The element.
				 * @return The integer ID.
				 */
				static int to_int(e_fl_joint joint);

				/**
				 * Returns a vector containing all possible enum values.
				 *
				 * @return A vector.
				 */
				static std::vector<e_fl_joint> vec();

				/**
				 * Parses the string and returns the corresponding element.
				 *
				 * @param str The string to be parsed.
				 * @return The element.
				 */
				static e_fl_joint parse(std::string str);

		};

	} // namespace fl
} // namespace mae

#endif // MAE_FL_E_FL_JOINT_HPP_
