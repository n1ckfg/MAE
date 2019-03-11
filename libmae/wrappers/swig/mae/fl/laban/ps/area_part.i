//-- area_part.i - SWIG interface
 
//-- custom includes
%include "i_part.i"
%include "i_endpoint.i"
%include "e_area.i"

//-- global includes

%include "std_shared_ptr_fix.i"
%include "std_string.i"
%include "exception.i"

//-- module definition
%module(directors="1") w_area_part
%{
	#include "../../../src/mae/fl/laban/ps/area_part.hpp"
%}

//-- shared_ptr
%shared_ptr(mae::fl::laban::ps::i_part);
%shared_ptr(mae::fl::laban::ps::i_endpoint);
%shared_ptr(mae::fl::laban::ps::area_part);

//-- cast method
%extend mae::fl::laban::ps::area_part 
{
  static std::shared_ptr<mae::fl::laban::ps::area_part > cast_to_area_part(std::shared_ptr<mae::fl::laban::ps::i_part> base) 
  {
    return std::dynamic_pointer_cast<mae::fl::laban::ps::area_part>(base);
  }
}

//-- Parse the original header file
%include "../../../src/mae/fl/laban/ps/area_part.hpp"

//-- templates
//...
