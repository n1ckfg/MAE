/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class bone_vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected bone_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bone_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        maeJNI.delete_bone_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public bone_vector() {
    this(maeJNI.new_bone_vector__SWIG_0(), true);
  }

  public bone_vector(long n) {
    this(maeJNI.new_bone_vector__SWIG_1(n), true);
  }

  public long size() {
    return maeJNI.bone_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return maeJNI.bone_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    maeJNI.bone_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return maeJNI.bone_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    maeJNI.bone_vector_clear(swigCPtr, this);
  }

  public void add(bone x) {
    maeJNI.bone_vector_add(swigCPtr, this, bone.getCPtr(x), x);
  }

  public bone get(int i) {
    return new bone(maeJNI.bone_vector_get(swigCPtr, this, i), true);
  }

  public void set(int i, bone val) {
    maeJNI.bone_vector_set(swigCPtr, this, i, bone.getCPtr(val), val);
  }

}
