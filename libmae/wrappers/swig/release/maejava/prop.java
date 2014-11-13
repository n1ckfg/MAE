/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class prop extends i_pre_sign {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected prop(long cPtr, boolean cMemoryOwn) {
    super(maeJNI.prop_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(prop obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        maeJNI.delete_prop(swigCPtr);
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
    maeJNI.prop_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    maeJNI.prop_change_ownership(this, swigCPtr, true);
  }

  public prop(String name, String description) {
    this(maeJNI.new_prop__SWIG_0(name, description), true);
    maeJNI.prop_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public prop(String name) {
    this(maeJNI.new_prop__SWIG_1(name), true);
    maeJNI.prop_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public String get_name() {
    return maeJNI.prop_get_name(swigCPtr, this);
  }

  public String get_description() {
    return maeJNI.prop_get_description(swigCPtr, this);
  }

  public String xml(long indent, String namesp) {
    return (getClass() == prop.class) ? maeJNI.prop_xml__SWIG_0(swigCPtr, this, indent, namesp) : maeJNI.prop_xmlSwigExplicitprop__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return (getClass() == prop.class) ? maeJNI.prop_xml__SWIG_1(swigCPtr, this, indent) : maeJNI.prop_xmlSwigExplicitprop__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return (getClass() == prop.class) ? maeJNI.prop_xml__SWIG_2(swigCPtr, this) : maeJNI.prop_xmlSwigExplicitprop__SWIG_2(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return (getClass() == prop.class) ? maeJNI.prop_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left) : maeJNI.prop_svgSwigExplicitprop__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return (getClass() == prop.class) ? maeJNI.prop_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height) : maeJNI.prop_svgSwigExplicitprop__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public boolean equals(i_pre_sign a) {
    return (getClass() == prop.class) ? maeJNI.prop_equals(swigCPtr, this, i_pre_sign.getCPtr(a), a) : maeJNI.prop_equalsSwigExplicitprop(swigCPtr, this, i_pre_sign.getCPtr(a), a);
  }

}
