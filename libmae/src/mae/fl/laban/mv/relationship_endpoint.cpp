#include "relationship_endpoint.hpp"

namespace mae
{
	namespace fl
	{
		namespace laban
		{
			namespace mv
			{

				relationship_endpoint::relationship_endpoint(int column, bool active, std::shared_ptr<ps::i_pre_sign> pre_sign, std::shared_ptr<i_dynamics_sign> dynamics)
				{
					column_ = column;
					pre_sign_ = pre_sign;
					dynamics_ = dynamics;
					active_ = active;
				}

				relationship_endpoint::~relationship_endpoint()
				{
				}

				int relationship_endpoint::get_column() const
				{
					return column_;
				}

				std::shared_ptr<ps::i_pre_sign> relationship_endpoint::get_pre_sign() const
				{
					return pre_sign_;
				}

				std::shared_ptr<i_dynamics_sign> relationship_endpoint::get_dynamics() const
				{
					return dynamics_;
				}

				bool relationship_endpoint::get_active() const
				{
					return active_;
				}

				std::string relationship_endpoint::xml(unsigned int indent, std::string namesp) const
				{
					std::stringstream indent_stream;

					for (unsigned int i = 0; i < indent; i++)
					{
						indent_stream << "\t";
					}

					std::string ns = namesp;
					if (ns.size() > 0 && ns.at(ns.size()-1) != ':')
					{
						ns.push_back(':');
					}

					std::stringstream sstr;

					//print accent sign
					sstr << indent_stream.str() << "<" << ns << "column>" << column_ << "</" << ns << "column>" << std::endl;

					if (pre_sign_ != nullptr)
					{
						sstr << pre_sign_->xml(indent, namesp);
					}

					if (dynamics_ != nullptr)
					{
						sstr << dynamics_->xml(indent, namesp);
					}

					sstr << indent_stream.str() << "\t" << "<" << ns << "active>" << active_ << "</" << ns << "active>" << std::endl;

					return sstr.str();
				}

				std::shared_ptr<relationship_endpoint> relationship_endpoint::recreate(std::map<int, int> column_mapping) const
				{
					std::shared_ptr<relationship_endpoint> result;

					int column = column_;

					if (column_mapping.find(column_) != column_mapping.end())
					{
						column = column_mapping.at(column_);
					}

					result = std::shared_ptr<relationship_endpoint>(new relationship_endpoint(column, active_, pre_sign_, dynamics_));

					return result;
				}

				bool relationship_endpoint::equals(std::shared_ptr<relationship_endpoint> a) const
				{
					return column_ == a->get_column() && active_ == a->get_active() && pre_sign_->equals(a->get_pre_sign()) && dynamics_->equals(a->get_dynamics());
				}

			} // namespace mv
		} // namespace laban
	} // namespace fl
} // namespace mae
