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

  protected general_skeleton(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(general_skeleton obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        maeJNI.delete_general_skeleton(swigCPtr);
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
    maeJNI.general_skeleton_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    maeJNI.general_skeleton_change_ownership(this, swigCPtr, true);
  }

  public general_skeleton() {
    this(maeJNI.new_general_skeleton__SWIG_0(), true);
    maeJNI.general_skeleton_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public general_skeleton(hierarchy hierarchy) {
    this(maeJNI.new_general_skeleton__SWIG_1(hierarchy.getCPtr(hierarchy), hierarchy), true);
    maeJNI.general_skeleton_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void set_joint(int body_part, general_joint joint) {
    if (getClass() == general_skeleton.class) maeJNI.general_skeleton_set_joint(swigCPtr, this, body_part, general_joint.getCPtr(joint), joint); else maeJNI.general_skeleton_set_jointSwigExplicitgeneral_skeleton(swigCPtr, this, body_part, general_joint.getCPtr(joint), joint);
  }

  public general_joint get_joint(int body_part) {
    long cPtr = (getClass() == general_skeleton.class) ? maeJNI.general_skeleton_get_joint(swigCPtr, this, body_part) : maeJNI.general_skeleton_get_jointSwigExplicitgeneral_skeleton(swigCPtr, this, body_part);
    return (cPtr == 0) ? null : new general_joint(cPtr, true);
  }

  public hierarchy get_hierarchy() {
    long cPtr = (getClass() == general_skeleton.class) ? maeJNI.general_skeleton_get_hierarchy(swigCPtr, this) : maeJNI.general_skeleton_get_hierarchySwigExplicitgeneral_skeleton(swigCPtr, this);
    return (cPtr == 0) ? null : new hierarchy(cPtr, true);
  }

  public void set_hierarchy(hierarchy hierarchy) {
    if (getClass() == general_skeleton.class) maeJNI.general_skeleton_set_hierarchy(swigCPtr, this, hierarchy.getCPtr(hierarchy), hierarchy); else maeJNI.general_skeleton_set_hierarchySwigExplicitgeneral_skeleton(swigCPtr, this, hierarchy.getCPtr(hierarchy), hierarchy);
  }

  public void set_top_down(bone top_down) {
    if (getClass() == general_skeleton.class) maeJNI.general_skeleton_set_top_down(swigCPtr, this, bone.getCPtr(top_down), top_down); else maeJNI.general_skeleton_set_top_downSwigExplicitgeneral_skeleton(swigCPtr, this, bone.getCPtr(top_down), top_down);
  }

  public bone get_top_down() {
    long cPtr = (getClass() == general_skeleton.class) ? maeJNI.general_skeleton_get_top_down(swigCPtr, this) : maeJNI.general_skeleton_get_top_downSwigExplicitgeneral_skeleton(swigCPtr, this);
    return (cPtr == 0) ? null : new bone(cPtr, true);
  }

  public void set_right_left(bone right_left) {
    if (getClass() == general_skeleton.class) maeJNI.general_skeleton_set_right_left(swigCPtr, this, bone.getCPtr(right_left), right_left); else maeJNI.general_skeleton_set_right_leftSwigExplicitgeneral_skeleton(swigCPtr, this, bone.getCPtr(right_left), right_left);
  }

  public bone get_right_left() {
    long cPtr = (getClass() == general_skeleton.class) ? maeJNI.general_skeleton_get_right_left(swigCPtr, this) : maeJNI.general_skeleton_get_right_leftSwigExplicitgeneral_skeleton(swigCPtr, this);
    return (cPtr == 0) ? null : new bone(cPtr, true);
  }

  public void set_weight(vec3d weight) {
    if (getClass() == general_skeleton.class) maeJNI.general_skeleton_set_weight(swigCPtr, this, vec3d.getCPtr(weight), weight); else maeJNI.general_skeleton_set_weightSwigExplicitgeneral_skeleton(swigCPtr, this, vec3d.getCPtr(weight), weight);
  }

  public vec3d get_weight() {
    long cPtr = (getClass() == general_skeleton.class) ? maeJNI.general_skeleton_get_weight(swigCPtr, this) : maeJNI.general_skeleton_get_weightSwigExplicitgeneral_skeleton(swigCPtr, this);
    return (cPtr == 0) ? null : new vec3d(cPtr, true);
  }

  public String str() {
    return (getClass() == general_skeleton.class) ? maeJNI.general_skeleton_str(swigCPtr, this) : maeJNI.general_skeleton_strSwigExplicitgeneral_skeleton(swigCPtr, this);
  }

  public String ply_str() {
    return (getClass() == general_skeleton.class) ? maeJNI.general_skeleton_ply_str(swigCPtr, this) : maeJNI.general_skeleton_ply_strSwigExplicitgeneral_skeleton(swigCPtr, this);
  }

  public void ply_file(String filename) {
    if (getClass() == general_skeleton.class) maeJNI.general_skeleton_ply_file(swigCPtr, this, filename); else maeJNI.general_skeleton_ply_fileSwigExplicitgeneral_skeleton(swigCPtr, this, filename);
  }

}
