/*
 * space_measurement.cpp
 *
 *  Created on: 10.07.2014
 *      Author: keks
 */

#include "space_measurement.hpp"

namespace mae
{
	namespace fl
	{
		namespace laban
		{
			namespace mv
			{

				space_measurement::space_measurement(e_space type, unsigned int degree, e_space_direction direction)
				{
					type_ = type;
					degree_ = degree;
					direction_ = direction;

//					if (type_ == e_space::NONE_SPACE)
//					{
//						throw std::invalid_argument("Type must not be NONE.");
//					}
				}

				space_measurement::~space_measurement()
				{
				}

				e_space space_measurement::get_type() const
				{
					return type_;
				}

				unsigned int space_measurement::get_degree() const
				{
					return degree_;
				}

				e_space_direction space_measurement::get_direction() const
				{
					return direction_;
				}

				bool space_measurement::equals(std::shared_ptr<i_degree_sign> a) const
				{
					if (std::shared_ptr<space_measurement> a_space = std::dynamic_pointer_cast<space_measurement>(a))
					{
						if (type_ == a_space->get_type() && degree_ == a_space->get_degree()
								&& direction_ == a_space->get_direction())
						{
							return true;
						}
					}

					return false;
				}

				std::string space_measurement::xml(unsigned int indent, std::string namesp, bool print_type) const
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

					std::string type_indent = indent_stream.str();

					if (print_type)
					{
						indent_stream << "\t";
						sstr << type_indent << "<" << ns << "qualitative>" << std::endl;
					}
					else
					{
						sstr << indent_stream.str() << "<" << ns << "spaceMeasurement>" << std::endl;
					}

					//print accent sign
					sstr << indent_stream.str() << "\t" << "<" << ns << "type>" << e_space_c::str(type_) << "</" << ns
							<< "type>" << std::endl;
					sstr << indent_stream.str() << "\t" << "<" << ns << "degree>" << degree_ << "</" << ns << "degree>"
							<< std::endl;

					if (direction_ != e_space_direction::NONE_SPACE_DIRECTION)
					{
						sstr << indent_stream.str() << "\t" << "<" << ns << "direction>"
								<< e_space_direction_c::str(direction_) << "</" << ns << "direction>" << std::endl;
					}

					if (print_type)
					{
						sstr << type_indent << "</" << ns << "qualitative>" << std::endl;
					}
					else
					{
						sstr << indent_stream.str() << "</" << ns << "spaceMeasurement>" << std::endl;
					}

					return sstr.str();
				}

				std::string space_measurement::svg(std::string identifier, double posx, double posy, double width,
						double height, bool left) const
				{
					identifier.append("-spacemeasurement");

					std::stringstream sstr;

					if (width > height)
					{
						posx += (width - height) / 2.0;
						width = height;
					}
					else if (height > width)
					{
						posy += (height - width) / 2.0;
						height = width;
					}

					double udot_posx = posx + width / 2.0;
					double udot_posy = posy + height * 0.1;
					double ldot_posx = posx + width / 2.0;
					double ldot_posy = posy + height * 0.9;

					if (type_ == e_space::NONE_SPACE)
					{
						sstr << "\t\t<path" << std::endl;
						sstr << "\t\t\td=\"m " << posx << "," << posy << " " << 0 << "," << height << " " << width
								<< "," << -height << " " << 0 << "," << height << " m  " << -width / 4.0 << ","
								<< -height / 4.0 << " " << -width / 2.0 << "," << -height / 2.0 << "\"" << std::endl;
						sstr << "\t\t\tid=\"" << identifier << "-line\"" << std::endl;
						sstr
								<< "\t\t\tstyle=\"fill:none;fill-opacity:1;stroke:#000000;stroke-width:2pt;stroke-miterlimit:4;stroke-opacity:1;stroke-dasharray:none";
						sstr << "\" />" << std::endl;
					}
					else if (type_ == e_space::UNFOLDING)
					{
						sstr << "\t\t<path" << std::endl;
						sstr << "\t\t\td=\"m " << posx + width / 8.0 << "," << posy + height << " " << 3 * width / 8.0
								<< "," << -height << " " << 3 * width / 8.0 << "," << height << " m " << width / 8.0
								<< "," << -height / 6.0 << " " << -width << "," << 0 << "\"" << std::endl;
						sstr << "\t\t\tid=\"" << identifier << "-line\"" << std::endl;
						sstr
								<< "\t\t\tstyle=\"fill:none;fill-opacity:1;stroke:#000000;stroke-width:2pt;stroke-miterlimit:4;stroke-opacity:1;stroke-dasharray:none";
						sstr << "\" />" << std::endl;
					}
					else if (type_ == e_space::NARROW)
					{
						if (degree_ <= 3)
						{
							sstr << "\t\t<path" << std::endl;
							sstr << "\t\t\td=\"m " << posx << "," << posy << " " << width << "," << height << " m " << 0
									<< "," << -height << "" << -width << "," << height << "\"" << std::endl;
							sstr << "\t\t\tid=\"" << identifier << "-line\"" << std::endl;
							sstr
									<< "\t\t\tstyle=\"fill:none;fill-opacity:1;stroke:#000000;stroke-width:2pt;stroke-miterlimit:4;stroke-opacity:1;stroke-dasharray:none";
							sstr << "\" />" << std::endl;
						}
						else
						{
							sstr << "\t\t<path" << std::endl;
							sstr << "\t\t\td=\"m " << posx + 0.1 * width << "," << posy << " " << width * 0.9 << ","
									<< height * 0.9 << " m " << -0.1 * width << "," << -height * 0.9 << ""
									<< -width * 0.9 << "," << height * 0.9 << " m " << 0 << "," << -height * 0.8 << " "
									<< width * 0.9 << "," << height * 0.9 << " m " << 0.1 * width << ","
									<< -height * 0.9 << "" << -width * 0.9 << "," << height * 0.9 << "\"" << std::endl;
							sstr << "\t\t\tid=\"" << identifier << "-line\"" << std::endl;
							sstr
									<< "\t\t\tstyle=\"fill:none;fill-opacity:1;stroke:#000000;stroke-width:2pt;stroke-miterlimit:4;stroke-opacity:1;stroke-dasharray:none";
							sstr << "\" />" << std::endl;
						}
					}
					else if (type_ == e_space::WIDE)
					{

					}
					else if (type_ == e_space::FOLDING)
					{

					}
					else if (type_ == e_space::JOINING)
					{

					}
					else if (type_ == e_space::SPREADING)
					{

					}

					if (degree_ % 3 != 1)
					{
						//TODO draw upper dot
					}

					if (degree_ % 3 == 0)
					{
						//TODO draw lower dot
					}

					//TODO

					return sstr.str();
				}

				std::string space_measurement::str() const
				{
					std::stringstream sstr;

					sstr << "(" << e_space_c::str(type_) << "+" << degree_ << ")";

					return sstr.str();
				}

			} // namespace mv
		} // namespace laban
	} // namespace fl
} // namespace mae
