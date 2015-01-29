// -*- c++ -*-
// Generated by gtkmmproc -- DO NOT MODIFY!
#ifndef _GTKMM_TEXTVIEW_P_H
#define _GTKMM_TEXTVIEW_P_H


#include <gtkmm/private/container_p.h>

#include <glibmm/class.h>

namespace Gtk
{

class TextView_Class : public Glib::Class
{
public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  typedef TextView CppObjectType;
  typedef GtkTextView BaseObjectType;
  typedef GtkTextViewClass BaseClassType;
  typedef Gtk::Container_Class CppClassParent;
  typedef GtkContainerClass BaseClassParent;

  friend class TextView;
#endif /* DOXYGEN_SHOULD_SKIP_THIS */

  const Glib::Class& init();


  static void class_init_function(void* g_class, void* class_data);

  static Glib::ObjectBase* wrap_new(GObject*);

protected:

  //Callbacks (default signal handlers):
  //These will call the *_impl member methods, which will then call the existing default signal callbacks, if any.
  //You could prevent the original default signal handlers being called by overriding the *_impl method.
  static void set_scroll_adjustments_callback(GtkTextView* self, GtkAdjustment* p0, GtkAdjustment* p1);
  static void populate_popup_callback(GtkTextView* self, GtkMenu* p0);
  static void set_anchor_callback(GtkTextView* self);
  static void insert_at_cursor_callback(GtkTextView* self, const gchar* p0);

  //Callbacks (virtual functions):
};


} // namespace Gtk


#endif /* _GTKMM_TEXTVIEW_P_H */

