/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class e_turn_direction_c {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected e_turn_direction_c(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(e_turn_direction_c obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_e_turn_direction_c(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String str(e_turn_direction turn) {
    return w_e_boneJNI.e_turn_direction_c_str(turn.swigValue());
  }

  public static SWIGTYPE_p_std__vectorT_mae__fl__laban__mv__e_turn_direction_t vec() {
    return new SWIGTYPE_p_std__vectorT_mae__fl__laban__mv__e_turn_direction_t(w_e_boneJNI.e_turn_direction_c_vec(), true);
  }

  public static e_turn_direction parse(String str) {
    return e_turn_direction.swigToEnum(w_e_boneJNI.e_turn_direction_c_parse(str));
  }

  public e_turn_direction_c() {
    this(w_e_boneJNI.new_e_turn_direction_c(), true);
  }

}