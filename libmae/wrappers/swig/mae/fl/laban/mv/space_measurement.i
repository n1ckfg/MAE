//-- space_measurement.i - SWIG interface

//-- custom includes
%include "i_degree_sign.i"
%include "e_space.i"
%include "e_space_direction.i"

//-- global includes

%include "std_shared_ptr.i"
%include "std_string.i"
%include "exception.i"


//-- module definition
%module(directors="1") w_space_measurement
%{
	#include "../../../src/mae/fl/laban/mv/space_measurement.hpp"
%}

//-- shared_ptr
%shared_ptr(mae::fl::laban::mv::i_degree_sign);
%shared_ptr(mae::fl::laban::mv::space_measurement);

//-- cast method
%extend mae::fl::laban::mv::space_measurement {
  static std::shared_ptr<mae::fl::laban::mv::space_measurement> cast_to_space_measurement(std::shared_ptr<mae::fl::laban::mv::i_degree_sign> base) {
    return std::dynamic_pointer_cast<mae::fl::laban::mv::space_measurement>(base);
  }
}

//-- Parse the original header file
%include "../../../src/mae/fl/laban/mv/space_measurement.hpp"

//-- templates
//...
