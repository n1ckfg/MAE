/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class e_level_c {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected e_level_c(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(e_level_c obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        maeJNI.delete_e_level_c(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String str(e_level level) {
    return maeJNI.e_level_c_str(level.swigValue());
  }

  public static e_level lvl(e_fl_direction direction) {
    return e_level.swigToEnum(maeJNI.e_level_c_lvl(direction.swigValue()));
  }

  public static e_level_vector vec() {
    return new e_level_vector(maeJNI.e_level_c_vec(), true);
  }

  public static e_level parse(String str) {
    return e_level.swigToEnum(maeJNI.e_level_c_parse(str));
  }

  public e_level_c() {
    this(maeJNI.new_e_level_c(), true);
  }

}
