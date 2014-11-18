/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class LabanSequenceRecognizer extends LabanSequenceSequenceRecognizer {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  public LabanSequenceRecognizer(long cPtr, boolean cMemoryOwn) {
    super(MaeJavaJNI.LabanSequenceRecognizer_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(LabanSequenceRecognizer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        MaeJavaJNI.delete_LabanSequenceRecognizer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public LabanSequenceRecognizer(double framerate, boolean debug) {
    this(MaeJavaJNI.new_LabanSequenceRecognizer__SWIG_0(framerate, debug), true);
  }

  public LabanSequenceRecognizer(double framerate) {
    this(MaeJavaJNI.new_LabanSequenceRecognizer__SWIG_1(framerate), true);
  }

  public LabanSequenceRecognizer() {
    this(MaeJavaJNI.new_LabanSequenceRecognizer__SWIG_2(), true);
  }

  public LabanSequenceRecognizer(ColumnDefinitionVector column_definitions, long beats_per_measure, long beat_duration, ETimeUnit time_unit, double framerate, boolean debug) {
    this(MaeJavaJNI.new_LabanSequenceRecognizer__SWIG_3(ColumnDefinitionVector.getCPtr(column_definitions), column_definitions, beats_per_measure, beat_duration, time_unit.swigValue(), framerate, debug), true);
  }

  public LabanSequenceRecognizer(ColumnDefinitionVector column_definitions, long beats_per_measure, long beat_duration, ETimeUnit time_unit, double framerate) {
    this(MaeJavaJNI.new_LabanSequenceRecognizer__SWIG_4(ColumnDefinitionVector.getCPtr(column_definitions), column_definitions, beats_per_measure, beat_duration, time_unit.swigValue(), framerate), true);
  }

  public LabanSequenceRecognizer(ColumnDefinitionVector column_definitions, long beats_per_measure, long beat_duration, ETimeUnit time_unit) {
    this(MaeJavaJNI.new_LabanSequenceRecognizer__SWIG_5(ColumnDefinitionVector.getCPtr(column_definitions), column_definitions, beats_per_measure, beat_duration, time_unit.swigValue()), true);
  }

  public LabanSequenceRecognizer(ColumnDefinitionVector column_definitions, long beats_per_measure, long beat_duration) {
    this(MaeJavaJNI.new_LabanSequenceRecognizer__SWIG_6(ColumnDefinitionVector.getCPtr(column_definitions), column_definitions, beats_per_measure, beat_duration), true);
  }

  public LabanSequenceRecognizer(ColumnDefinitionVector column_definitions, long beats_per_measure) {
    this(MaeJavaJNI.new_LabanSequenceRecognizer__SWIG_7(ColumnDefinitionVector.getCPtr(column_definitions), column_definitions, beats_per_measure), true);
  }

  public LabanSequenceRecognizer(ColumnDefinitionVector column_definitions) {
    this(MaeJavaJNI.new_LabanSequenceRecognizer__SWIG_8(ColumnDefinitionVector.getCPtr(column_definitions), column_definitions), true);
  }

  public void setRecognitionTolerance(double tolerance) {
    MaeJavaJNI.LabanSequenceRecognizer_setRecognitionTolerance(swigCPtr, this, tolerance);
  }

  public DecisionForest getDecisionForest() {
    long cPtr = MaeJavaJNI.LabanSequenceRecognizer_getDecisionForest(swigCPtr, this);
    return (cPtr == 0) ? null : new DecisionForest(cPtr, true);
  }

  public void registerSequence(LabanSequence sequence) {
    MaeJavaJNI.LabanSequenceRecognizer_registerSequence(swigCPtr, this, LabanSequence.getCPtr(sequence), sequence);
  }

  public boolean deregisterSequence(LabanSequence sequence) {
    return MaeJavaJNI.LabanSequenceRecognizer_deregisterSequence__SWIG_0(swigCPtr, this, LabanSequence.getCPtr(sequence), sequence);
  }

  public boolean deregisterSequence(long list_index) {
    return MaeJavaJNI.LabanSequenceRecognizer_deregisterSequence__SWIG_1(swigCPtr, this, list_index);
  }

  public void clearRegisteredSequences() {
    MaeJavaJNI.LabanSequenceRecognizer_clearRegisteredSequences(swigCPtr, this);
  }

  public LabanSequenceList getRegisteredSequences() {
    return new LabanSequenceList(MaeJavaJNI.LabanSequenceRecognizer_getRegisteredSequences(swigCPtr, this), true);
  }

  public int getSequenceLength(LabanSequence sequence) {
    return MaeJavaJNI.LabanSequenceRecognizer_getSequenceLength(swigCPtr, this, LabanSequence.getCPtr(sequence), sequence);
  }

  public LabanSequenceVector recognizeSequence(LabanSequence sequence, BoneVector body_parts) {
    return new LabanSequenceVector(MaeJavaJNI.LabanSequenceRecognizer_recognizeSequence(swigCPtr, this, LabanSequence.getCPtr(sequence), sequence, BoneVector.getCPtr(body_parts), body_parts), true);
  }

  public String str() {
    return MaeJavaJNI.LabanSequenceRecognizer_str(swigCPtr, this);
  }

}