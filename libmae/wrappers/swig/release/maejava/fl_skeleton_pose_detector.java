/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class fl_skeleton_pose_detector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public fl_skeleton_pose_detector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(fl_skeleton_pose_detector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaejavaJNI.delete_fl_skeleton_pose_detector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public general_pose pose(fl_skeleton skeleton, bone_vector body_parts, general_pose previous_pose) {
    long cPtr = MaejavaJNI.fl_skeleton_pose_detector_pose(swigCPtr, this, fl_skeleton.getCPtr(skeleton), skeleton, bone_vector.getCPtr(body_parts), body_parts, general_pose.getCPtr(previous_pose), previous_pose);
    return (cPtr == 0) ? null : new general_pose(cPtr, true);
  }

}
