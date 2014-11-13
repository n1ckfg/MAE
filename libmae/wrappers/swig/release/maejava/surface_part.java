/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class surface_part extends i_part {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected surface_part(long cPtr, boolean cMemoryOwn) {
    super(maeJNI.surface_part_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(surface_part obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        maeJNI.delete_surface_part(swigCPtr);
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
    maeJNI.surface_part_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    maeJNI.surface_part_change_ownership(this, swigCPtr, true);
  }

  public surface_part(e_limb_side lside, i_limb limb) {
    this(maeJNI.new_surface_part(lside.swigValue(), i_limb.getCPtr(limb), limb), true);
    maeJNI.surface_part_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public e_limb_side get_limb_side() {
    return e_limb_side.swigToEnum(maeJNI.surface_part_get_limb_side(swigCPtr, this));
  }

  public i_limb get_limb() {
    long cPtr = maeJNI.surface_part_get_limb(swigCPtr, this);
    return (cPtr == 0) ? null : new i_limb(cPtr, true);
  }

  public String xml(long indent, String namesp) {
    return (getClass() == surface_part.class) ? maeJNI.surface_part_xml__SWIG_0(swigCPtr, this, indent, namesp) : maeJNI.surface_part_xmlSwigExplicitsurface_part__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return (getClass() == surface_part.class) ? maeJNI.surface_part_xml__SWIG_1(swigCPtr, this, indent) : maeJNI.surface_part_xmlSwigExplicitsurface_part__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return (getClass() == surface_part.class) ? maeJNI.surface_part_xml__SWIG_2(swigCPtr, this) : maeJNI.surface_part_xmlSwigExplicitsurface_part__SWIG_2(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return (getClass() == surface_part.class) ? maeJNI.surface_part_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left) : maeJNI.surface_part_svgSwigExplicitsurface_part__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return (getClass() == surface_part.class) ? maeJNI.surface_part_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height) : maeJNI.surface_part_svgSwigExplicitsurface_part__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public boolean equals(i_part a) {
    return (getClass() == surface_part.class) ? maeJNI.surface_part_equals(swigCPtr, this, i_part.getCPtr(a), a) : maeJNI.surface_part_equalsSwigExplicitsurface_part(swigCPtr, this, i_part.getCPtr(a), a);
  }

}
