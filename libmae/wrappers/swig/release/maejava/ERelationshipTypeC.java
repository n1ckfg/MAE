/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class ERelationshipTypeC {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ERelationshipTypeC(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ERelationshipTypeC obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_ERelationshipTypeC(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String str(ERelationshipType type) {
    return MaeJavaJNI.ERelationshipTypeC_str(type.swigValue());
  }

  public static ERelationshipTypeVector vec() {
    return new ERelationshipTypeVector(MaeJavaJNI.ERelationshipTypeC_vec(), true);
  }

  public static ERelationshipType parse(String str) {
    return ERelationshipType.swigToEnum(MaeJavaJNI.ERelationshipTypeC_parse(str));
  }

  public ERelationshipTypeC() {
    this(MaeJavaJNI.new_ERelationshipTypeC(), true);
  }

}