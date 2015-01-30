// -*- c++ -*-
// Generated by gtkmmproc -- DO NOT MODIFY!
#ifndef _GTKMM_RECENTCHOOSERWIDGET_H
#define _GTKMM_RECENTCHOOSERWIDGET_H


#include <glibmm.h>

/* Copyright (C) 2006 The gtkmm Development Team
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

#include <gtkmm/box.h>
#include <gtkmm/recentchooser.h>


#ifndef DOXYGEN_SHOULD_SKIP_THIS
typedef struct _GtkRecentChooserWidget GtkRecentChooserWidget;
typedef struct _GtkRecentChooserWidgetClass GtkRecentChooserWidgetClass;
#endif /* DOXYGEN_SHOULD_SKIP_THIS */


namespace Gtk
{ class RecentChooserWidget_Class; } // namespace Gtk
namespace Gtk
{

/** RecentChooserWidget is a widget suitable for selecting recently used
 * files.  It is the main building block of a RecentChooserDialog. Most
 * applications will only need to use the latter; you can use
 * RecentChooserWidget as part of a larger window if you have special needs.
 *
 * Note that RecentChooserWidget does not have any methods of its own.
 * Instead, you should use the functions that work on a RecentChooser.
 *
 * @newin{2,10}
 *
 * @ingroup RecentFiles
 */

class RecentChooserWidget
: public VBox,
  public RecentChooser
{
  public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  typedef RecentChooserWidget CppObjectType;
  typedef RecentChooserWidget_Class CppClassType;
  typedef GtkRecentChooserWidget BaseObjectType;
  typedef GtkRecentChooserWidgetClass BaseClassType;
#endif /* DOXYGEN_SHOULD_SKIP_THIS */

  virtual ~RecentChooserWidget();

#ifndef DOXYGEN_SHOULD_SKIP_THIS

private:
  friend class RecentChooserWidget_Class;
  static CppClassType recentchooserwidget_class_;

  // noncopyable
  RecentChooserWidget(const RecentChooserWidget&);
  RecentChooserWidget& operator=(const RecentChooserWidget&);

protected:
  explicit RecentChooserWidget(const Glib::ConstructParams& construct_params);
  explicit RecentChooserWidget(GtkRecentChooserWidget* castitem);

#endif /* DOXYGEN_SHOULD_SKIP_THIS */

public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  static GType get_type()      G_GNUC_CONST;


  static GType get_base_type() G_GNUC_CONST;
#endif

  ///Provides access to the underlying C GtkObject.
  GtkRecentChooserWidget*       gobj()       { return reinterpret_cast<GtkRecentChooserWidget*>(gobject_); }

  ///Provides access to the underlying C GtkObject.
  const GtkRecentChooserWidget* gobj() const { return reinterpret_cast<GtkRecentChooserWidget*>(gobject_); }


public:
  //C++ methods used to invoke GTK+ virtual functions:

protected:
  //GTK+ Virtual Functions (override these to change behaviour):

  //Default Signal Handlers::


private:

  
public:
  RecentChooserWidget();
  
  explicit RecentChooserWidget(const Glib::RefPtr<RecentManager>& recent_manager);


};

} // namespace Gtk


namespace Glib
{
  /** A Glib::wrap() method for this object.
   * 
   * @param object The C instance.
   * @param take_copy False if the result should take ownership of the C instance. True if it should take a new copy or ref.
   * @result A C++ instance that wraps this C instance.
   *
   * @relates Gtk::RecentChooserWidget
   */
  Gtk::RecentChooserWidget* wrap(GtkRecentChooserWidget* object, bool take_copy = false);
} //namespace Glib


#endif /* _GTKMM_RECENTCHOOSERWIDGET_H */

