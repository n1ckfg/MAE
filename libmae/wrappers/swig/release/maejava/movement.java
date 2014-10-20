/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class movement extends i_movement {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected movement(long cPtr, boolean cMemoryOwn) {
    super(w_e_boneJNI.movement_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(movement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        w_e_boneJNI.delete_movement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public movement(int column, long measure, double beat, double duration, i_symbol symbol, boolean hold, i_pre_sign pre_sign) {
    this(w_e_boneJNI.new_movement__SWIG_0(column, measure, beat, duration, i_symbol.getCPtr(symbol), symbol, hold, i_pre_sign.getCPtr(pre_sign), pre_sign), true);
  }

  public movement(int column, long measure, double beat, double duration, i_symbol symbol, boolean hold) {
    this(w_e_boneJNI.new_movement__SWIG_1(column, measure, beat, duration, i_symbol.getCPtr(symbol), symbol, hold), true);
  }

  public movement(int column, long measure, double beat, double duration, i_symbol symbol) {
    this(w_e_boneJNI.new_movement__SWIG_2(column, measure, beat, duration, i_symbol.getCPtr(symbol), symbol), true);
  }

  public int get_column() {
    return w_e_boneJNI.movement_get_column(swigCPtr, this);
  }

  public long get_measure() {
    return w_e_boneJNI.movement_get_measure(swigCPtr, this);
  }

  public double get_beat() {
    return w_e_boneJNI.movement_get_beat(swigCPtr, this);
  }

  public double get_duration() {
    return w_e_boneJNI.movement_get_duration(swigCPtr, this);
  }

  public i_pre_sign get_pre_sign() {
    long cPtr = w_e_boneJNI.movement_get_pre_sign(swigCPtr, this);
    return (cPtr == 0) ? null : new i_pre_sign(cPtr, true);
  }

  public boolean get_hold() {
    return w_e_boneJNI.movement_get_hold(swigCPtr, this);
  }

  public i_symbol get_symbol() {
    long cPtr = w_e_boneJNI.movement_get_symbol(swigCPtr, this);
    return (cPtr == 0) ? null : new i_symbol(cPtr, true);
  }

  public boolean equals(i_movement a) {
    return w_e_boneJNI.movement_equals(swigCPtr, this, i_movement.getCPtr(a), a);
  }

  public boolean symbol_equals(i_movement a) {
    return w_e_boneJNI.movement_symbol_equals(swigCPtr, this, i_movement.getCPtr(a), a);
  }

  public String xml(long indent, String namesp) {
    return w_e_boneJNI.movement_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return w_e_boneJNI.movement_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return w_e_boneJNI.movement_xml__SWIG_2(swigCPtr, this);
  }

  public String svg(long im_width, long im_height, long max_column, long measures, long beats_per_measure) {
    return w_e_boneJNI.movement_svg(swigCPtr, this, im_width, im_height, max_column, measures, beats_per_measure);
  }

  public i_movement recreate(int_int_map column_mapping, long measure, double beat, double duration) {
    long cPtr = w_e_boneJNI.movement_recreate(swigCPtr, this, int_int_map.getCPtr(column_mapping), column_mapping, measure, beat, duration);
    return (cPtr == 0) ? null : new i_movement(cPtr, true);
  }

  public String str() {
    return w_e_boneJNI.movement_str(swigCPtr, this);
  }

}
