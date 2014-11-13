/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class bone {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected bone(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaejavaJNI.delete_bone(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public bone() {
    this(MaejavaJNI.new_bone__SWIG_0(), true);
  }

  public bone(int id, String name, int from, int to) {
    this(MaejavaJNI.new_bone__SWIG_1(id, name, from, to), true);
  }

  public bone(int id, String name, int from, int to, int middle_joint) {
    this(MaejavaJNI.new_bone__SWIG_2(id, name, from, to, middle_joint), true);
  }

  public bone(e_bone eb) {
    this(MaejavaJNI.new_bone__SWIG_3(eb.swigValue()), true);
  }

  public int get_id() {
    return MaejavaJNI.bone_get_id(swigCPtr, this);
  }

  public String get_name() {
    return MaejavaJNI.bone_get_name(swigCPtr, this);
  }

  public int get_from() {
    return MaejavaJNI.bone_get_from(swigCPtr, this);
  }

  public int get_to() {
    return MaejavaJNI.bone_get_to(swigCPtr, this);
  }

  public boolean has_middle_joint() {
    return MaejavaJNI.bone_has_middle_joint(swigCPtr, this);
  }

  public int get_middle_joint() {
    return MaejavaJNI.bone_get_middle_joint(swigCPtr, this);
  }

  public static bone_vector default_bones() {
    return new bone_vector(MaejavaJNI.bone_default_bones(), true);
  }

  public final static int RESERVED_TOP_DOWN = MaejavaJNI.bone_RESERVED_TOP_DOWN_get();
  public final static int RESERVED_RIGHT_LEFT = MaejavaJNI.bone_RESERVED_RIGHT_LEFT_get();
}
