/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class room_direction extends i_movement {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected room_direction(long cPtr, boolean cMemoryOwn) {
    super(maeJNI.room_direction_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(room_direction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        maeJNI.delete_room_direction(swigCPtr);
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
    maeJNI.room_direction_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    maeJNI.room_direction_change_ownership(this, swigCPtr, true);
  }

  public room_direction(long measure, double beat, pin direction) {
    this(maeJNI.new_room_direction(measure, beat, pin.getCPtr(direction), direction), true);
    maeJNI.room_direction_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public int get_column() {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_get_column(swigCPtr, this) : maeJNI.room_direction_get_columnSwigExplicitroom_direction(swigCPtr, this);
  }

  public long get_measure() {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_get_measure(swigCPtr, this) : maeJNI.room_direction_get_measureSwigExplicitroom_direction(swigCPtr, this);
  }

  public double get_beat() {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_get_beat(swigCPtr, this) : maeJNI.room_direction_get_beatSwigExplicitroom_direction(swigCPtr, this);
  }

  public double get_duration() {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_get_duration(swigCPtr, this) : maeJNI.room_direction_get_durationSwigExplicitroom_direction(swigCPtr, this);
  }

  public pin get_direction() {
    long cPtr = maeJNI.room_direction_get_direction(swigCPtr, this);
    return (cPtr == 0) ? null : new pin(cPtr, true);
  }

  public boolean equals(i_movement a) {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_equals(swigCPtr, this, i_movement.getCPtr(a), a) : maeJNI.room_direction_equalsSwigExplicitroom_direction(swigCPtr, this, i_movement.getCPtr(a), a);
  }

  public boolean symbol_equals(i_movement a) {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_symbol_equals(swigCPtr, this, i_movement.getCPtr(a), a) : maeJNI.room_direction_symbol_equalsSwigExplicitroom_direction(swigCPtr, this, i_movement.getCPtr(a), a);
  }

  public String xml(long indent, String namesp) {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_xml__SWIG_0(swigCPtr, this, indent, namesp) : maeJNI.room_direction_xmlSwigExplicitroom_direction__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_xml__SWIG_1(swigCPtr, this, indent) : maeJNI.room_direction_xmlSwigExplicitroom_direction__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_xml__SWIG_2(swigCPtr, this) : maeJNI.room_direction_xmlSwigExplicitroom_direction__SWIG_2(swigCPtr, this);
  }

  public String svg(long im_width, long im_height, long max_column, long measures, long beats_per_measure) {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_svg(swigCPtr, this, im_width, im_height, max_column, measures, beats_per_measure) : maeJNI.room_direction_svgSwigExplicitroom_direction(swigCPtr, this, im_width, im_height, max_column, measures, beats_per_measure);
  }

  public i_movement recreate(int_int_map column_mapping, long measure, double beat, double duration) {
    long cPtr = (getClass() == room_direction.class) ? maeJNI.room_direction_recreate(swigCPtr, this, int_int_map.getCPtr(column_mapping), column_mapping, measure, beat, duration) : maeJNI.room_direction_recreateSwigExplicitroom_direction(swigCPtr, this, int_int_map.getCPtr(column_mapping), column_mapping, measure, beat, duration);
    return (cPtr == 0) ? null : new i_movement(cPtr, true);
  }

  public String str() {
    return (getClass() == room_direction.class) ? maeJNI.room_direction_str(swigCPtr, this) : maeJNI.room_direction_strSwigExplicitroom_direction(swigCPtr, this);
  }

}
