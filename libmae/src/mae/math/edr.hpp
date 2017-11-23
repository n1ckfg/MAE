//
// Created on 2017-11-20
//

#ifndef MAE_MATH_EDR_HPP
#define MAE_MATH_EDR_HPP

//custom includes
#include "i_distance_measure.hpp"

//global includes
#include <memory>
#include <string>
#include <vector>
#include <limits>
#include <cmath>

namespace mae
{
    namespace math
    {
        template<typename T>
        class edr : public i_distance_measure<std::vector<T> >
        {
        public:
            /**
             * Creates a instance for a longest common subsequence using no windowing.
             *
             * @param distance_measure The distance measure for each single element.
             * @param epsilon The threshold for distance comparison for subcosts. Epsilon defines a maximum distance between two elements still seen as matching. If epsilon is zero, elements are only seen as matching when their distance is zero.
             */
            edr(std::shared_ptr<mae::math::i_distance_measure<T> > distance_measure, double epsilon = 0);

            virtual ~edr();

            /**
             * Returns the distance between the two time series.
             *
             * @param element1 The first element to compare.
             * @param element2 The second element to compare.
             */
            virtual double distance(std::vector<T> element1, std::vector<T> element2) const;

        private:
            std::shared_ptr<mae::math::i_distance_measure<T> > distance_measure_;
            double epsilon_;

        };

    } // namespace math
} // namespace mae


//template implementation
namespace mae
{
    namespace math
    {

        template<typename T>
        edr<T>::edr(std::shared_ptr<mae::math::i_distance_measure<T> > distance_measure, double epsilon)
        {
            distance_measure_ = distance_measure;
            epsilon_ = epsilon;
        }

        template<typename T>
        edr<T>::~edr()
        {
        }

        template<typename T>
        double edr<T>::distance(std::vector<T> element1, std::vector<T> element2) const
        {
            std::size_t n = element1.size()+1;
            std::size_t m = element2.size()+1;

            std::vector<std::vector<int> > arr;

            for (std::size_t i = 0; i < n ; i++)
            {
                std::vector<int> row;

                for (std::size_t j = 0; j < m; j++)
                {
                    row.push_back(0);
                }

                arr.push_back(row);
            }

            for (std::size_t i = 1 ; i < n ; i++)
            {
                for (std::size_t j = 1 ; j < m ; j++)
                {
                    int subcost = 0;

                    if (distance_measure_->distance(element1.at(i-1), element2.at(j-1)) > epsilon_)
                    {
                        subcost = 1;
                    }

                    arr.at(i).at(j) = std::min(arr.at(i).at(j-1) + 1, std::min(arr.at(i-1).at(j) + 1, arr.at(i-1).at(j-1) + subcost));
                }
            }

            return arr.at(n-1).at(m-1);
        }


    } // namespace math
} // namespace mae


#endif //MAE_MATH_EDR_HPP
