/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class turn_symbol extends i_symbol {
  private long swigCPtr;

  protected turn_symbol(long cPtr, boolean cMemoryOwn) {
    super(w_e_boneJNI.turn_symbol_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(turn_symbol obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_turn_symbol(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public turn_symbol(e_turn_direction direction, i_dynamics_sign dynamics, i_degree_sign degree) {
    this(w_e_boneJNI.new_turn_symbol__SWIG_0(direction.swigValue(), i_dynamics_sign.getCPtr(dynamics), dynamics, i_degree_sign.getCPtr(degree), degree), true);
  }

  public turn_symbol(e_turn_direction direction, i_dynamics_sign dynamics) {
    this(w_e_boneJNI.new_turn_symbol__SWIG_1(direction.swigValue(), i_dynamics_sign.getCPtr(dynamics), dynamics), true);
  }

  public turn_symbol(e_turn_direction direction) {
    this(w_e_boneJNI.new_turn_symbol__SWIG_2(direction.swigValue()), true);
  }

  public e_turn_direction get_direction() {
    return e_turn_direction.swigToEnum(w_e_boneJNI.turn_symbol_get_direction(swigCPtr, this));
  }

  public i_dynamics_sign get_dynamics() {
    long cPtr = w_e_boneJNI.turn_symbol_get_dynamics(swigCPtr, this);
    return (cPtr == 0) ? null : new i_dynamics_sign(cPtr, true);
  }

  public i_degree_sign get_degree() {
    long cPtr = w_e_boneJNI.turn_symbol_get_degree(swigCPtr, this);
    return (cPtr == 0) ? null : new i_degree_sign(cPtr, true);
  }

  public boolean equals(i_symbol a) {
    return w_e_boneJNI.turn_symbol_equals(swigCPtr, this, i_symbol.getCPtr(a), a);
  }

  public String xml(long indent, String namesp) {
    return w_e_boneJNI.turn_symbol_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return w_e_boneJNI.turn_symbol_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return w_e_boneJNI.turn_symbol_xml__SWIG_2(swigCPtr, this);
  }

  public String str() {
    return w_e_boneJNI.turn_symbol_str(swigCPtr, this);
  }

}
