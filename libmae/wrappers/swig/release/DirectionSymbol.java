/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class DirectionSymbol extends ISymbol {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  public DirectionSymbol(long cPtr, boolean cMemoryOwn) {
    super(MaeJavaJNI.DirectionSymbol_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(DirectionSymbol obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        MaeJavaJNI.delete_DirectionSymbol(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DirectionSymbol(ELevel vertical, EDirection horizontal, Pin modification_pin, Pin relationship_pin, IDynamicsSign dynamics, SpaceMeasurement space_measurement, EContactHook contact_hook) {
    this(MaeJavaJNI.new_DirectionSymbol__SWIG_0(vertical.swigValue(), horizontal.swigValue(), Pin.getCPtr(modification_pin), modification_pin, Pin.getCPtr(relationship_pin), relationship_pin, IDynamicsSign.getCPtr(dynamics), dynamics, SpaceMeasurement.getCPtr(space_measurement), space_measurement, contact_hook.swigValue()), true);
  }

  public DirectionSymbol(ELevel vertical, EDirection horizontal, Pin modification_pin, Pin relationship_pin, IDynamicsSign dynamics, SpaceMeasurement space_measurement) {
    this(MaeJavaJNI.new_DirectionSymbol__SWIG_1(vertical.swigValue(), horizontal.swigValue(), Pin.getCPtr(modification_pin), modification_pin, Pin.getCPtr(relationship_pin), relationship_pin, IDynamicsSign.getCPtr(dynamics), dynamics, SpaceMeasurement.getCPtr(space_measurement), space_measurement), true);
  }

  public DirectionSymbol(ELevel vertical, EDirection horizontal, Pin modification_pin, Pin relationship_pin, IDynamicsSign dynamics) {
    this(MaeJavaJNI.new_DirectionSymbol__SWIG_2(vertical.swigValue(), horizontal.swigValue(), Pin.getCPtr(modification_pin), modification_pin, Pin.getCPtr(relationship_pin), relationship_pin, IDynamicsSign.getCPtr(dynamics), dynamics), true);
  }

  public DirectionSymbol(ELevel vertical, EDirection horizontal, Pin modification_pin, Pin relationship_pin) {
    this(MaeJavaJNI.new_DirectionSymbol__SWIG_3(vertical.swigValue(), horizontal.swigValue(), Pin.getCPtr(modification_pin), modification_pin, Pin.getCPtr(relationship_pin), relationship_pin), true);
  }

  public DirectionSymbol(ELevel vertical, EDirection horizontal, Pin modification_pin) {
    this(MaeJavaJNI.new_DirectionSymbol__SWIG_4(vertical.swigValue(), horizontal.swigValue(), Pin.getCPtr(modification_pin), modification_pin), true);
  }

  public DirectionSymbol(ELevel vertical, EDirection horizontal) {
    this(MaeJavaJNI.new_DirectionSymbol__SWIG_5(vertical.swigValue(), horizontal.swigValue()), true);
  }

  public ELevel getVertical() {
    return ELevel.swigToEnum(MaeJavaJNI.DirectionSymbol_getVertical(swigCPtr, this));
  }

  public EDirection getHorizontal() {
    return EDirection.swigToEnum(MaeJavaJNI.DirectionSymbol_getHorizontal(swigCPtr, this));
  }

  public Pin getModificationPin() {
    long cPtr = MaeJavaJNI.DirectionSymbol_getModificationPin(swigCPtr, this);
    return (cPtr == 0) ? null : new Pin(cPtr, true);
  }

  public Pin getRelationshipPin() {
    long cPtr = MaeJavaJNI.DirectionSymbol_getRelationshipPin(swigCPtr, this);
    return (cPtr == 0) ? null : new Pin(cPtr, true);
  }

  public IDynamicsSign getDynamics() {
    long cPtr = MaeJavaJNI.DirectionSymbol_getDynamics(swigCPtr, this);
    return (cPtr == 0) ? null : new IDynamicsSign(cPtr, true);
  }

  public SpaceMeasurement getSpaceMeasurement() {
    long cPtr = MaeJavaJNI.DirectionSymbol_getSpaceMeasurement(swigCPtr, this);
    return (cPtr == 0) ? null : new SpaceMeasurement(cPtr, true);
  }

  public EContactHook getContactHook() {
    return EContactHook.swigToEnum(MaeJavaJNI.DirectionSymbol_getContactHook(swigCPtr, this));
  }

  public boolean equals(ISymbol a) {
    return MaeJavaJNI.DirectionSymbol_equals(swigCPtr, this, ISymbol.getCPtr(a), a);
  }

  public String xml(long indent, String namesp) {
    return MaeJavaJNI.DirectionSymbol_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaeJavaJNI.DirectionSymbol_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return MaeJavaJNI.DirectionSymbol_xml__SWIG_2(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return MaeJavaJNI.DirectionSymbol_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return MaeJavaJNI.DirectionSymbol_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public String str() {
    return MaeJavaJNI.DirectionSymbol_str(swigCPtr, this);
  }

  public static DirectionSymbol castToDirectionSymbol(ISymbol base) {
    long cPtr = MaeJavaJNI.DirectionSymbol_castToDirectionSymbol(ISymbol.getCPtr(base), base);
    return (cPtr == 0) ? null : new DirectionSymbol(cPtr, true);
  }

}
