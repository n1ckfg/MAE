/*
 * i_sequence_serializer.hpp
 *
 *  Created on: 03.09.2014
 *      Author: keks
 */

#ifndef I_SEQUENCE_SERIALIZER_HPP_
#define I_SEQUENCE_SERIALIZER_HPP_

//eclipse indexer fix
#include "../indexer_fix.hpp"

//custom includes
//...

//global includes
#include <string>
#include <memory>

namespace mae
{
	namespace eventing
	{

		template <typename U>
		class i_sequence_serializer
		{
			public:
				i_sequence_serializer();

				/**
				 * Serializes the sequence so that it can be printed to a string.
				 *
				 * @param sequence The sequence.
				 * @return The string containing the serialized sequence.
				 */
				virtual std::string serialize(std::shared_ptr<U> sequence) = 0;
		};

	} // namespace eventing
} // namespace mae

#endif // I_SEQUENCE_SERIALIZER_HPP_
