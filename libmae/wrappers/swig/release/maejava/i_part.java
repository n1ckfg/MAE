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
  private boolean swigCMemOwn;

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
        w_e_boneJNI.delete_i_part(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String xml(long indent, String namesp) {
    return w_e_boneJNI.i_part_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return w_e_boneJNI.i_part_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return w_e_boneJNI.i_part_xml__SWIG_2(swigCPtr, this);
  }

  public boolean equals(i_part a) {
    return w_e_boneJNI.i_part_equals(swigCPtr, this, i_part.getCPtr(a), a);
  }

}
