/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class e_space_vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected e_space_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(e_space_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        maeJNI.delete_e_space_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public e_space_vector() {
    this(maeJNI.new_e_space_vector__SWIG_0(), true);
  }

  public e_space_vector(long n) {
    this(maeJNI.new_e_space_vector__SWIG_1(n), true);
  }

  public long size() {
    return maeJNI.e_space_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return maeJNI.e_space_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    maeJNI.e_space_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return maeJNI.e_space_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    maeJNI.e_space_vector_clear(swigCPtr, this);
  }

  public void add(e_space x) {
    maeJNI.e_space_vector_add(swigCPtr, this, x.swigValue());
  }

  public e_space get(int i) {
    return e_space.swigToEnum(maeJNI.e_space_vector_get(swigCPtr, this, i));
  }

  public void set(int i, e_space val) {
    maeJNI.e_space_vector_set(swigCPtr, this, i, val.swigValue());
  }

}
