/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class FlSkeletonLabanSequenceMovementController {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FlSkeletonLabanSequenceMovementController(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FlSkeletonLabanSequenceMovementController obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_FlSkeletonLabanSequenceMovementController(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FlSkeletonLabanSequenceMovementController(FlSkeletonLabanSequenceMovementDetector imd, LabanSequenceSequenceRecognizer isr, BoneVector body_parts, int pose_buffer_size, double framerate, boolean debug) {
    this(MaeJavaJNI.new_FlSkeletonLabanSequenceMovementController__SWIG_0(FlSkeletonLabanSequenceMovementDetector.getCPtr(imd), imd, LabanSequenceSequenceRecognizer.getCPtr(isr), BoneVector.getCPtr(body_parts), body_parts, pose_buffer_size, framerate, debug), true);
  }

  public FlSkeletonLabanSequenceMovementController(FlSkeletonLabanSequenceMovementDetector imd, LabanSequenceSequenceRecognizer isr, BoneVector body_parts, int pose_buffer_size, double framerate) {
    this(MaeJavaJNI.new_FlSkeletonLabanSequenceMovementController__SWIG_1(FlSkeletonLabanSequenceMovementDetector.getCPtr(imd), imd, LabanSequenceSequenceRecognizer.getCPtr(isr), BoneVector.getCPtr(body_parts), body_parts, pose_buffer_size, framerate), true);
  }

  public FlSkeletonLabanSequenceMovementController(FlSkeletonLabanSequenceMovementDetector imd, LabanSequenceSequenceRecognizer isr, BoneVector body_parts, int pose_buffer_size) {
    this(MaeJavaJNI.new_FlSkeletonLabanSequenceMovementController__SWIG_2(FlSkeletonLabanSequenceMovementDetector.getCPtr(imd), imd, LabanSequenceSequenceRecognizer.getCPtr(isr), BoneVector.getCPtr(body_parts), body_parts, pose_buffer_size), true);
  }

  public FlSkeletonLabanSequenceMovementController(FlSkeletonLabanSequenceMovementDetector imd, LabanSequenceSequenceRecognizer isr, BoneVector body_parts) {
    this(MaeJavaJNI.new_FlSkeletonLabanSequenceMovementController__SWIG_3(FlSkeletonLabanSequenceMovementDetector.getCPtr(imd), imd, LabanSequenceSequenceRecognizer.getCPtr(isr), BoneVector.getCPtr(body_parts), body_parts), true);
  }

  public FlSkeletonLabanSequenceMovementController(FlSkeletonPoseDetector ipd, LabanSequenceSequenceGenerator isg, LabanSequenceSequenceRecognizer isr, BoneVector body_parts, int pose_buffer_size, double framerate, boolean debug) {
    this(MaeJavaJNI.new_FlSkeletonLabanSequenceMovementController__SWIG_4(FlSkeletonPoseDetector.getCPtr(ipd), LabanSequenceSequenceGenerator.getCPtr(isg), LabanSequenceSequenceRecognizer.getCPtr(isr), BoneVector.getCPtr(body_parts), body_parts, pose_buffer_size, framerate, debug), true);
  }

  public FlSkeletonLabanSequenceMovementController(FlSkeletonPoseDetector ipd, LabanSequenceSequenceGenerator isg, LabanSequenceSequenceRecognizer isr, BoneVector body_parts, int pose_buffer_size, double framerate) {
    this(MaeJavaJNI.new_FlSkeletonLabanSequenceMovementController__SWIG_5(FlSkeletonPoseDetector.getCPtr(ipd), LabanSequenceSequenceGenerator.getCPtr(isg), LabanSequenceSequenceRecognizer.getCPtr(isr), BoneVector.getCPtr(body_parts), body_parts, pose_buffer_size, framerate), true);
  }

  public FlSkeletonLabanSequenceMovementController(FlSkeletonPoseDetector ipd, LabanSequenceSequenceGenerator isg, LabanSequenceSequenceRecognizer isr, BoneVector body_parts, int pose_buffer_size) {
    this(MaeJavaJNI.new_FlSkeletonLabanSequenceMovementController__SWIG_6(FlSkeletonPoseDetector.getCPtr(ipd), LabanSequenceSequenceGenerator.getCPtr(isg), LabanSequenceSequenceRecognizer.getCPtr(isr), BoneVector.getCPtr(body_parts), body_parts, pose_buffer_size), true);
  }

  public FlSkeletonLabanSequenceMovementController(FlSkeletonPoseDetector ipd, LabanSequenceSequenceGenerator isg, LabanSequenceSequenceRecognizer isr, BoneVector body_parts) {
    this(MaeJavaJNI.new_FlSkeletonLabanSequenceMovementController__SWIG_7(FlSkeletonPoseDetector.getCPtr(ipd), LabanSequenceSequenceGenerator.getCPtr(isg), LabanSequenceSequenceRecognizer.getCPtr(isr), BoneVector.getCPtr(body_parts), body_parts), true);
  }

  public void nextFrame(int timestamp, FlSkeleton skeleton) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_nextFrame(swigCPtr, this, timestamp, FlSkeleton.getCPtr(skeleton), skeleton);
  }

  public void registerSequence(LabanSequence sequence) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_registerSequence(swigCPtr, this, LabanSequence.getCPtr(sequence), sequence);
  }

  public void deregisterSequence(LabanSequence sequence) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_deregisterSequence(swigCPtr, this, LabanSequence.getCPtr(sequence), sequence);
  }

  public void clearRegisteredSequences() {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_clearRegisteredSequences(swigCPtr, this);
  }

  public void setNoBufferSizeUpdate(boolean updates) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_setNoBufferSizeUpdate(swigCPtr, this, updates);
  }

  public void clearBuffer() {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_clearBuffer(swigCPtr, this);
  }

  public LabanSequence getCurrentSequence() {
    long cPtr = MaeJavaJNI.FlSkeletonLabanSequenceMovementController_getCurrentSequence(swigCPtr, this);
    return (cPtr == 0) ? null : new LabanSequence(cPtr, true);
  }

  public GeneralPose getCurrentPose() {
    long cPtr = MaeJavaJNI.FlSkeletonLabanSequenceMovementController_getCurrentPose(swigCPtr, this);
    return (cPtr == 0) ? null : new GeneralPose(cPtr, true);
  }

  public LabanSequenceVector getCurrentRecognition() {
    return new LabanSequenceVector(MaeJavaJNI.FlSkeletonLabanSequenceMovementController_getCurrentRecognition(swigCPtr, this), true);
  }

  public void addListener(IPoseListener pose_listener) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_addListener__SWIG_0(swigCPtr, this, IPoseListener.getCPtr(pose_listener), pose_listener);
  }

  public void removeListener(IPoseListener pose_listener) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_removeListener__SWIG_0(swigCPtr, this, IPoseListener.getCPtr(pose_listener), pose_listener);
  }

  public void addListener(LabanSequenceSequenceListener sequence_listener) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_addListener__SWIG_1(swigCPtr, this, LabanSequenceSequenceListener.getCPtr(sequence_listener), sequence_listener);
  }

  public void removeListener(LabanSequenceSequenceListener sequence_listener) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_removeListener__SWIG_1(swigCPtr, this, LabanSequenceSequenceListener.getCPtr(sequence_listener), sequence_listener);
  }

  public void addListener(LabanSequenceRecognition_listener recognition_listener) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_addListener__SWIG_2(swigCPtr, this, LabanSequenceRecognition_listener.getCPtr(recognition_listener), recognition_listener);
  }

  public void removeListener(LabanSequenceRecognition_listener recognition_listener) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_removeListener__SWIG_2(swigCPtr, this, LabanSequenceRecognition_listener.getCPtr(recognition_listener), recognition_listener);
  }

  public void clearListeners() {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_clearListeners(swigCPtr, this);
  }

  public void notifySequenceListeners(int timestamp, LabanSequence sequence) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_notifySequenceListeners(swigCPtr, this, timestamp, LabanSequence.getCPtr(sequence), sequence);
  }

  public void notifyRecognitionListeners(int timestamp, LabanSequenceVector sequences) {
    MaeJavaJNI.FlSkeletonLabanSequenceMovementController_notifyRecognitionListeners(swigCPtr, this, timestamp, LabanSequenceVector.getCPtr(sequences), sequences);
  }

  public FlSkeletonLabanSequenceMovementDetector getMovementDetector() {
    long cPtr = MaeJavaJNI.FlSkeletonLabanSequenceMovementController_getMovementDetector(swigCPtr, this);
    return (cPtr == 0) ? null : new FlSkeletonLabanSequenceMovementDetector(cPtr, true);
  }

  public LabanSequenceSequenceRecognizer getSequenceRecognizer() {
    long cPtr = MaeJavaJNI.FlSkeletonLabanSequenceMovementController_getSequenceRecognizer(swigCPtr, this);
    return (cPtr == 0) ? null : new LabanSequenceSequenceRecognizer(cPtr, true);
  }

}
