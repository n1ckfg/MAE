/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class SpaceMeasurement extends IDegreeSign {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  public SpaceMeasurement(long cPtr, boolean cMemoryOwn) {
    super(MaeJavaJNI.SpaceMeasurement_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SpaceMeasurement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        MaeJavaJNI.delete_SpaceMeasurement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SpaceMeasurement(ESpace type, long degree, ESpaceDirection direction) {
    this(MaeJavaJNI.new_SpaceMeasurement__SWIG_0(type.swigValue(), degree, direction.swigValue()), true);
  }

  public SpaceMeasurement(ESpace type, long degree) {
    this(MaeJavaJNI.new_SpaceMeasurement__SWIG_1(type.swigValue(), degree), true);
  }

  public ESpace getType() {
    return ESpace.swigToEnum(MaeJavaJNI.SpaceMeasurement_getType(swigCPtr, this));
  }

  public long getDegree() {
    return MaeJavaJNI.SpaceMeasurement_getDegree(swigCPtr, this);
  }

  public ESpaceDirection getDirection() {
    return ESpaceDirection.swigToEnum(MaeJavaJNI.SpaceMeasurement_getDirection(swigCPtr, this));
  }

  public boolean equals(IDegreeSign a) {
    return MaeJavaJNI.SpaceMeasurement_equals(swigCPtr, this, IDegreeSign.getCPtr(a), a);
  }

  public String xml(long indent, String namesp, boolean print_type) {
    return MaeJavaJNI.SpaceMeasurement_xml__SWIG_0(swigCPtr, this, indent, namesp, print_type);
  }

  public String xml(long indent, String namesp) {
    return MaeJavaJNI.SpaceMeasurement_xml__SWIG_1(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaeJavaJNI.SpaceMeasurement_xml__SWIG_2(swigCPtr, this, indent);
  }

  public String xml() {
    return MaeJavaJNI.SpaceMeasurement_xml__SWIG_3(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return MaeJavaJNI.SpaceMeasurement_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return MaeJavaJNI.SpaceMeasurement_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public String str() {
    return MaeJavaJNI.SpaceMeasurement_str(swigCPtr, this);
  }

  public static SpaceMeasurement castToSpaceMeasurement(IDegreeSign base) {
    long cPtr = MaeJavaJNI.SpaceMeasurement_castToSpaceMeasurement(IDegreeSign.getCPtr(base), base);
    return (cPtr == 0) ? null : new SpaceMeasurement(cPtr, true);
  }

}
