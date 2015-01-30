// -*- c++ -*-
// Generated by gtkmmproc -- DO NOT MODIFY!
#ifndef _GTKMM_CURVE_P_H
#define _GTKMM_CURVE_P_H
#ifndef GTKMM_DISABLE_DEPRECATED


#include <gtkmm/private/drawingarea_p.h>
#include <gtkmm/private/box_p.h>

#include <glibmm/class.h>

namespace Gtk
{

class Curve_Class : public Glib::Class
{
public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  typedef Curve CppObjectType;
  typedef GtkCurve BaseObjectType;
  typedef GtkCurveClass BaseClassType;
  typedef Gtk::DrawingArea_Class CppClassParent;
  typedef GtkDrawingAreaClass BaseClassParent;

  friend class Curve;
#endif /* DOXYGEN_SHOULD_SKIP_THIS */

  const Glib::Class& init();


  static void class_init_function(void* g_class, void* class_data);

  static Glib::ObjectBase* wrap_new(GObject*);

protected:

  //Callbacks (default signal handlers):
  //These will call the *_impl member methods, which will then call the existing default signal callbacks, if any.
  //You could prevent the original default signal handlers being called by overriding the *_impl method.
  static void curve_type_changed_callback(GtkCurve* self);

  //Callbacks (virtual functions):
};


} // namespace Gtk


#include <glibmm/class.h>

namespace Gtk
{

class GammaCurve_Class : public Glib::Class
{
public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  typedef GammaCurve CppObjectType;
  typedef GtkGammaCurve BaseObjectType;
  typedef GtkGammaCurveClass BaseClassType;
  typedef Gtk::VBox_Class CppClassParent;
  typedef GtkVBoxClass BaseClassParent;

  friend class GammaCurve;
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


} // namespace Gtk

#endif // GTKMM_DISABLE_DEPRECATED


#endif /* _GTKMM_CURVE_P_H */

