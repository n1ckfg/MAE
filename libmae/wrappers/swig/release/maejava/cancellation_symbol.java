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

  public cancellation_symbol(long cPtr, boolean cMemoryOwn) {
    super(MaejavaJNI.cancellation_symbol_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(cancellation_symbol obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        MaejavaJNI.delete_cancellation_symbol(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public cancellation_symbol(e_cancel cancel) {
    this(MaejavaJNI.new_cancellation_symbol(cancel.swigValue()), true);
  }

  public e_cancel get_cancel() {
    return e_cancel.swigToEnum(MaejavaJNI.cancellation_symbol_get_cancel(swigCPtr, this));
  }

  public boolean equals(i_symbol a) {
    return MaejavaJNI.cancellation_symbol_equals(swigCPtr, this, i_symbol.getCPtr(a), a);
  }

  public String xml(long indent, String namesp) {
    return MaejavaJNI.cancellation_symbol_xml__SWIG_0(swigCPtr, this, indent, namesp);
  }

  public String xml(long indent) {
    return MaejavaJNI.cancellation_symbol_xml__SWIG_1(swigCPtr, this, indent);
  }

  public String xml() {
    return MaejavaJNI.cancellation_symbol_xml__SWIG_2(swigCPtr, this);
  }

  public String svg(String identifier, double posx, double posy, double width, double height, boolean left) {
    return MaejavaJNI.cancellation_symbol_svg__SWIG_0(swigCPtr, this, identifier, posx, posy, width, height, left);
  }

  public String svg(String identifier, double posx, double posy, double width, double height) {
    return MaejavaJNI.cancellation_symbol_svg__SWIG_1(swigCPtr, this, identifier, posx, posy, width, height);
  }

  public String str() {
    return MaejavaJNI.cancellation_symbol_str(swigCPtr, this);
  }

}
