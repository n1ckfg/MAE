/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class FlSkeletonPoseDetector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public FlSkeletonPoseDetector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(FlSkeletonPoseDetector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_FlSkeletonPoseDetector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GeneralPose pose(double framerate, FlSkeleton skeleton, BoneVector body_parts, GeneralPose previous_pose) {
    long cPtr = MaeJavaJNI.FlSkeletonPoseDetector_pose(swigCPtr, this, framerate, FlSkeleton.getCPtr(skeleton), skeleton, BoneVector.getCPtr(body_parts), body_parts, GeneralPose.getCPtr(previous_pose), previous_pose);
    return (cPtr == 0) ? null : new GeneralPose(cPtr, true);
  }

}
