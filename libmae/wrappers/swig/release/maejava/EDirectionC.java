/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class EDirectionC {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public EDirectionC(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(EDirectionC obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_EDirectionC(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String str(EDirection direction) {
    return MaeJavaJNI.EDirectionC_str(direction.swigValue());
  }

  public static EDirection dir(e_fl_direction direction) {
    return EDirection.swigToEnum(MaeJavaJNI.EDirectionC_dir(direction.swigValue()));
  }

  public static EDirectionVector vec() {
    return new EDirectionVector(MaeJavaJNI.EDirectionC_vec(), true);
  }

  public static EDirection parse(String str) {
    return EDirection.swigToEnum(MaeJavaJNI.EDirectionC_parse(str));
  }

  public EDirectionC() {
    this(MaeJavaJNI.new_EDirectionC(), true);
  }

}