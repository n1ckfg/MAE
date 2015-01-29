// -*- c++ -*-
// Generated by gtkmmproc -- DO NOT MODIFY!
#ifndef _GTKMM_IMAGE_H
#define _GTKMM_IMAGE_H


#include <glibmm.h>

/* $Id: image.hg,v 1.9 2006/04/12 11:11:25 murrayc Exp $ */

/* image.h
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

#include <gtkmm/misc.h>
#include <gtkmm/iconset.h>
#include <gdkmm/pixbufanimation.h>
#include <giomm/icon.h>


#ifndef DOXYGEN_SHOULD_SKIP_THIS
typedef struct _GtkImage GtkImage;
typedef struct _GtkImageClass GtkImageClass;
#endif /* DOXYGEN_SHOULD_SKIP_THIS */


namespace Gtk
{ class Image_Class; } // namespace Gtk
namespace Gtk
{


/** @addtogroup gtkmmEnums gtkmm Enums and Flags */

/**
 * @ingroup gtkmmEnums
 */
enum ImageType
{
  IMAGE_EMPTY,
  IMAGE_PIXMAP,
  IMAGE_IMAGE,
  IMAGE_PIXBUF,
  IMAGE_STOCK,
  IMAGE_ICON_SET,
  IMAGE_ANIMATION,
  IMAGE_ICON_NAME,
  IMAGE_GICON
};

} // namespace Gtk


#ifndef DOXYGEN_SHOULD_SKIP_THIS
namespace Glib
{

template <>
class Value<Gtk::ImageType> : public Glib::Value_Enum<Gtk::ImageType>
{
public:
  static GType value_type() G_GNUC_CONST;
};

} // namespace Glib
#endif /* DOXYGEN_SHOULD_SKIP_THIS */


namespace Gtk
{


/** A widget displaying an image.
 *
 * The Gtk::Image widget displays an image. Various kinds of object can be
 * displayed as an image; most typically, you would load a Gdk::Pixbuf ("pixel
 * buffer") from a file, and then display that. 
 *
 * Gtk::Image is a subclass of Gtk::Misc, which implies that you can align it
 * (center, left, right) and add padding to it, using Gtk::Misc methods.
 *
 * Gtk::Image is a "no window" widget (has no Gdk::Window of its own), so by
 * default does not receive events. If you want to receive events on the
 * image, such as button clicks, place the image inside a Gtk::EventBox, then
 * connect to the event signals on the event box. 
 *
 * The Image widget looks like this:
 * @image html image1.png
 *
 * @ingroup Widgets
 */

class Image : public Misc
{
  public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  typedef Image CppObjectType;
  typedef Image_Class CppClassType;
  typedef GtkImage BaseObjectType;
  typedef GtkImageClass BaseClassType;
#endif /* DOXYGEN_SHOULD_SKIP_THIS */

  virtual ~Image();

#ifndef DOXYGEN_SHOULD_SKIP_THIS

private:
  friend class Image_Class;
  static CppClassType image_class_;

  // noncopyable
  Image(const Image&);
  Image& operator=(const Image&);

protected:
  explicit Image(const Glib::ConstructParams& construct_params);
  explicit Image(GtkImage* castitem);

#endif /* DOXYGEN_SHOULD_SKIP_THIS */

public:
#ifndef DOXYGEN_SHOULD_SKIP_THIS
  static GType get_type()      G_GNUC_CONST;


  static GType get_base_type() G_GNUC_CONST;
#endif

  ///Provides access to the underlying C GtkObject.
  GtkImage*       gobj()       { return reinterpret_cast<GtkImage*>(gobject_); }

  ///Provides access to the underlying C GtkObject.
  const GtkImage* gobj() const { return reinterpret_cast<GtkImage*>(gobject_); }


public:
  //C++ methods used to invoke GTK+ virtual functions:

protected:
  //GTK+ Virtual Functions (override these to change behaviour):

  //Default Signal Handlers::


private:

  
public:

  Image();

  //TODO: The C documentation says that the constructor parameters can be NULL. Choose sensible method overloads.

