/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class fl_pose_detector extends fl_skeleton_pose_detector {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected fl_pose_detector(long cPtr, boolean cMemoryOwn) {
    super(maeJNI.fl_pose_detector_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(fl_pose_detector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        maeJNI.delete_fl_pose_detector(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    maeJNI.fl_pose_detector_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    maeJNI.fl_pose_detector_change_ownership(this, swigCPtr, true);
  }

  public fl_pose_detector(double hysteresis_val, boolean debug) {
    this(maeJNI.new_fl_pose_detector__SWIG_0(hysteresis_val, debug), true);
    maeJNI.fl_pose_detector_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public fl_pose_detector(double hysteresis_val) {
    this(maeJNI.new_fl_pose_detector__SWIG_1(hysteresis_val), true);
    maeJNI.fl_pose_detector_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public fl_pose_detector() {
    this(maeJNI.new_fl_pose_detector__SWIG_2(), true);
    maeJNI.fl_pose_detector_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void set_hysteresis_val(double hysteresis_val) {
    if (getClass() == fl_pose_detector.class) maeJNI.fl_pose_detector_set_hysteresis_val(swigCPtr, this, hysteresis_val); else maeJNI.fl_pose_detector_set_hysteresis_valSwigExplicitfl_pose_detector(swigCPtr, this, hysteresis_val);
  }

  public double get_hysteresis_val() {
    return (getClass() == fl_pose_detector.class) ? maeJNI.fl_pose_detector_get_hysteresis_val(swigCPtr, this) : maeJNI.fl_pose_detector_get_hysteresis_valSwigExplicitfl_pose_detector(swigCPtr, this);
  }

  public general_pose pose(fl_skeleton skeleton, bone_vector body_parts, general_pose previous_pose) {
    long cPtr = (getClass() == fl_pose_detector.class) ? maeJNI.fl_pose_detector_pose(swigCPtr, this, fl_skeleton.getCPtr(skeleton), skeleton, bone_vector.getCPtr(body_parts), body_parts, general_pose.getCPtr(previous_pose), previous_pose) : maeJNI.fl_pose_detector_poseSwigExplicitfl_pose_detector(swigCPtr, this, fl_skeleton.getCPtr(skeleton), skeleton, bone_vector.getCPtr(body_parts), body_parts, general_pose.getCPtr(previous_pose), previous_pose);
    return (cPtr == 0) ? null : new general_pose(cPtr, true);
  }

  public general_pose vector_pose(fl_skeleton skeleton, bone_vector body_parts, general_pose previous_pose) {
    long cPtr = (getClass() == fl_pose_detector.class) ? maeJNI.fl_pose_detector_vector_pose(swigCPtr, this, fl_skeleton.getCPtr(skeleton), skeleton, bone_vector.getCPtr(body_parts), body_parts, general_pose.getCPtr(previous_pose), previous_pose) : maeJNI.fl_pose_detector_vector_poseSwigExplicitfl_pose_detector(swigCPtr, this, fl_skeleton.getCPtr(skeleton), skeleton, bone_vector.getCPtr(body_parts), body_parts, general_pose.getCPtr(previous_pose), previous_pose);
    return (cPtr == 0) ? null : new general_pose(cPtr, true);
  }

  public static double default_hysteresis_val() {
    return maeJNI.fl_pose_detector_default_hysteresis_val();
  }

}
