/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class e_time_unit_vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected e_time_unit_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(e_time_unit_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        maeJNI.delete_e_time_unit_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public e_time_unit_vector() {
    this(maeJNI.new_e_time_unit_vector__SWIG_0(), true);
  }

  public e_time_unit_vector(long n) {
    this(maeJNI.new_e_time_unit_vector__SWIG_1(n), true);
  }

  public long size() {
    return maeJNI.e_time_unit_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return maeJNI.e_time_unit_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    maeJNI.e_time_unit_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return maeJNI.e_time_unit_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    maeJNI.e_time_unit_vector_clear(swigCPtr, this);
  }

  public void add(e_time_unit x) {
    maeJNI.e_time_unit_vector_add(swigCPtr, this, x.swigValue());
  }

  public e_time_unit get(int i) {
    return e_time_unit.swigToEnum(maeJNI.e_time_unit_vector_get(swigCPtr, this, i));
  }

  public void set(int i, e_time_unit val) {
    maeJNI.e_time_unit_vector_set(swigCPtr, this, i, val.swigValue());
  }

}
