//-- i_sequence_listener.i - SWIG interface
 
//-- custom includes 
//...

//-- global includes

%include "std_shared_ptr.i"
%include "stdint.i"

//-- module definition
%module(directors="1") w_i_sequence_listener
%{
	#include "../../../src/mae/i_sequence_listener.hpp"
%}

//-- shared_ptr
//%shared_ptr(mae::i_sequence_listener);
//%shared_ptr(mae::i_sequence_listener<mae::fl::laban::laban_sequence>);

//-- Parse the original header file
%include "../../../src/mae/i_sequence_listener.hpp"

//-- templates
//...

