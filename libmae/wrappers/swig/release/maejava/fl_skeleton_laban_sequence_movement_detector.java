/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class fl_skeleton_laban_sequence_movement_detector {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected fl_skeleton_laban_sequence_movement_detector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(fl_skeleton_laban_sequence_movement_detector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_fl_skeleton_laban_sequence_movement_detector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_change_ownership(this, swigCPtr, true);
  }

  public laban_sequence detect_movement(int timestamp, double framerate, fl_skeleton skeleton, bone_vector body_parts) {
    long cPtr = w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_detect_movement(swigCPtr, this, timestamp, framerate, fl_skeleton.getCPtr(skeleton), skeleton, bone_vector.getCPtr(body_parts), body_parts);
    return (cPtr == 0) ? null : new laban_sequence(cPtr, true);
  }

  public void set_buffer(int size) {
    w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_set_buffer(swigCPtr, this, size);
  }

  public void clear_buffer() {
    w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_clear_buffer(swigCPtr, this);
  }

  public void add_listener(i_pose_listener listener) {
    w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_add_listener(swigCPtr, this, i_pose_listener.getCPtr(listener), listener);
  }

  public void remove_listener(i_pose_listener listener) {
    w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_remove_listener(swigCPtr, this, i_pose_listener.getCPtr(listener), listener);
  }

  public void clear_listeners() {
    w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_clear_listeners(swigCPtr, this);
  }

  public void notify_listeners(int timestamp, general_pose pose) {
    w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_notify_listeners(swigCPtr, this, timestamp, general_pose.getCPtr(pose), pose);
  }

  public fl_skeleton_laban_sequence_movement_detector() {
    this(w_e_boneJNI.new_fl_skeleton_laban_sequence_movement_detector(), true);
    w_e_boneJNI.fl_skeleton_laban_sequence_movement_detector_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
