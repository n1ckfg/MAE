/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class column_definition {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected column_definition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(column_definition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaejavaJNI.delete_column_definition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public column_definition(int column_index, i_pre_sign pre_sign) {
    this(MaejavaJNI.new_column_definition__SWIG_0(column_index, i_pre_sign.getCPtr(pre_sign), pre_sign), true);
  }

  public column_definition(e_bone eb) {
    this(MaejavaJNI.new_column_definition__SWIG_1(eb.swigValue()), true);
  }

  public int get_column_index() {
    return MaejavaJNI.column_definition_get_column_index(swigCPtr, this);
  }

  public i_pre_sign get_pre_sign() {
    long cPtr = MaejavaJNI.column_definition_get_pre_sign(swigCPtr, this);
    return (cPtr == 0) ? null : new i_pre_sign(cPtr, true);
  }

  public String xml(long indent, String namesp) {
    return MaejavaJNI.column_definition_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaejavaJNI.column_definition_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return MaejavaJNI.column_definition_xml__SWIG_2(swigCPtr, this);
  }

  public String svg(long im_width, long im_height, long max_column, long measures, long beats_per_measure) {
    return MaejavaJNI.column_definition_svg(swigCPtr, this, im_width, im_height, max_column, measures, beats_per_measure);
  }

  public boolean equals(column_definition a) {
    return MaejavaJNI.column_definition_equals(swigCPtr, this, column_definition.getCPtr(a), a);
  }

  public static coldef_vector default_definitions() {
    return new coldef_vector(MaejavaJNI.column_definition_default_definitions(), true);
  }

}
