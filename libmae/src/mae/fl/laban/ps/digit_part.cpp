#include "digit_part.hpp"

namespace mae
{
	namespace fl
	{
		namespace laban
		{
			namespace ps
			{

				digit_part::digit_part(e_digit digit, unsigned int knuckle)
				{
					digit_ = digit;
					knuckle_ = knuckle;

					if (digit == e_digit::INDEXFINGER || digit == e_digit::LITTLEFINGER
							|| digit == e_digit::MIDDLEFINGER || digit == e_digit::RINGFINGER
							|| digit == e_digit::THUMB)
					{
						if (knuckle > 4)
						{
							throw std::invalid_argument(
									"Knuckle must not be greater than 4 since a finger is addressed.");
						}
					}
					else if (digit == e_digit::NONE_DIGIT)
					{
						throw std::invalid_argument("Digit is set to NONE which is invalid.");
					}
					else
					{
						if (knuckle > 3)
						{
							throw std::invalid_argument("Knuckle must not be greater than 3 since a toe is addressed.");
						}
					}
				}

				digit_part::~digit_part()
				{
				}

				e_digit digit_part::get_digit() const
				{
					return digit_;
				}

				unsigned int digit_part::get_knuckle() const
				{
					return knuckle_;
				}

				std::string digit_part::xml(unsigned int indent, std::string namesp) const
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

					//print definition
					sstr << indent_stream.str() << "<" << ns << "digit>" << std::endl;

					//print digit
					sstr << indent_stream.str() << "\t" << "<" << ns << "digit>" << e_digit_c::str(digit_) << "</" << ns
							<< "digit>" << std::endl;

					//print joint
					sstr << indent_stream.str() << "\t" << "<" << ns << "joint>" << knuckle_ << "</" << ns << "joint>"
							<< std::endl;

					sstr << indent_stream.str() << "</" << ns << "digit>" << std::endl;

					return sstr.str();
				}

