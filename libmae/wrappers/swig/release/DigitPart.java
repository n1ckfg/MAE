/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class DigitPart extends IEndpoint {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  public DigitPart(long cPtr, boolean cMemoryOwn) {
    super(MaeJavaJNI.DigitPart_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(DigitPart obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        MaeJavaJNI.delete_DigitPart(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DigitPart(EDigit digit, long knuckle) {
    this(MaeJavaJNI.new_DigitPart(digit.swigValue(), knuckle), true);
  }

  public EDigit getDigit() {
    return EDigit.swigToEnum(MaeJavaJNI.DigitPart_getDigit(swigCPtr, this));
  }

  public long getKnuckle() {
    return MaeJavaJNI.DigitPart_getKnuckle(swigCPtr, this);
  }

  public String xml(long indent, String namesp) {
    return MaeJavaJNI.DigitPart_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaeJavaJNI.DigitPart_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return MaeJavaJNI.DigitPart_xml__SWIG_2(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return MaeJavaJNI.DigitPart_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return MaeJavaJNI.DigitPart_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public IEndpoint getFixedEnd() {
    long cPtr = MaeJavaJNI.DigitPart_getFixedEnd(swigCPtr, this);
    return (cPtr == 0) ? null : new IEndpoint(cPtr, true);
  }

  public boolean equals(IPart a) {
    return MaeJavaJNI.DigitPart_equals__SWIG_0(swigCPtr, this, IPart.getCPtr(a), a);
  }

  public boolean equals(IEndpoint a) {
    return MaeJavaJNI.DigitPart_equals__SWIG_1(swigCPtr, this, IEndpoint.getCPtr(a), a);
  }

  public static DigitPart castToDigitPart(IPart base) {
    long cPtr = MaeJavaJNI.DigitPart_castToDigitPart(IPart.getCPtr(base), base);
    return (cPtr == 0) ? null : new DigitPart(cPtr, true);
  }

}