  /** Creates an Image widget displaying @a pixmap with a @a mask.
   * A Gdk::Pixmap is a server-side image buffer in the pixel format of the current display. 
   *
   * @param pixmap A Gdk::Pixmap
   * @param mask A Gdk::Bitmap
   */
  explicit Image(const Glib::RefPtr<Gdk::Pixmap>& pixmap, const Glib::RefPtr<Gdk::Bitmap>& mask);

  /** Creates an Image widget displaying an @a image with a mask.
   * A Gdk::Image is a client-side image buffer in the pixel format of the current display.
   */
  explicit Image(const Glib::RefPtr<Gdk::Image>& image, const Glib::RefPtr<Gdk::Bitmap>& mask);

  /** Creates an Image widget displaying the file @a filename.
   * If the file isn't found or can't be loaded, the resulting Gtk::Image will display a "broken image" icon. 
   *
   * If the file contains an animation, the image will contain an animation.
   *
   * If you need to detect failures to load the file, use Gdk::Pixbuf::create_from_file() to load the file yourself, 
   * then create the GtkImage from the pixbuf. (Or for animations, use Gdk::PixbufAnimation::create_from_file()).
   *
   * The storage type (get_storage_type()) of the returned image is not defined. It will be whatever is appropriate for displaying the file.
   */
  explicit Image(const std::string& file);

  //TODO: Change this documentation when we have wrapped new_from_icon_set().
  /** Creates a new Image widget displaying @a pixbuf.
   * Note that this just creates an GtkImage from the pixbuf. The Gtk::Image created will not react to state changes. 
   * Should you want that, you should use new_from_icon_set().
   */
  explicit Image(const Glib::RefPtr<Gdk::Pixbuf>& pixbuf);
  //TODO: Wrap gtk_image_new_from_icon_set()

  //We don't wrap gtk_image_new_from_icon_name() to avoid a clash with the from-filename constructor.
  //But we do wrap gtk_image_set_from_icon_name()
  

  /** Creates am Image displaying a stock icon.
   * Sample stock icon identifiers are Gtk::Stock::OPEN, Gtk::Stock::EXIT. Sample stock sizes are Gtk::ICON_SIZE_MENU, Gtk::ICON_SIZE_SMALL_TOOLBAR.
   * If the stock icon name isn't known, a "broken image" icon will be displayed instead.
   * You can register your own stock icon names - see Gtk::IconFactory::add().
   * @param stock_id A stock icon.
   * @param size A stock icon size.
   */
  Image(const Gtk::StockID& stock_id, IconSize size);

  Image(IconSet& icon_set, IconSize size);
  Image(const Glib::RefPtr<Gdk::PixbufAnimation>& animation);

  
  /** See the Image::Image(const Glib::RefPtr<Gdk::Pixmap>& pixmap, const Glib::RefPtr<Gdk::Bitmap>& mask) constructor for details.
   * @param pixmap A #Gdk::Pixmap.
   * @param mask A #Gdk::Bitmap.
   */
  void set(const Glib::RefPtr<Gdk::Pixmap>& pixmap, const Glib::RefPtr<Gdk::Bitmap>& mask);
  
  /** See the Image::Image(const Glib::RefPtr<Gdk::Image>& image, const Glib::RefPtr<Gdk::Bitmap>& mask) constructor for details.
   * @param gdk_image A #Gdk::Image.
   * @param mask A #Gdk::Bitmap.
   */
  void set(const Glib::RefPtr<Gdk::Image>& gdk_image, const Glib::RefPtr<Gdk::Bitmap>& mask);
  
  /** See the Image::Image(const std::string& file) constructor for details.
   * @param filename A filename.
   */
  void set(const std::string& filename);
  
  /** See the Image::Image(const Glib::RefPtr<Gdk::Pixbuf>& pixbuf) constructor for details.
   * @param pixbuf A #Gdk::Pixbuf.
   */
  void set(const Glib::RefPtr<Gdk::Pixbuf>& pixbuf);
  
