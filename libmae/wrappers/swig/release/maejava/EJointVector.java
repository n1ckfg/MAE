/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class EJointVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public EJointVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(EJointVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_EJointVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public EJointVector() {
    this(MaeJavaJNI.new_EJointVector__SWIG_0(), true);
  }

  public EJointVector(long n) {
    this(MaeJavaJNI.new_EJointVector__SWIG_1(n), true);
  }

  public long size() {
    return MaeJavaJNI.EJointVector_size(swigCPtr, this);
  }

  public long capacity() {
    return MaeJavaJNI.EJointVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    MaeJavaJNI.EJointVector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return MaeJavaJNI.EJointVector_empty(swigCPtr, this);
  }

  public void clear() {
    MaeJavaJNI.EJointVector_clear(swigCPtr, this);
  }

  public void pushBack(EJoint x) {
    MaeJavaJNI.EJointVector_pushBack(swigCPtr, this, x.swigValue());
  }

  public EJoint get(int i) {
    return EJoint.swigToEnum(MaeJavaJNI.EJointVector_get(swigCPtr, this, i));
  }

  public void set(int i, EJoint val) {
    MaeJavaJNI.EJointVector_set(swigCPtr, this, i, val.swigValue());
  }

}
