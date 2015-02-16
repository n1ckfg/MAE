#!/bin/bash

#TODO specify for each library
LIB="libmae.la"

LIBLA=$(echo $LIB | sed 's/\./_/g')


echo '# autogenerated Makefile.am for automake' > Makefile.am 
echo '# created by prepare_autotools script\n\n' >> Makefile.am 

echo 'noinst_LTLIBRARIES = '$LIB' \n' >> Makefile.am 
echo -n $LIBLA'_SOURCES = ' >> Makefile.am 

# find all source files in the folders src/ and wrappers/ recursively and print them to the Makefile.am
find . -type f \( -path "./src/*" -o -path "./wrappers/*" \)  \( -name *.cpp -o -name *.cxx -o -name *.c -o -name *.cc \) | sed 's/\.\///g' | sed ':a;N;$!ba;s/\n/ \\\n/g' >> Makefile.am 

echo -n '\nnobase_include_HEADERS = ' >> Makefile.am 

# find all header files in the folder include/ recursively and print them to the Makefile.am
find . -type f -path "./include/*"  \( -name *.hpp -o -name *.h \) | sed 's/\.\///g' | sed ':a;N;$!ba;s/\n/ \\\n/g' >> Makefile.am 

echo '\n'$LIBLA'_LIBADD = $(OPENCV_LIBS) $(LIBXMLXX_LIBS)' >> Makefile.am 
echo $LIBLA'_CPPFLAGS = $(OPENCV_CFLAGS) $(LIBXMLXX_CFLAGS)' >> Makefile.am 
echo $LIBLA'_LDFLAGS = -shared' >> Makefile.am 
echo '\nACLOCAL_AMFLAGS = -I m4' >> Makefile.am 
