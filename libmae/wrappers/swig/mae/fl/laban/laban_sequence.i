// laban_sequence.i - SWIG interface
 
//custom includes
%include "column_definition.i"
%include "i_movement.i"
%include "e_time_unit.i"


//global includes
//%include "std_shared_ptr.i"
%include "swig_fixed_std_shared_ptr.i"
%include "std_string.i"
%include "std_vector.i"
%include "exception.i"


//module definition
%module(directors="1") w_laban_sequence
%{
	#include "../../../src/mae/fl/laban/laban_sequence.hpp"
%}

//shared_ptr
%shared_ptr(mae::fl::laban::column_definition);
%shared_ptr(mae::fl::laban::i_movement);
%shared_ptr(mae::fl::laban::laban_sequence);

// Parse the original header file
%include "../../../src/mae/fl/laban/laban_sequence.hpp"

//templates
%template (string_vector) std::vector<std::string>;
%template (coldef_vector) std::vector<std::shared_ptr<mae::fl::laban::column_definition> >;
%template (i_mov_vector) std::vector<std::shared_ptr<mae::fl::laban::i_movement> >;
%template (int_vector) std::vector<int>;



