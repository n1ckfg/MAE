/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class coldef_vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected coldef_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(coldef_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_coldef_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public coldef_vector() {
    this(w_e_boneJNI.new_coldef_vector__SWIG_0(), true);
  }

  public coldef_vector(long n) {
    this(w_e_boneJNI.new_coldef_vector__SWIG_1(n), true);
  }

  public long size() {
    return w_e_boneJNI.coldef_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return w_e_boneJNI.coldef_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    w_e_boneJNI.coldef_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return w_e_boneJNI.coldef_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    w_e_boneJNI.coldef_vector_clear(swigCPtr, this);
  }

  public void add(column_definition x) {
    w_e_boneJNI.coldef_vector_add(swigCPtr, this, column_definition.getCPtr(x), x);
  }

  public column_definition get(int i) {
    long cPtr = w_e_boneJNI.coldef_vector_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new column_definition(cPtr, true);
  }

  public void set(int i, column_definition val) {
    w_e_boneJNI.coldef_vector_set(swigCPtr, this, i, column_definition.getCPtr(val), val);
  }

}