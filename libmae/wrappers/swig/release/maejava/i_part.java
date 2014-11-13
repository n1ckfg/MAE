/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class i_part {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected i_part(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(i_part obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        maeJNI.delete_i_part(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    maeJNI.i_part_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    maeJNI.i_part_change_ownership(this, swigCPtr, true);
  }

  public String xml(long indent, String namesp) {
    return maeJNI.i_part_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return maeJNI.i_part_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return maeJNI.i_part_xml__SWIG_2(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return maeJNI.i_part_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return maeJNI.i_part_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public boolean equals(i_part a) {
    return maeJNI.i_part_equals(swigCPtr, this, i_part.getCPtr(a), a);
  }

  public i_part() {
    this(maeJNI.new_i_part(), true);
    maeJNI.i_part_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
