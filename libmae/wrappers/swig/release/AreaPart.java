/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class AreaPart extends IEndpoint {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  public AreaPart(long cPtr, boolean cMemoryOwn) {
    super(MaeJavaJNI.AreaPart_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(AreaPart obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        MaeJavaJNI.delete_AreaPart(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AreaPart(EArea area) {
    this(MaeJavaJNI.new_AreaPart(area.swigValue()), true);
  }

  public EArea getArea() {
    return EArea.swigToEnum(MaeJavaJNI.AreaPart_getArea(swigCPtr, this));
  }

  public String xml(long indent, String namesp) {
    return MaeJavaJNI.AreaPart_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaeJavaJNI.AreaPart_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return MaeJavaJNI.AreaPart_xml__SWIG_2(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return MaeJavaJNI.AreaPart_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return MaeJavaJNI.AreaPart_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public IEndpoint getFixedEnd() {
    long cPtr = MaeJavaJNI.AreaPart_getFixedEnd(swigCPtr, this);
    return (cPtr == 0) ? null : new IEndpoint(cPtr, true);
  }

  public boolean equals(IPart a) {
    return MaeJavaJNI.AreaPart_equals__SWIG_0(swigCPtr, this, IPart.getCPtr(a), a);
  }

  public boolean equals(IEndpoint a) {
    return MaeJavaJNI.AreaPart_equals__SWIG_1(swigCPtr, this, IEndpoint.getCPtr(a), a);
  }

  public static AreaPart castToAreaPart(IPart base) {
    long cPtr = MaeJavaJNI.AreaPart_castToAreaPart(IPart.getCPtr(base), base);
    return (cPtr == 0) ? null : new AreaPart(cPtr, true);
  }

}
