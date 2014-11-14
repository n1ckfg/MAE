/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class laban_sequence_recognition_listener {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public laban_sequence_recognition_listener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(laban_sequence_recognition_listener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaejavaJNI.delete_laban_sequence_recognition_listener(swigCPtr);
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
    MaejavaJNI.laban_sequence_recognition_listener_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    MaejavaJNI.laban_sequence_recognition_listener_change_ownership(this, swigCPtr, true);
  }

  public void on_recognition(int timestamp, laban_sequence_vector sequences) {
    MaejavaJNI.laban_sequence_recognition_listener_on_recognition__SWIG_0(swigCPtr, this, timestamp, laban_sequence_vector.getCPtr(sequences), sequences);
  }

  public void on_recognition(int timestamp, string_vector title) {
    MaejavaJNI.laban_sequence_recognition_listener_on_recognition__SWIG_1(swigCPtr, this, timestamp, string_vector.getCPtr(title), title);
  }

  public laban_sequence_recognition_listener() {
    this(MaejavaJNI.new_laban_sequence_recognition_listener(), true);
    MaejavaJNI.laban_sequence_recognition_listener_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
