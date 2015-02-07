// -*- c++ -*-
// Generated by gtkmmproc -- DO NOT MODIFY!
#ifndef _GIOMM_MOUNT_P_H
#define _GIOMM_MOUNT_P_H


#include <glibmm/private/interface_p.h>

#include <glibmm/private/interface_p.h>

namespace Gio
{

class Mount_Class : public Glib::Interface_Class
{
public:
  typedef Mount CppObjectType;
  typedef GMount BaseObjectType;
  typedef GMountIface BaseClassType;
  typedef Glib::Interface_Class CppClassParent;

  friend class Mount;

  const Glib::Interface_Class& init();

  static void iface_init_function(void* g_iface, void* iface_data);

  static Glib::ObjectBase* wrap_new(GObject*);

protected:

#ifdef GLIBMM_DEFAULT_SIGNAL_HANDLERS_ENABLED
  //Callbacks (default signal handlers):
  //These will call the *_impl member methods, which will then call the existing default signal callbacks, if any.
  //You could prevent the original default signal handlers being called by overriding the *_impl method.
  static void changed_callback(GMount* self);
  static void unmounted_callback(GMount* self);
#endif //GLIBMM_DEFAULT_SIGNAL_HANDLERS_ENABLED

  //Callbacks (virtual functions):
#ifdef GLIBMM_VFUNCS_ENABLED
#endif //GLIBMM_VFUNCS_ENABLED
};


} // namespace Gio


#endif /* _GIOMM_MOUNT_P_H */
