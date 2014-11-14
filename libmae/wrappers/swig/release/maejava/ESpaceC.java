/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class ESpaceC {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ESpaceC(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ESpaceC obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_ESpaceC(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String str(ESpace space) {
    return MaeJavaJNI.ESpaceC_str(space.swigValue());
  }

  public static ESpaceVector vec() {
    return new ESpaceVector(MaeJavaJNI.ESpaceC_vec(), true);
  }

  public static ESpace parse(String str) {
    return ESpace.swigToEnum(MaeJavaJNI.ESpaceC_parse(str));
  }

  public ESpaceC() {
    this(MaeJavaJNI.new_ESpaceC(), true);
  }

}
