/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class direction_symbol extends i_symbol {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  public direction_symbol(long cPtr, boolean cMemoryOwn) {
    super(MaejavaJNI.direction_symbol_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(direction_symbol obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        MaejavaJNI.delete_direction_symbol(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public direction_symbol(e_level vertical, e_direction horizontal, pin modification_pin, pin relationship_pin, i_dynamics_sign dynamics, space_measurement space_measurement, e_contact_hook contact_hook) {
    this(MaejavaJNI.new_direction_symbol__SWIG_0(vertical.swigValue(), horizontal.swigValue(), pin.getCPtr(modification_pin), modification_pin, pin.getCPtr(relationship_pin), relationship_pin, i_dynamics_sign.getCPtr(dynamics), dynamics, space_measurement.getCPtr(space_measurement), space_measurement, contact_hook.swigValue()), true);
  }

  public direction_symbol(e_level vertical, e_direction horizontal, pin modification_pin, pin relationship_pin, i_dynamics_sign dynamics, space_measurement space_measurement) {
    this(MaejavaJNI.new_direction_symbol__SWIG_1(vertical.swigValue(), horizontal.swigValue(), pin.getCPtr(modification_pin), modification_pin, pin.getCPtr(relationship_pin), relationship_pin, i_dynamics_sign.getCPtr(dynamics), dynamics, space_measurement.getCPtr(space_measurement), space_measurement), true);
  }

  public direction_symbol(e_level vertical, e_direction horizontal, pin modification_pin, pin relationship_pin, i_dynamics_sign dynamics) {
    this(MaejavaJNI.new_direction_symbol__SWIG_2(vertical.swigValue(), horizontal.swigValue(), pin.getCPtr(modification_pin), modification_pin, pin.getCPtr(relationship_pin), relationship_pin, i_dynamics_sign.getCPtr(dynamics), dynamics), true);
  }

  public direction_symbol(e_level vertical, e_direction horizontal, pin modification_pin, pin relationship_pin) {
    this(MaejavaJNI.new_direction_symbol__SWIG_3(vertical.swigValue(), horizontal.swigValue(), pin.getCPtr(modification_pin), modification_pin, pin.getCPtr(relationship_pin), relationship_pin), true);
  }

  public direction_symbol(e_level vertical, e_direction horizontal, pin modification_pin) {
    this(MaejavaJNI.new_direction_symbol__SWIG_4(vertical.swigValue(), horizontal.swigValue(), pin.getCPtr(modification_pin), modification_pin), true);
  }

  public direction_symbol(e_level vertical, e_direction horizontal) {
    this(MaejavaJNI.new_direction_symbol__SWIG_5(vertical.swigValue(), horizontal.swigValue()), true);
  }

  public e_level get_vertical() {
    return e_level.swigToEnum(MaejavaJNI.direction_symbol_get_vertical(swigCPtr, this));
  }

  public e_direction get_horizontal() {
    return e_direction.swigToEnum(MaejavaJNI.direction_symbol_get_horizontal(swigCPtr, this));
  }

  public pin get_modification_pin() {
    long cPtr = MaejavaJNI.direction_symbol_get_modification_pin(swigCPtr, this);
    return (cPtr == 0) ? null : new pin(cPtr, true);
  }

  public pin get_relationship_pin() {
    long cPtr = MaejavaJNI.direction_symbol_get_relationship_pin(swigCPtr, this);
    return (cPtr == 0) ? null : new pin(cPtr, true);
  }

  public i_dynamics_sign get_dynamics() {
    long cPtr = MaejavaJNI.direction_symbol_get_dynamics(swigCPtr, this);
    return (cPtr == 0) ? null : new i_dynamics_sign(cPtr, true);
  }

  public space_measurement get_space_measurement() {
    long cPtr = MaejavaJNI.direction_symbol_get_space_measurement(swigCPtr, this);
    return (cPtr == 0) ? null : new space_measurement(cPtr, true);
  }

  public e_contact_hook get_contact_hook() {
    return e_contact_hook.swigToEnum(MaejavaJNI.direction_symbol_get_contact_hook(swigCPtr, this));
  }

  public boolean equals(i_symbol a) {
    return MaejavaJNI.direction_symbol_equals(swigCPtr, this, i_symbol.getCPtr(a), a);
  }

  public String xml(long indent, String namesp) {
    return MaejavaJNI.direction_symbol_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaejavaJNI.direction_symbol_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return MaejavaJNI.direction_symbol_xml__SWIG_2(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return MaejavaJNI.direction_symbol_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return MaejavaJNI.direction_symbol_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public String str() {
    return MaejavaJNI.direction_symbol_str(swigCPtr, this);
  }

}
