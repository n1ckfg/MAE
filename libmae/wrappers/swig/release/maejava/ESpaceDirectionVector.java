/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class ESpaceDirectionVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ESpaceDirectionVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ESpaceDirectionVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_ESpaceDirectionVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ESpaceDirectionVector() {
    this(MaeJavaJNI.new_ESpaceDirectionVector__SWIG_0(), true);
  }

  public ESpaceDirectionVector(long n) {
    this(MaeJavaJNI.new_ESpaceDirectionVector__SWIG_1(n), true);
  }

  public long size() {
    return MaeJavaJNI.ESpaceDirectionVector_size(swigCPtr, this);
  }

  public long capacity() {
    return MaeJavaJNI.ESpaceDirectionVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    MaeJavaJNI.ESpaceDirectionVector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return MaeJavaJNI.ESpaceDirectionVector_empty(swigCPtr, this);
  }

  public void clear() {
    MaeJavaJNI.ESpaceDirectionVector_clear(swigCPtr, this);
  }

  public void pushBack(ESpaceDirection x) {
    MaeJavaJNI.ESpaceDirectionVector_pushBack(swigCPtr, this, x.swigValue());
  }

  public ESpaceDirection get(int i) {
    return ESpaceDirection.swigToEnum(MaeJavaJNI.ESpaceDirectionVector_get(swigCPtr, this, i));
  }

  public void set(int i, ESpaceDirection val) {
    MaeJavaJNI.ESpaceDirectionVector_set(swigCPtr, this, i, val.swigValue());
  }

}