// i_decision_maker.i - SWIG interface
 
//custom includes
 
//global includes
%include "std_shared_ptr.i"
%include "std_string.i"
%include "std_vector.i"
%include "exception.i"


//module definition
%module w_i_decision_maker
%{
	#include "../../../src/mae/fl/laban/i_decision_maker.hpp"
%}

//shared_ptr


//templates


// Parse the original header file
%include "../../../src/mae/fl/laban/i_decision_maker.hpp"