/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class i_degree_sign {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public i_degree_sign(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(i_degree_sign obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_i_degree_sign(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(i_degree_sign a) {
    return MaeJavaJNI.i_degree_sign_equals(swigCPtr, this, i_degree_sign.getCPtr(a), a);
  }

  public String xml(long indent, String namesp, boolean print_type) {
    return MaeJavaJNI.i_degree_sign_xml__SWIG_0(swigCPtr, this, indent, namesp, print_type);
  }

  public String xml(long indent, String namesp) {
    return MaeJavaJNI.i_degree_sign_xml__SWIG_1(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaeJavaJNI.i_degree_sign_xml__SWIG_2(swigCPtr, this, indent);
  }

  public String xml() {
    return MaeJavaJNI.i_degree_sign_xml__SWIG_3(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return MaeJavaJNI.i_degree_sign_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return MaeJavaJNI.i_degree_sign_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

}
