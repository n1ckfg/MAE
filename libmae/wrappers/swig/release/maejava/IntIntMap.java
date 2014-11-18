/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class IntIntMap {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public IntIntMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(IntIntMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_IntIntMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntIntMap() {
    this(MaeJavaJNI.new_IntIntMap__SWIG_0(), true);
  }

  public IntIntMap(IntIntMap arg0) {
    this(MaeJavaJNI.new_IntIntMap__SWIG_1(IntIntMap.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return MaeJavaJNI.IntIntMap_size(swigCPtr, this);
  }

  public boolean empty() {
    return MaeJavaJNI.IntIntMap_empty(swigCPtr, this);
  }

  public void clear() {
    MaeJavaJNI.IntIntMap_clear(swigCPtr, this);
  }

  public int get(int key) {
    return MaeJavaJNI.IntIntMap_get(swigCPtr, this, key);
  }

  public void set(int key, int x) {
    MaeJavaJNI.IntIntMap_set(swigCPtr, this, key, x);
  }

  public void del(int key) {
    MaeJavaJNI.IntIntMap_del(swigCPtr, this, key);
  }

  public boolean hasKey(int key) {
    return MaeJavaJNI.IntIntMap_hasKey(swigCPtr, this, key);
  }

}