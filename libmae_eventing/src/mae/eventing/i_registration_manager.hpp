/*
 * i_registration_manager.hpp
 *
 *  Created on: 15.09.2014
 *      Author: keks
 */

#ifndef I_REGISTRATION_MANAGER_HPP_
#define I_REGISTRATION_MANAGER_HPP_

//eclipse indexer fix
#include "../indexer_fix.hpp"

//custom includes
//...

//global includes
#include <memory>

namespace mae
{
	namespace eventing
	{
		template <typename U>
		class i_registration_manager
		{
			public:
				virtual ~i_registration_manager(){}

				virtual bool on_sequence_registered(std::shared_ptr<U> sequence) = 0;
		};

	} // namespace eventing
} // namespace mae

#endif // I_REGISTRATION_MANAGER_HPP_