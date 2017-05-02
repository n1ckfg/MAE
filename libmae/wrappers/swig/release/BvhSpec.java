/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class BvhSpec {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public BvhSpec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(BvhSpec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_BvhSpec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BvhSpec(String left_anchor, String right_anchor, String top_anchor, String bottom_anchor, StringIntMap string_id_map, StringBoolMap string_basis_map) {
    this(MaeJavaJNI.new_BvhSpec(left_anchor, right_anchor, top_anchor, bottom_anchor, StringIntMap.getCPtr(string_id_map), string_id_map, StringBoolMap.getCPtr(string_basis_map), string_basis_map), true);
  }

  public StringIntMap getIdMap() {
    return new StringIntMap(MaeJavaJNI.BvhSpec_getIdMap(swigCPtr, this), true);
  }

  public StringBoolMap getTorsoMap() {
    return new StringBoolMap(MaeJavaJNI.BvhSpec_getTorsoMap(swigCPtr, this), true);
  }

  public StringBoolMap getBasisMap() {
    return new StringBoolMap(MaeJavaJNI.BvhSpec_getBasisMap(swigCPtr, this), true);
  }

  public String getLeftAnchor() {
    return MaeJavaJNI.BvhSpec_getLeftAnchor(swigCPtr, this);
  }

  public String getRightAnchor() {
    return MaeJavaJNI.BvhSpec_getRightAnchor(swigCPtr, this);
  }

  public String getTopAnchor() {
    return MaeJavaJNI.BvhSpec_getTopAnchor(swigCPtr, this);
  }

  public String getBottomAnchor() {
    return MaeJavaJNI.BvhSpec_getBottomAnchor(swigCPtr, this);
  }

  public static BvhSpec defaultSpec() {
    long cPtr = MaeJavaJNI.BvhSpec_defaultSpec();
    return (cPtr == 0) ? null : new BvhSpec(cPtr, true);
  }

  public static BvhSpec defaultHandSpec(boolean is_left) {
    long cPtr = MaeJavaJNI.BvhSpec_defaultHandSpec(is_left);
    return (cPtr == 0) ? null : new BvhSpec(cPtr, true);
  }

}
