/*
 * labanmovement.cpp
 *
 *  Created on: 07.07.2014
 *      Author: keks
 */

#include "movement.hpp"

namespace mae
{
	namespace fl
	{
		namespace laban
		{

			movement::movement(int column, unsigned int measure, double beat, double duration,
					std::shared_ptr<mv::i_symbol> symbol, bool hold, std::shared_ptr<ps::i_pre_sign> pre_sign)
			{
				column_ = column;
				measure_ = measure;
				beat_ = beat;
				duration_ = duration;
				pre_sign_ = pre_sign;
				hold_ = hold;
				symbol_ = symbol;

				if (beat < 0 || duration < 0)
				{
					throw std::invalid_argument("Beat and duration must not be negative.");
				}

				if (symbol == nullptr)
				{
					throw std::invalid_argument("Symbol must not be null.");
				}
			}

			movement::~movement()
			{
			}

			int movement::get_column() const
			{
				return column_;
			}

			unsigned int movement::get_measure() const
			{
				return measure_;
			}

			double movement::get_beat() const
			{
				return beat_;
			}

			double movement::get_duration() const
			{
				return duration_;
			}

			std::shared_ptr<ps::i_pre_sign> movement::get_pre_sign() const
			{
				return pre_sign_;
			}

			bool movement::get_hold() const
			{
				return hold_;
			}

			std::shared_ptr<mv::i_symbol> movement::get_symbol() const
			{
				return symbol_;
			}

			bool movement::equals(std::shared_ptr<i_movement> a) const
			{
				return (column_ == a->get_column() && measure_ == a->get_measure() && beat_ == a->get_beat()
						&& duration_ == a->get_duration() && symbol_equals(a));
			}

			bool movement::symbol_equals(std::shared_ptr<i_movement> a) const
			{
				if (std::shared_ptr<movement> a_mov = std::dynamic_pointer_cast<movement>(a))
				{
					return (a_mov->get_symbol()->equals(symbol_) && a_mov->get_hold() == hold_
							&& ((a_mov->get_pre_sign() == nullptr && pre_sign_ == nullptr)
									|| (a_mov->get_pre_sign() != nullptr && a_mov->get_pre_sign()->equals(pre_sign_))));
				}
				else
				{
					return false;
				}
			}

			std::string movement::xml(unsigned int indent, std::string namesp) const
			{
				std::stringstream indent_stream;

				for (unsigned int i = 0; i < indent; i++)
				{
					indent_stream << "\t";
				}

				std::string ns = namesp;
				if (ns.size() > 0 && ns.at(ns.size() - 1) != ':')
				{
					ns.push_back(':');
				}

				std::stringstream sstr;

				//set fixed decimals and precision
				sstr << std::fixed << std::setprecision(2);

				//print definition
				sstr << indent_stream.str() << "<" << ns << "movement>" << std::endl;

				sstr << indent_stream.str() << "\t" << "<" << ns << "column>" << column_ << "</" << ns << "column>"
						<< std::endl;
				sstr << indent_stream.str() << "\t" << "<" << ns << "measure>" << measure_ << "</" << ns << "measure>"
						<< std::endl;
				sstr << indent_stream.str() << "\t" << "<" << ns << "beat>" << beat_ << "</" << ns << "beat>"
						<< std::endl;
				sstr << indent_stream.str() << "\t" << "<" << ns << "duration>" << duration_ << "</" << ns
						<< "duration>" << std::endl;

				if (pre_sign_ != nullptr)
				{
					sstr << pre_sign_->xml(indent + 1, namesp);
				}

				sstr << indent_stream.str() << "\t" << "<" << ns << "hold>" << std::boolalpha << hold_
						<< std::noboolalpha << "</" << ns << "hold>" << std::endl;

				sstr << symbol_->xml(indent + 1, namesp);

				//close movement
				sstr << indent_stream.str() << "</" << ns << "movement>" << std::endl;

				return sstr.str();
			}

			std::string movement::svg(unsigned int im_width, unsigned int im_height, unsigned int max_column, unsigned int measures, unsigned int beats_per_measure) const
			{
				std::stringstream sstr;

				int total_beats = measures * beats_per_measure;
				double column_width = (im_width)/(max_column * 2.0);
				double beat_height = (im_height - 5) / total_beats;

				int draw_w = (int)(column_width / 2);
				int draw_x_pos = (int)((im_width / 2.0) + ((column_ - (mae::math::math::sign(column_)*0.5) - 0.25)*column_width));

				int draw_y_pos = 0;
				int draw_h = 0;

				if (measure_ != 0)
				{
					draw_y_pos = (int) (im_height - (measure_ * beats_per_measure + beat_
															+ duration_) * beat_height) - 5;
					draw_h = (int) (beat_height * duration_);
				}
				else
				{
					draw_y_pos = (int) (im_height - (measure_ * beats_per_measure + beat_
						+ beats_per_measure) * beat_height);
					draw_h = (int) (beat_height * beats_per_measure);
				}


				std::stringstream id_sstr;
				id_sstr << "movement-" << column_ << "-" << measure_ << "-" << beat_ ;
				std::string identifier = id_sstr.str();

				sstr << symbol_->svg(identifier, draw_x_pos, draw_y_pos, draw_w, draw_h, (column_ < 0));

				return sstr.str();
			}

			std::shared_ptr<i_movement> movement::recreate(std::map<int, int> column_mapping, unsigned int measure,
					double beat, double duration) const
			{
				std::shared_ptr<i_movement> result;

				int column = column_;

				if (column_mapping.find(column_) != column_mapping.end())
				{
					column = column_mapping.at(column_);
				}

				result = std::shared_ptr<i_movement>(
						new movement(column, measure, beat, duration, symbol_, hold_, pre_sign_));

				return result;
			}

			std::string movement::str() const
			{
				std::stringstream sstr;

				sstr << "movement: [c" << column_ << ",m" << measure_ << ",b" << beat_ << ",d" << duration_ << ",h"
						<< hold_ << "] " << symbol_;

				return sstr.str();
			}

		} // namespace laban
	} // namespace fl
} // namespace mae
