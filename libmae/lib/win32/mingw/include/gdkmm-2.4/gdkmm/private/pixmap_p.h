// -*- c++ -*-
// Generated by gtkmmproc -- DO NOT MODIFY!
#ifndef _GDKMM_PIXMAP_P_H
#define _GDKMM_PIXMAP_P_H


#include <gdkmm/private/drawable_p.h>

#include <glibmm/class.h>

namespace Gdk
{

class Pixmap_Class : public Glib::Class
{
public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  typedef Pixmap CppObjectType;
  typedef GdkPixmapObject BaseObjectType;
  typedef GdkPixmapObjectClass BaseClassType;
  typedef Gdk::Drawable_Class CppClassParent;
  typedef GdkDrawableClass BaseClassParent;

  friend class Pixmap;
#endif /* DOXYGEN_SHOULD_SKIP_THIS */

  const Glib::Class& init();


  static void class_init_function(void* g_class, void* class_data);

  static Glib::ObjectBase* wrap_new(GObject*);

protected:

  //Callbacks (default signal handlers):
  //These will call the *_impl member methods, which will then call the existing default signal callbacks, if any.
  //You could prevent the original default signal handlers being called by overriding the *_impl method.

  //Callbacks (virtual functions):
};


} // namespace Gdk


#endif /* _GDKMM_PIXMAP_P_H */

