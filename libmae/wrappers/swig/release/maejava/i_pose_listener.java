/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class i_pose_listener {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected i_pose_listener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(i_pose_listener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaejavaJNI.delete_i_pose_listener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void on_pose(int timestamp, general_pose pose) {
    MaejavaJNI.i_pose_listener_on_pose(swigCPtr, this, timestamp, general_pose.getCPtr(pose), pose);
  }

}
