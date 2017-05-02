/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class IntVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public IntVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(IntVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_IntVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntVector() {
    this(MaeJavaJNI.new_IntVector__SWIG_0(), true);
  }

  public IntVector(long n) {
    this(MaeJavaJNI.new_IntVector__SWIG_1(n), true);
  }

  public long size() {
    return MaeJavaJNI.IntVector_size(swigCPtr, this);
  }

  public long capacity() {
    return MaeJavaJNI.IntVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    MaeJavaJNI.IntVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return MaeJavaJNI.IntVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    MaeJavaJNI.IntVector_clear(swigCPtr, this);
  }

  public void add(int x) {
    MaeJavaJNI.IntVector_add(swigCPtr, this, x);
  }

  public int get(int i) {
    return MaeJavaJNI.IntVector_get(swigCPtr, this, i);
  }

  public void set(int i, int val) {
    MaeJavaJNI.IntVector_set(swigCPtr, this, i, val);
  }

}
