/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class space_measurement extends i_degree_sign {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected space_measurement(long cPtr, boolean cMemoryOwn) {
    super(MaejavaJNI.space_measurement_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(space_measurement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        MaejavaJNI.delete_space_measurement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public space_measurement(e_space type, long degree, e_space_direction direction) {
    this(MaejavaJNI.new_space_measurement__SWIG_0(type.swigValue(), degree, direction.swigValue()), true);
  }

  public space_measurement(e_space type, long degree) {
    this(MaejavaJNI.new_space_measurement__SWIG_1(type.swigValue(), degree), true);
  }

  public e_space get_type() {
    return e_space.swigToEnum(MaejavaJNI.space_measurement_get_type(swigCPtr, this));
  }

  public long get_degree() {
    return MaejavaJNI.space_measurement_get_degree(swigCPtr, this);
  }

  public e_space_direction get_direction() {
    return e_space_direction.swigToEnum(MaejavaJNI.space_measurement_get_direction(swigCPtr, this));
  }

  public boolean equals(i_degree_sign a) {
    return MaejavaJNI.space_measurement_equals(swigCPtr, this, i_degree_sign.getCPtr(a), a);
  }

  public String xml(long indent, String namesp, boolean print_type) {
    return MaejavaJNI.space_measurement_xml__SWIG_0(swigCPtr, this, indent, namesp, print_type);
  }

  public String xml(long indent, String namesp) {
    return MaejavaJNI.space_measurement_xml__SWIG_1(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaejavaJNI.space_measurement_xml__SWIG_2(swigCPtr, this, indent);
  }

  public String xml() {
    return MaejavaJNI.space_measurement_xml__SWIG_3(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return MaejavaJNI.space_measurement_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return MaejavaJNI.space_measurement_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public String str() {
    return MaejavaJNI.space_measurement_str(swigCPtr, this);
  }

}
