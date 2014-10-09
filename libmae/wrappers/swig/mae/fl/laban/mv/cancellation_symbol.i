// cancellation_symbol.i - SWIG interface

//custom includes
%include "i_symbol.i"
%include "e_cancel.i"

//global includes
%include "std_shared_ptr.i"
%include "std_string.i"
%include "exception.i"


//module definition
%module w_cancellation_symbol
%{
	#include "../../../src/mae/fl/laban/mv/cancellation_symbol.hpp"
%}

//shared_ptr
%shared_ptr(mae::fl::laban::mv::i_symbol);
%shared_ptr(mae::fl::laban::mv::cancellation_symbol);

//templates

// Parse the original header file
%include "../../../src/mae/fl/laban/mv/cancellation_symbol.hpp"