/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class ETimeUnitC {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ETimeUnitC(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ETimeUnitC obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_ETimeUnitC(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String str(ETimeUnit unit) {
    return MaeJavaJNI.ETimeUnitC_str(unit.swigValue());
  }

  public static ETimeUnitVector vec() {
    return new ETimeUnitVector(MaeJavaJNI.ETimeUnitC_vec(), true);
  }

  public static ETimeUnit parse(String str) {
    return ETimeUnit.swigToEnum(MaeJavaJNI.ETimeUnitC_parse(str));
  }

  public ETimeUnitC() {
    this(MaeJavaJNI.new_ETimeUnitC(), true);
  }

}
