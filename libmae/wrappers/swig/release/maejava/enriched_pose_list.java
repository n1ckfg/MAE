/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class enriched_pose_list {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected enriched_pose_list(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(enriched_pose_list obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_enriched_pose_list(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public enriched_pose_list() {
    this(MaeJavaJNI.new_enriched_pose_list(), true);
  }

  public long size() {
    return MaeJavaJNI.enriched_pose_list_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return MaeJavaJNI.enriched_pose_list_isEmpty(swigCPtr, this);
  }

  public void clear() {
    MaeJavaJNI.enriched_pose_list_clear(swigCPtr, this);
  }

  public void add(general_enriched_pose x) {
    MaeJavaJNI.enriched_pose_list_add(swigCPtr, this, general_enriched_pose.getCPtr(x), x);
  }

  public general_enriched_pose get(int i) {
    long cPtr = MaeJavaJNI.enriched_pose_list_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new general_enriched_pose(cPtr, true);
  }

}
