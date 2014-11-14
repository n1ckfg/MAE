/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class general_skeleton {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public general_skeleton(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(general_skeleton obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_general_skeleton(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public general_skeleton() {
    this(MaeJavaJNI.new_general_skeleton__SWIG_0(), true);
  }

  public general_skeleton(hierarchy hierarchy) {
    this(MaeJavaJNI.new_general_skeleton__SWIG_1(hierarchy.getCPtr(hierarchy), hierarchy), true);
  }

  public void set_joint(int body_part, general_joint joint) {
    MaeJavaJNI.general_skeleton_set_joint(swigCPtr, this, body_part, general_joint.getCPtr(joint), joint);
  }

  public general_joint get_joint(int body_part) {
    long cPtr = MaeJavaJNI.general_skeleton_get_joint(swigCPtr, this, body_part);
    return (cPtr == 0) ? null : new general_joint(cPtr, true);
  }

  public hierarchy get_hierarchy() {
    long cPtr = MaeJavaJNI.general_skeleton_get_hierarchy(swigCPtr, this);
    return (cPtr == 0) ? null : new hierarchy(cPtr, true);
  }

  public void set_hierarchy(hierarchy hierarchy) {
    MaeJavaJNI.general_skeleton_set_hierarchy(swigCPtr, this, hierarchy.getCPtr(hierarchy), hierarchy);
  }

  public void set_top_down(bone top_down) {
    MaeJavaJNI.general_skeleton_set_top_down(swigCPtr, this, bone.getCPtr(top_down), top_down);
  }

  public bone get_top_down() {
    long cPtr = MaeJavaJNI.general_skeleton_get_top_down(swigCPtr, this);
    return (cPtr == 0) ? null : new bone(cPtr, true);
  }

  public void set_right_left(bone right_left) {
    MaeJavaJNI.general_skeleton_set_right_left(swigCPtr, this, bone.getCPtr(right_left), right_left);
  }

  public bone get_right_left() {
    long cPtr = MaeJavaJNI.general_skeleton_get_right_left(swigCPtr, this);
    return (cPtr == 0) ? null : new bone(cPtr, true);
  }

  public void set_weight(vec3d weight) {
    MaeJavaJNI.general_skeleton_set_weight(swigCPtr, this, vec3d.getCPtr(weight), weight);
  }

  public vec3d get_weight() {
    long cPtr = MaeJavaJNI.general_skeleton_get_weight(swigCPtr, this);
    return (cPtr == 0) ? null : new vec3d(cPtr, true);
  }

  public String str() {
    return MaeJavaJNI.general_skeleton_str(swigCPtr, this);
  }

  public String ply_str() {
    return MaeJavaJNI.general_skeleton_ply_str(swigCPtr, this);
  }

  public void ply_file(String filename) {
    MaeJavaJNI.general_skeleton_ply_file(swigCPtr, this, filename);
  }

}