				std::string digit_part::svg(std::string identifier, double posx, double posy, double width,
						double height, bool left) const
				{
					identifier.append("digit-part");

					if (width > height)
					{
						posx += width-height;
						width = height;
					}
					else
					{
						height = width;
					}

					double radius = height / 16.0;

					std::stringstream sstr;

					sstr << "<path" << std::endl;

					sstr << "d=\"m " << posx << "," << posy << " " << 0 << "," << 3.0 * height / 4.0 <<
                         "  m  " << width << "," << -2 * height / 4.0 << " " << -3 * width / 4.0 << "," << -height / 4.0
						 << "  " << 0 << "," << 3 * height / 4.0 << " " << 3 * width / 4.0 << "," << height / 4.0
                         << " m " << 0 << "," << -3 * height / 16.0 << " " << -3 * width / 4.0 << "," << -height / 4.0
                         << " m " << 0 << "," << -3 * height / 16.0 << " " << 3 * width / 4.0 << "," << height / 4.0
                        << " m " << 0 << "," << -3 * height / 16.0 << " " << -3 * width / 4.0 << "," << -height / 4.0;


                    int digit_increment = 0;

					if (digit_ == e_digit::THUMB)
					{
						identifier.append("-thumb");
					}
					else if (digit_ == e_digit::INDEXFINGER)
					{
						identifier.append("-indexfinger");
                        digit_increment = 1;
					}
                    else if (digit_ == e_digit::MIDDLEFINGER)
                    {
                        identifier.append("-indexfinger");
                        digit_increment = 2;
                    }
                    else if (digit_ == e_digit::RINGFINGER)
                    {
                        identifier.append("-indexfinger");
                        digit_increment = 3;
                    }
                    else if (digit_ == e_digit::LITTLEFINGER)
                    {
                        identifier.append("-indexfinger");
                        digit_increment = 4;
                    }
                    else if (digit_ == e_digit::BIGTOE)
                    {
                        identifier.append("-indexfinger");
                    }
                    else if (digit_ == e_digit::LONGTOE)
                    {
                        identifier.append("-indexfinger");
                        digit_increment = 1;
                    }
                    else if (digit_ == e_digit::MIDDLETOE)
                    {
                        identifier.append("-indexfinger");
                        digit_increment = 2;
                    }
                    else if (digit_ == e_digit::RINGTOE)
                    {
                        identifier.append("-indexfinger");
                        digit_increment = 3;
                    }
                    else if (digit_ == e_digit::LITTLETOE)
                    {
                        identifier.append("-indexfinger");
                        digit_increment = 4;
                    }

					//TODO feet

					if (knuckle_ == 0)
					{
                    	sstr << svg_str_dot(3 * width / 4.0, ((height / 16.0) + (digit_increment * 3 * height / 16.0)), radius);
					}
					else
					{
						sstr << svg_str_dot(0, ((-3 * height / 16.0) + (digit_increment * 3 * height / 16.0)), radius);
					}


					if (knuckle_ >= 3)
					{
						sstr << svg_str_dot(3 * width / 4.0, height / 4.0, radius);
					}

					if (knuckle_ == 3)
					{
						sstr << svg_str_dot(-3 * width / 8.0, -height / 8.0, radius);
					}
					else if (knuckle_ == 4)
					{
						sstr << svg_str_dot(-width / 4.0, -height / 12.0, radius);
						sstr << svg_str_dot(-width / 4.0, -height / 12.0, radius);
					}

                    sstr << "\"" << std::endl;

					//TODO fill style

					if (left)
					{
						//mirror for left hand
						sstr << "transform=\"matrix(-1,0,0,1," << 2 * posx + width << ",0)\"" << std::endl;
					}

					sstr << "\t\t\tid=\"" << identifier << "\"" << std::endl;
					sstr
							<< "\t\t\tstyle=\"fill:none;stroke:#000000;stroke-width:2pt;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\""
							<< std::endl;
					sstr << "\t\t\t/>" << std::endl;

					return sstr.str();
				}

				std::shared_ptr<i_endpoint> digit_part::get_fixed_end() const
				{
					if (knuckle_ == 0)
					{
						if (digit_ == e_digit::INDEXFINGER || digit_ == e_digit::LITTLEFINGER
								|| digit_ == e_digit::MIDDLEFINGER || digit_ == e_digit::RINGFINGER
								|| digit_ == e_digit::THUMB)
						{
							return std::shared_ptr<i_endpoint>(new joint_part(e_joint::HAND));
						}
						else
						{
							return std::shared_ptr<i_endpoint>(new joint_part(e_joint::FOOT));
						}
					}
					else
					{
						return std::shared_ptr<i_endpoint>(new digit_part(digit_, knuckle_-1));
					}
				}

				bool digit_part::equals(std::shared_ptr<i_endpoint> a) const
				{
					if (std::shared_ptr<digit_part> a_casted = std::dynamic_pointer_cast<digit_part>(a))
					{
						return (digit_ == a_casted->get_digit() && knuckle_ == a_casted->get_knuckle());
					}

					return false;
				}

				bool digit_part::equals(std::shared_ptr<i_part> a) const
				{
					if (std::shared_ptr<i_endpoint> a_casted = std::dynamic_pointer_cast<i_endpoint>(a))
					{
						return equals(a_casted);
					}

					return false;
				}

                std::string digit_part::svg_str_dot(double centerx, double centery, double radius) const
                {
                    std::stringstream sstr;

                    //draw circle
                    sstr << " m " << centerx + radius << "," << centery << " a "
                         << radius << "," << radius << " 0 1 1 -" << 2 * radius << ",0 " << radius << ","
                         << radius << " 0 1 1 " << 2 * radius << ",0 z"
							<< " m " << -radius << "," << 0 ;

                    return sstr.str();
                }

			} // namespace ps
		} // namespace laban
	} // namespace fl
} // namespace mae