  /** See the Image::Image(const Gtk::StockID& stock_id, IconSize size) constructor for details.
   * @param stock_id A stock icon name.
   * @param size A stock icon size.
   */
  void set(const Gtk::StockID& stock_id, IconSize size);
  
  /** See new_from_icon_set() for details.
   * @param icon_set A Gtk::IconSet.
   * @param size A stock icon size.
   */
  void set(IconSet& icon_set, IconSize size);
  
  /** Causes the Gtk::Image to display the given animation (or display
   * nothing, if you set the animation to <tt>0</tt>).
   * @param animation The Gdk::PixbufAnimation.
   */
  void set(const Glib::RefPtr<Gdk::PixbufAnimation>& animation);
  
  /** See new_from_gicon() for details.
   * 
   * @newin{2,14}
   * @param icon An icon.
   * @param size An icon size.
   */
  void set(const Glib::RefPtr<const Gio::Icon>& icon, IconSize size);

  
  /** Causes the Image to display an icon from the current icon theme.
   * If the icon name isn't known, a "broken image" icon will be
   * displayed instead.  If the current icon theme is changed, the icon
   * will be updated appropriately.
   * 
   * @newin{2,6}
   * @param icon_name An icon name.
   * @param size A stock icon size.
   */
  void set_from_icon_name(const Glib::ustring& icon_name, IconSize size);


  /** Resets the image to be empty.
   * 
   * @newin{2,8}
   */
  void clear();

  
  /** Gets the type of representation being used by the Gtk::Image
   * to store image data. If the Gtk::Image has no image data,
   * the return value will be Gtk::IMAGE_EMPTY.
   * @return Image representation being used.
   */
  ImageType get_storage_type() const;

  void get_pixmap(Glib::RefPtr<Gdk::Pixmap>& pixmap, Glib::RefPtr<Gdk::Bitmap>& mask) const;
  void get_image(Glib::RefPtr<Gdk::Image>& gdk_image, Glib::RefPtr<Gdk::Bitmap>& mask) const;
  
  /** Gets the Gdk::Pixbuf being displayed by the Gtk::Image.
   * The storage type of the image must be Gtk::IMAGE_EMPTY or
   * Gtk::IMAGE_PIXBUF (see get_storage_type()).
   * The caller of this function does not own a reference to the
   * returned pixbuf.
   * @return The displayed pixbuf, or <tt>0</tt> if
   * the image is empty.
   */
  Glib::RefPtr<Gdk::Pixbuf> get_pixbuf();
  
  /** Gets the Gdk::Pixbuf being displayed by the Gtk::Image.
   * The storage type of the image must be Gtk::IMAGE_EMPTY or
   * Gtk::IMAGE_PIXBUF (see get_storage_type()).
   * The caller of this function does not own a reference to the
   * returned pixbuf.
   * @return The displayed pixbuf, or <tt>0</tt> if
   * the image is empty.
   */
  Glib::RefPtr<const Gdk::Pixbuf> get_pixbuf() const;
  void get_stock(Gtk::StockID& stock_id, IconSize& size) const;
  void get_icon_set(IconSet& icon_set, IconSize& size) const;
  
  /** Gets the Gdk::PixbufAnimation being displayed by the Gtk::Image.
   * The storage type of the image must be Gtk::IMAGE_EMPTY or
   * Gtk::IMAGE_ANIMATION (see get_storage_type()).
   * The caller of this function does not own a reference to the
   * returned animation.
   * @return The displayed animation, or <tt>0</tt> if
   * the image is empty.
   */
  Glib::RefPtr<Gdk::PixbufAnimation> get_animation();
  
  /** Gets the Gdk::PixbufAnimation being displayed by the Gtk::Image.
   * The storage type of the image must be Gtk::IMAGE_EMPTY or
   * Gtk::IMAGE_ANIMATION (see get_storage_type()).
   * The caller of this function does not own a reference to the
   * returned animation.
   * @return The displayed animation, or <tt>0</tt> if
   * the image is empty.
   */
  Glib::RefPtr<const Gdk::PixbufAnimation> get_animation() const;

