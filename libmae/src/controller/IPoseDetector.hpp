/*
 * IPoseDetector.hpp
 *
 *  Created on: 15.05.2014
 *      Author: keks
 */

#ifndef IPOSEDETECTOR_HPP_
#define IPOSEDETECTOR_HPP_

//eclipse indexer fix
#include "indexer_fix.hpp"

//custom includes
#include "../model/GeneralPose.hpp"

//global includes
#include <vector>
#include <memory>

namespace mae {
	namespace controller {

		template <typename T>
		class IPoseDetector {
			public:
				virtual ~IPoseDetector(){}

				virtual std::shared_ptr<mae::model::GeneralPose> pose(std::shared_ptr<T> skeleton, std::vector<int> bodyParts) = 0;
		};

	} // namespace controller
} // namespace mae

#endif // IPOSEDETECTOR_HPP_
