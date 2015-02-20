#! /bin/sh

#TODO specify for each library
LIB="libmae_eventing.la"
RELEASE='0:1:0'
#current:release:age



# makefile generator code

LIBLA=$(echo $LIB | sed 's/\./_/g')

echo '# autogenerated Makefile.am for automake' > Makefile.am 
echo '# created by prepare_autotools script\n\n' >> Makefile.am 

echo 'pkgconfigdir = $(libdir)/pkgconfig' >> Makefile.am 
echo 'pkgconfig_DATA = libmae_eventing.pc' >> Makefile.am 

echo 'SUBDIRS = include \n' >> Makefile.am 

echo 'lib_LTLIBRARIES = '$LIB' \n' >> Makefile.am 
echo -n $LIBLA'_SOURCES = ' >> Makefile.am 

# find all source files in the folders src/ and wrappers/ recursively and print them to the Makefile.am
find . -type f \( -path "./src/*" -o -path "./wrappers/*" \)  \( -name *.cpp -o -name *.cxx -o -name *.c -o -name *.cc -o -name *.hh \) | sed 's/\.\///g' | sed ':a;N;$!ba;s/\n/ \\\n/g' >> Makefile.am 
#find src/ -type f \( -name *.cpp -o -name *.cxx -o -name *.c -o -name *.cc -o -name *.h -o -name *.hpp \) | sed 's/\.\///g' | sed 's/$/ \\/' >> src/Makefile.am
#find . -type f \( -path "./wrappers/*" \)  \( -name *.cpp -o -name *.cxx -o -name *.c -o -name *.cc -o -name *.h -o -name *.hpp \) | sed 's/\.\//\.\.\//g' | sed ':a;N;$!ba;s/\n/ \\\n/g' >> src/Makefile.am 

echo '\n'$LIBLA'_LIBADD = $(LIBMAE_LIBS) $(LIBXMLXX_LIBS) $(BOOST_ASIO_LIB)' >> Makefile.am 
echo $LIBLA'_CPPFLAGS = $(LIBMAE_CFLAGS) $(LIBXMLXX_CFLAGS) $(BOOST_CPPFLAGS)' >> Makefile.am 
echo $LIBLA'_LDFLAGS = $(BOOST_LDFLAGS) -shared -version-info '$RELEASE >> Makefile.am 
echo '\nACLOCAL_AMFLAGS = -I m4' >> Makefile.am 




# update makefile for includes...

echo -n '\nnobase_include_HEADERS = ' > include/Makefile.am 

# find all header files in the folder include/ recursively and print them to the Makefile.am
find . -type f -path "./include/*"  \( -name *.hpp -o -name *.h \) | sed 's/\.\/include\///g' | sed ':a;N;$!ba;s/\n/ \\\n/g' >> include/Makefile.am 



# create a .pc.in file for pkg config
echo 'prefix=@prefix@' > libmae_eventing.pc.in
echo 'exec_prefix=@exec_prefix@' >> libmae_eventing.pc.in
echo 'libdir=@libdir@' >> libmae_eventing.pc.in
echo 'includedir=@includedir@' >> libmae_eventing.pc.in

echo 'Name: libmae_eventing' >> libmae_eventing.pc.in
echo 'Description: Eventing library of the Movement Analysis Engine (MAE) for analyzing movement using depth sensors and Labanotation.' >> libmae_eventing.pc.in
echo 'URL: https://github.com/furylynx/MAE' >> libmae_eventing.pc.in
echo 'Version: @VERSION@' >> libmae_eventing.pc.in
echo 'Requires: libmae >= 0.9.0, libxml++-2.6 >= 2.6, libboost-system >= 1.5.3' >> libmae_eventing.pc.in
echo 'Libs: -L${libdir} -lmae_eventing' >> libmae_eventing.pc.in
echo 'Cflags: -I${includedir}' >> libmae_eventing.pc.in

