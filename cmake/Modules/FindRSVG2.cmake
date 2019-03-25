# find librsvg-2.0
#
# exports:
#
#   RSVG2_FOUND
#   RSVG2_INCLUDE_DIRS
#   RSVG2_LIBRARIES
#   RSVG2_VERSION
#

if (DEFINED ENV{VCPKG_ROOT} OR CMAKE_TOOLCHAIN_FILE MATCHES "vcpkg.cmake$" OR WITH_VCPKG)
    #vcpkg is used to find the library

    #TODO use include dirs and libraries instead of ::
    set(PANGO_LIB_SUFFIX 1.0)
    set(GDK_PIXBUF_LIB_SUFFIX 2.0)

    find_package(unofficial-cairo CONFIG REQUIRED)

    # gdk-pixbuf
    find_path(GDK_PIXBUF_INCLUDE_DIR gdk-pixbuf/gdk-pixbuf.h)
    find_library(GDK_PIXBUF_LIBRARY gdk_pixbuf-${GDK_PIXBUF_LIB_SUFFIX})

    # pango
    find_path(PANGO_INCLUDE_DIR pango/pango.h)
    find_library(PANGO_LIBRARY pango-${PANGO_LIB_SUFFIX})
    find_library(PANGO_CAIRO_LIBRARY pangocairo-${PANGO_LIB_SUFFIX})
    find_library(PANGO_WIN32_LIBRARY pangowin32-${PANGO_LIB_SUFFIX})
    set(PANGO_LIBRARIES ${PANGO_LIBRARY} ${PANGO_CAIRO_LIBRARY} ${PANGO_WIN32_LIBRARY})

    if(WIN32 OR APPLE)
        # libintl(gettext)
        find_path(LIBINTL_INCLUDE_DIR libintl.h)
        find_library(LIBINTL_LIBRARY NAMES intl libintl)
    else()
        set(LIBINTL_INCLUDE_DIR)
        set(LIBINTL_LIBRARY)
    endif()

    find_package(unofficial-librsvg CONFIG REQUIRED)

    set(RSVG2_LIBRARIES
        unofficial::librsvg
        unofficial::cairo::cairo
        unofficial::cairo::cairo-gobject
        ${GDK_PIXBUF_LIBRARY}
        ${PANGO_LIBRARIES}
        ${LIBINTL_LIBRARY})
    set(RSVG2_INCLUDE_DIRS ${PANGO_INCLUDE_DIR} ${GDK_PIXBUF_INCLUDE_DIR})
    set(RSVG2_FOUND yes)

    if (RSVG2_FIND_VERSION)
        message(WARNING "Found librsvg using vcpkg. Thus, could not check the version. Will continue anyway.")
    else()
        message(STATUS "Found librsvg using vcpkg.")
    endif()

else()
    include(FindPkgConfig)
    include(FindPackageHandleStandardArgs)

    # Use pkg-config to get hints about paths
    pkg_check_modules(RSVG2_PKGCONF librsvg-2.0)

    if(${RSVG2_PKGCONF_VERSION} VERSION_LESS ${RSVG2_FIND_VERSION_MAJOR}.${RSVG2_FIND_VERSION_MINOR}.${RSVG2_FIND_VERSION_PATCH})

        if (${RSVG2_FIND_REQUIRED})
            message(SEND_ERROR "Library librsvg2 found in version ${RSVG2_PKGCONF_VERSION} but version ${RSVG2_FIND_VERSION_MAJOR}.${RSVG2_FIND_VERSION_MINOR}.${RSVG2_FIND_VERSION_PATCH} is required.")
        else()
            set(RSVG2_LIBRARIES)
            set(RSVG2_INCLUDE_DIRS)
            set(RSVG2_VERSION)
            set(RSVG2_FOUND no)
        endif()
    else()
        # Include dir
        find_path(RSVG2_INCLUDE_DIR
                NAMES librsvg/rsvg.h
                PATHS ${RSVG2_PKGCONF_INCLUDE_DIRS} ${RSVG2_PKGCONF_INCLUDE_DIRS}/librsvg-2.0/
                )

        # Finally the library itself
        find_library(RSVG2_LIBRARY
                NAMES rsvg-2
                PATHS ${RSVG2_PKGCONF_LIBRARY_DIRS}
                )

        FIND_PACKAGE_HANDLE_STANDARD_ARGS(RSVG2 DEFAULT_MSG RSVG2_LIBRARY RSVG2_INCLUDE_DIR)

        if(RSVG2_PKGCONF_FOUND)
            set(RSVG2_LIBRARIES ${RSVG2_LIBRARY} ${RSVG2_PKGCONF_LIBRARIES})
            set(RSVG2_INCLUDE_DIRS ${RSVG2_INCLUDE_DIR} ${RSVG2_PKGCONF_INCLUDE_DIRS})
            set(RSVG2_VERSION ${RSVG2_PKGCONF_VERSION})
            set(RSVG2_FOUND yes)
        else()
            if (${RSVG2_FIND_REQUIRED})
                message(SEND_ERROR "Library librsvg2 not found.")
            else()
                set(RSVG2_LIBRARIES)
                set(RSVG2_INCLUDE_DIRS)
                set(RSVG2_VERSION)
                set(RSVG2_FOUND no)
            endif()
        endif()
    endif()
endif()