 /** Gets the Gio::Icon and size being displayed by the Gtk::Image.
  * The storage type of the image must be IMAGE_EMPTY or
  * IMAGE_GICON (see get_storage_type()).
  *
  * @param icon_size A place to store an icon size.
  * 
  * @newin{2,14}
  */
  Glib::RefPtr<Gio::Icon> get_gicon(Gtk::IconSize& icon_size);

 /** Gets the Gio::Icon and size being displayed by the Gtk::Image.
  * The storage type of the image must be IMAGE_EMPTY or
  * IMAGE_GICON (see get_storage_type()).
  *
  * @param icon_size A place to store an icon size.
  * 
  * @newin{2,14}
  */
  Glib::RefPtr<const Gio::Icon> get_gicon(Gtk::IconSize& icon_size) const;
  

  Glib::ustring get_icon_name() const;
  Glib::ustring get_icon_name(IconSize& size);
  

  /** Gets the pixel size used for named icons.
   * 
   * @newin{2,6}
   * @return The pixel size used for named icons.
   */
  int get_pixel_size() const;
 
  /** Sets the pixel size to use for named icons. If the pixel size is set
   * to a value != -1, it is used instead of the icon size set by
   * set_from_icon_name().
   * 
   * @newin{2,6}
   * @param pixel_size The new pixel size.
   */
  void set_pixel_size(int pixel_size);

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** A GdkPixbuf to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy< Glib::RefPtr<Gdk::Pixbuf> > property_pixbuf() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** A GdkPixbuf to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly< Glib::RefPtr<Gdk::Pixbuf> > property_pixbuf() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** A GdkPixmap to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy< Glib::RefPtr<Gdk::Pixmap> > property_pixmap() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** A GdkPixmap to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly< Glib::RefPtr<Gdk::Pixmap> > property_pixmap() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** A GdkImage to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy< Glib::RefPtr<Gdk::Image> > property_image() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** A GdkImage to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly< Glib::RefPtr<Gdk::Image> > property_image() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Mask bitmap to use with GdkImage or GdkPixmap.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy< Glib::RefPtr<Gdk::Pixmap> > property_mask() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Mask bitmap to use with GdkImage or GdkPixmap.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly< Glib::RefPtr<Gdk::Pixmap> > property_mask() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Filename to load and display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<Glib::ustring> property_file() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Filename to load and display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<Glib::ustring> property_file() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Stock ID for a stock image to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<Glib::ustring> property_stock() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Stock ID for a stock image to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<Glib::ustring> property_stock() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Icon set to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<Gtk::IconSet> property_icon_set() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Icon set to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<Gtk::IconSet> property_icon_set() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Symbolic size to use for stock icon, icon set or named icon.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<int> property_icon_size() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Symbolic size to use for stock icon, icon set or named icon.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<int> property_icon_size() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** Pixel size to use for named icon.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy<int> property_pixel_size() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** Pixel size to use for named icon.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<int> property_pixel_size() const;
#endif //#GLIBMM_PROPERTIES_ENABLED

  #ifdef GLIBMM_PROPERTIES_ENABLED
/** GdkPixbufAnimation to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy< Glib::RefPtr<Gdk::PixbufAnimation> > property_pixbuf_animation() ;
#endif //#GLIBMM_PROPERTIES_ENABLED

#ifdef GLIBMM_PROPERTIES_ENABLED
/** GdkPixbufAnimation to display.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly< Glib::RefPtr<Gdk::PixbufAnimation> > property_pixbuf_animation() const;
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
/** The representation being used for image data.
   *
   * You rarely need to use properties because there are get_ and set_ methods for almost all of them.
   * @return A PropertyProxy that allows you to get or set the property of the value, or receive notification when
   * the value of the property changes.
   */
  Glib::PropertyProxy_ReadOnly<ImageType> property_storage_type() const;
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
   * @relates Gtk::Image
   */
  Gtk::Image* wrap(GtkImage* object, bool take_copy = false);
} //namespace Glib


#endif /* _GTKMM_IMAGE_H */

