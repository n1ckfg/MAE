/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class laban_sequence_generator extends laban_sequence_sequence_generator {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected laban_sequence_generator(long cPtr, boolean cMemoryOwn) {
    super(maeJNI.laban_sequence_generator_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(laban_sequence_generator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        maeJNI.delete_laban_sequence_generator(swigCPtr);
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
    maeJNI.laban_sequence_generator_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    maeJNI.laban_sequence_generator_change_ownership(this, swigCPtr, true);
  }

  public laban_sequence_generator(boolean debug) {
    this(maeJNI.new_laban_sequence_generator__SWIG_0(debug), true);
    maeJNI.laban_sequence_generator_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public laban_sequence_generator() {
    this(maeJNI.new_laban_sequence_generator__SWIG_1(), true);
    maeJNI.laban_sequence_generator_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public laban_sequence_generator(coldef_vector column_definitions, long beats_per_measure, long beat_duration, e_time_unit time_unit, boolean debug) {
    this(maeJNI.new_laban_sequence_generator__SWIG_2(coldef_vector.getCPtr(column_definitions), column_definitions, beats_per_measure, beat_duration, time_unit.swigValue(), debug), true);
    maeJNI.laban_sequence_generator_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public laban_sequence_generator(coldef_vector column_definitions, long beats_per_measure, long beat_duration, e_time_unit time_unit) {
    this(maeJNI.new_laban_sequence_generator__SWIG_3(coldef_vector.getCPtr(column_definitions), column_definitions, beats_per_measure, beat_duration, time_unit.swigValue()), true);
    maeJNI.laban_sequence_generator_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public laban_sequence_generator(coldef_vector column_definitions, long beats_per_measure, long beat_duration) {
    this(maeJNI.new_laban_sequence_generator__SWIG_4(coldef_vector.getCPtr(column_definitions), column_definitions, beats_per_measure, beat_duration), true);
    maeJNI.laban_sequence_generator_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public laban_sequence_generator(coldef_vector column_definitions, long beats_per_measure) {
    this(maeJNI.new_laban_sequence_generator__SWIG_5(coldef_vector.getCPtr(column_definitions), column_definitions, beats_per_measure), true);
    maeJNI.laban_sequence_generator_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public laban_sequence_generator(coldef_vector column_definitions) {
    this(maeJNI.new_laban_sequence_generator__SWIG_6(coldef_vector.getCPtr(column_definitions), column_definitions), true);
    maeJNI.laban_sequence_generator_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public laban_sequence generate_sequence(double framerate, enriched_pose_list key_poses, bone_vector body_parts) {
    long cPtr = (getClass() == laban_sequence_generator.class) ? maeJNI.laban_sequence_generator_generate_sequence(swigCPtr, this, framerate, enriched_pose_list.getCPtr(key_poses), key_poses, bone_vector.getCPtr(body_parts), body_parts) : maeJNI.laban_sequence_generator_generate_sequenceSwigExplicitlaban_sequence_generator(swigCPtr, this, framerate, enriched_pose_list.getCPtr(key_poses), key_poses, bone_vector.getCPtr(body_parts), body_parts);
    return (cPtr == 0) ? null : new laban_sequence(cPtr, true);
  }

}
