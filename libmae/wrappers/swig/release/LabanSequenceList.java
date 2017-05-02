/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class LabanSequenceList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public LabanSequenceList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(LabanSequenceList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_LabanSequenceList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LabanSequenceList() {
    this(MaeJavaJNI.new_LabanSequenceList(), true);
  }

  public long size() {
    return MaeJavaJNI.LabanSequenceList_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return MaeJavaJNI.LabanSequenceList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    MaeJavaJNI.LabanSequenceList_clear(swigCPtr, this);
  }

  public void pushBack(LabanSequence x) {
    MaeJavaJNI.LabanSequenceList_pushBack(swigCPtr, this, LabanSequence.getCPtr(x), x);
  }

  public LabanSequence get(int i) {
    long cPtr = MaeJavaJNI.LabanSequenceList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new LabanSequence(cPtr, true);
  }

}
