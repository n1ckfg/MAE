/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class cancellation_symbol extends i_symbol {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected cancellation_symbol(long cPtr, boolean cMemoryOwn) {
    super(w_e_boneJNI.cancellation_symbol_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cancellation_symbol obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        w_e_boneJNI.delete_cancellation_symbol(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public cancellation_symbol(e_cancel cancel) {
    this(w_e_boneJNI.new_cancellation_symbol(cancel.swigValue()), true);
  }

  public e_cancel get_cancel() {
    return e_cancel.swigToEnum(w_e_boneJNI.cancellation_symbol_get_cancel(swigCPtr, this));
  }

  public boolean equals(i_symbol a) {
    return w_e_boneJNI.cancellation_symbol_equals(swigCPtr, this, i_symbol.getCPtr(a), a);
  }

  public String xml(long indent, String namesp) {
    return w_e_boneJNI.cancellation_symbol_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return w_e_boneJNI.cancellation_symbol_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return w_e_boneJNI.cancellation_symbol_xml__SWIG_2(swigCPtr, this);
  }

  public String str() {
    return w_e_boneJNI.cancellation_symbol_str(swigCPtr, this);
  }

}