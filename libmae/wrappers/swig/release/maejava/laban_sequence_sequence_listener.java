/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class laban_sequence_sequence_listener {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected laban_sequence_sequence_listener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(laban_sequence_sequence_listener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_laban_sequence_sequence_listener(swigCPtr);
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
    w_e_boneJNI.laban_sequence_sequence_listener_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    w_e_boneJNI.laban_sequence_sequence_listener_change_ownership(this, swigCPtr, true);
  }

  public void on_sequence(int timestamp, SWIGTYPE_p_std__shared_ptrT_mae__fl__laban__laban_sequence_t sequence) {
    w_e_boneJNI.laban_sequence_sequence_listener_on_sequence(swigCPtr, this, timestamp, SWIGTYPE_p_std__shared_ptrT_mae__fl__laban__laban_sequence_t.getCPtr(sequence));
  }

  public laban_sequence_sequence_listener() {
    this(w_e_boneJNI.new_laban_sequence_sequence_listener(), true);
    w_e_boneJNI.laban_sequence_sequence_listener_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}