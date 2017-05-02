/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class ESideC {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ESideC(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ESideC obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_ESideC(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String str(ESide side) {
    return MaeJavaJNI.ESideC_str(side.swigValue());
  }

  public static ESideVector vec() {
    return new ESideVector(MaeJavaJNI.ESideC_vec(), true);
  }

  public static ESide parse(String vec) {
    return ESide.swigToEnum(MaeJavaJNI.ESideC_parse(vec));
  }

  public ESideC() {
    this(MaeJavaJNI.new_ESideC(), true);
  }

}
