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
    super(w_e_boneJNI.prop_SWIGSmartPtrUpcast(cPtr), true);
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
        w_e_boneJNI.delete_prop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public prop(String name, String description) {
    this(w_e_boneJNI.new_prop__SWIG_0(name, description), true);
  }

  public prop(String name) {
    this(w_e_boneJNI.new_prop__SWIG_1(name), true);
  }

  public String get_name() {
    return w_e_boneJNI.prop_get_name(swigCPtr, this);
  }

  public String get_description() {
    return w_e_boneJNI.prop_get_description(swigCPtr, this);
  }

  public String xml(long indent, String namesp) {
    return w_e_boneJNI.prop_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return w_e_boneJNI.prop_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return w_e_boneJNI.prop_xml__SWIG_2(swigCPtr, this);
  }

  public boolean equals(i_pre_sign a) {
    return w_e_boneJNI.prop_equals(swigCPtr, this, i_pre_sign.getCPtr(a), a);
  }

}
