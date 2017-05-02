/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class ERelationshipTypeVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ERelationshipTypeVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ERelationshipTypeVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_ERelationshipTypeVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ERelationshipTypeVector() {
    this(MaeJavaJNI.new_ERelationshipTypeVector__SWIG_0(), true);
  }

  public ERelationshipTypeVector(long n) {
    this(MaeJavaJNI.new_ERelationshipTypeVector__SWIG_1(n), true);
  }

  public long size() {
    return MaeJavaJNI.ERelationshipTypeVector_size(swigCPtr, this);
  }

  public long capacity() {
    return MaeJavaJNI.ERelationshipTypeVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    MaeJavaJNI.ERelationshipTypeVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return MaeJavaJNI.ERelationshipTypeVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    MaeJavaJNI.ERelationshipTypeVector_clear(swigCPtr, this);
  }

  public void add(ERelationshipType x) {
    MaeJavaJNI.ERelationshipTypeVector_add(swigCPtr, this, x.swigValue());
  }

  public ERelationshipType get(int i) {
    return ERelationshipType.swigToEnum(MaeJavaJNI.ERelationshipTypeVector_get(swigCPtr, this, i));
  }

  public void set(int i, ERelationshipType val) {
    MaeJavaJNI.ERelationshipTypeVector_set(swigCPtr, this, i, val.swigValue());
  }

}
