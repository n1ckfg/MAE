/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class i_movement_decision_maker {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected i_movement_decision_maker(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(i_movement_decision_maker obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_i_movement_decision_maker(swigCPtr);
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
    w_e_boneJNI.i_movement_decision_maker_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    w_e_boneJNI.i_movement_decision_maker_change_ownership(this, swigCPtr, true);
  }

  public void set_recognition_tolerance(double tolerance) {
    w_e_boneJNI.i_movement_decision_maker_set_recognition_tolerance(swigCPtr, this, tolerance);
  }

  public double get_recognition_tolerance() {
    return w_e_boneJNI.i_movement_decision_maker_get_recognition_tolerance(swigCPtr, this);
  }

  public boolean decide_match(i_movement stream_item, i_movement stream_item_predecessor, i_movement tree_item, i_movement tree_item_predecessor) {
    return w_e_boneJNI.i_movement_decision_maker_decide_match(swigCPtr, this, i_movement.getCPtr(stream_item), stream_item, i_movement.getCPtr(stream_item_predecessor), stream_item_predecessor, i_movement.getCPtr(tree_item), tree_item, i_movement.getCPtr(tree_item_predecessor), tree_item_predecessor);
  }

  public boolean decide_insertion(i_movement add_item, i_movement add_item_predecessor, i_movement tree_item, i_movement tree_item_predecessor) {
    return w_e_boneJNI.i_movement_decision_maker_decide_insertion(swigCPtr, this, i_movement.getCPtr(add_item), add_item, i_movement.getCPtr(add_item_predecessor), add_item_predecessor, i_movement.getCPtr(tree_item), tree_item, i_movement.getCPtr(tree_item_predecessor), tree_item_predecessor);
  }

  public boolean position_okay(double dist_to_last, double set_value, boolean check_startpose) {
    return w_e_boneJNI.i_movement_decision_maker_position_okay(swigCPtr, this, dist_to_last, set_value, check_startpose);
  }

  public i_movement_decision_maker() {
    this(w_e_boneJNI.new_i_movement_decision_maker(), true);
    w_e_boneJNI.i_movement_decision_maker_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
