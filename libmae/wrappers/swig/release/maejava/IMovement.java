/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class IMovement {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public IMovement(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(IMovement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_IMovement(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getColumn() {
    return MaeJavaJNI.IMovement_getColumn(swigCPtr, this);
  }

  public long getMeasure() {
    return MaeJavaJNI.IMovement_getMeasure(swigCPtr, this);
  }

  public double getBeat() {
    return MaeJavaJNI.IMovement_getBeat(swigCPtr, this);
  }

  public double getDuration() {
    return MaeJavaJNI.IMovement_getDuration(swigCPtr, this);
  }

  public boolean equals(IMovement a) {
    return MaeJavaJNI.IMovement_equals(swigCPtr, this, IMovement.getCPtr(a), a);
  }

  public boolean symbolEquals(IMovement a) {
    return MaeJavaJNI.IMovement_symbolEquals(swigCPtr, this, IMovement.getCPtr(a), a);
  }

  public String xml(long indent, String namesp) {
    return MaeJavaJNI.IMovement_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaeJavaJNI.IMovement_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return MaeJavaJNI.IMovement_xml__SWIG_2(swigCPtr, this);
  }

  public String svg(long im_width, long im_height, long max_column, long measures, long beats_per_measure) {
    return MaeJavaJNI.IMovement_svg(swigCPtr, this, im_width, im_height, max_column, measures, beats_per_measure);
  }

  public IMovement recreate(IntIntMap column_mapping, long measure, double beat, double duration) {
    long cPtr = MaeJavaJNI.IMovement_recreate(swigCPtr, this, IntIntMap.getCPtr(column_mapping), column_mapping, measure, beat, duration);
    return (cPtr == 0) ? null : new IMovement(cPtr, true);
  }

  public String str() {
    return MaeJavaJNI.IMovement_str(swigCPtr, this);
  }

}