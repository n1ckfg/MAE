// -*- c++ -*-
// Generated by gtkmmproc -- DO NOT MODIFY!
#ifndef _GTKMM_CELLRENDERERPIXBUF_H
#define _GTKMM_CELLRENDERERPIXBUF_H


#include <glibmm.h>

/* $Id: cellrendererpixbuf.hg,v 1.4 2006/05/10 20:59:27 murrayc Exp $ */

/* cellrenderertext.h
 * 
 * Copyright (C) 1998-2002 The gtkmm Development Team
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

#include <gtkmm/cellrenderer.h>
#include <giomm/icon.h>


#ifndef DOXYGEN_SHOULD_SKIP_THIS
typedef struct _GtkCellRendererPixbuf GtkCellRendererPixbuf;
typedef struct _GtkCellRendererPixbufClass GtkCellRendererPixbufClass;
#endif /* DOXYGEN_SHOULD_SKIP_THIS */


namespace Gtk
{ class CellRendererPixbuf_Class; } // namespace Gtk
namespace Gtk
{

/** Renders a pixbuf in a cell.
 * A CellRendererPixbuf can be used to render an image in a cell. It allows you to render either a 
 * given Pixbuf (set via the pixbuf property) or a stock icon (set via the stock_id property).
 *
 * To support the tree view, CellRendererPixbuf also supports rendering two alternative pixbufs, when 
 * the is_expanded property is true. If the is_expanded property is true and the pixbuf_expander_open 
 * property is set to a pixbuf, it renders that pixbuf. If the is_expanded property is false and the *
 * pixbuf_expander_closed property is set to a pixbuf, it renders that one.
 *
 * @ingroup TreeView
 */

class CellRendererPixbuf : public CellRenderer
{
  public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  typedef CellRendererPixbuf CppObjectType;
  typedef CellRendererPixbuf_Class CppClassType;
  typedef GtkCellRendererPixbuf BaseObjectType;
  typedef GtkCellRendererPixbufClass BaseClassType;
#endif /* DOXYGEN_SHOULD_SKIP_THIS */

  virtual ~CellRendererPixbuf();

#ifndef DOXYGEN_SHOULD_SKIP_THIS

private:
  friend class CellRendererPixbuf_Class;
  static CppClassType cellrendererpixbuf_class_;

  // noncopyable
  CellRendererPixbuf(const CellRendererPixbuf&);
  CellRendererPixbuf& operator=(const CellRendererPixbuf&);

protected:
  explicit CellRendererPixbuf(const Glib::ConstructParams& construct_params);
  explicit CellRendererPixbuf(GtkCellRendererPixbuf* castitem);

#endif /* DOXYGEN_SHOULD_SKIP_THIS */

public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  static GType get_type()      G_GNUC_CONST;


  static GType get_base_type() G_GNUC_CONST;
#endif

  ///Provides access to the underlying C GtkObject.
  GtkCellRendererPixbuf*       gobj()       { return reinterpret_cast<GtkCellRendererPixbuf*>(gobject_); }

  ///Provides access to the underlying C GtkObject.
  const GtkCellRendererPixbuf* gobj() const { return reinterpret_cast<GtkCellRendererPixbuf*>(gobject_); }


public:
  //C++ methods used to invoke GTK+ virtual functions:

protected:
  //GTK+ Virtual Functions (override these to change behaviour):

  //Default Signal Handlers::


private:

public:

  CellRendererPixbuf();

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** The pixbuf to render.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy< Glib::RefPtr<Gdk::Pixbuf> > property_pixbuf() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** The pixbuf to render.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly< Glib::RefPtr<Gdk::Pixbuf> > property_pixbuf() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Pixbuf for open expander.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy< Glib::RefPtr<Gdk::Pixbuf> > property_pixbuf_expander_open() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Pixbuf for open expander.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly< Glib::RefPtr<Gdk::Pixbuf> > property_pixbuf_expander_open() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Pixbuf for closed expander.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy< Glib::RefPtr<Gdk::Pixbuf> > property_pixbuf_expander_closed() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Pixbuf for closed expander.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly< Glib::RefPtr<Gdk::Pixbuf> > property_pixbuf_expander_closed() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** The stock ID of the stock icon to render.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<Glib::ustring> property_stock_id() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** The stock ID of the stock icon to render.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<Glib::ustring> property_stock_id() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** The GtkIconSize value that specifies the size of the rendered icon.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<guint> property_stock_size() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** The GtkIconSize value that specifies the size of the rendered icon.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<guint> property_stock_size() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Render detail to pass to the theme engine.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<Glib::ustring> property_stock_detail() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Render detail to pass to the theme engine.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<Glib::ustring> property_stock_detail() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** The name of the icon from the icon theme.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<Glib::ustring> property_icon_name() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** The name of the icon from the icon theme.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<Glib::ustring> property_icon_name() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Whether the rendered pixbuf should be colorized according to the state.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<bool> property_follow_state() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Whether the rendered pixbuf should be colorized according to the state.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<bool> property_follow_state() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** The GIcon being displayed.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy< Glib::RefPtr<Gio::Icon> > property_gicon() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** The GIcon being displayed.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly< Glib::RefPtr<Gio::Icon> > property_gicon() const;
#endif //#GLIBMM_PROPERTIES_ENABLED


  virtual Glib::PropertyProxy_Base _property_renderable();


};

} /* namespace Gtk */


namespace Glib
{
  /** A Glib::wrap() method for this object.
   * 
   * @param object The C instance.
   * @param take_copy False if the result should take ownership of the C instance. True if it should take a new copy or ref.
   * @result A C++ instance that wraps this C instance.
   *
   * @relates Gtk::CellRendererPixbuf
   */
  Gtk::CellRendererPixbuf* wrap(GtkCellRendererPixbuf* object, bool take_copy = false);
} //namespace Glib


#endif /* _GTKMM_CELLRENDERERPIXBUF_H */

