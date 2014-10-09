/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class general_joint {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected general_joint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(general_joint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_general_joint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public general_joint() {
    this(w_e_boneJNI.new_general_joint__SWIG_0(), true);
  }

  public general_joint(double x, double y, double z, double rotation, double confidence) {
    this(w_e_boneJNI.new_general_joint__SWIG_1(x, y, z, rotation, confidence), true);
  }

  public general_joint(double x, double y, double z, double rotation) {
    this(w_e_boneJNI.new_general_joint__SWIG_2(x, y, z, rotation), true);
  }

  public general_joint(double x, double y, double z) {
    this(w_e_boneJNI.new_general_joint__SWIG_3(x, y, z), true);
  }

  public general_joint(SWIGTYPE_p_std__shared_ptrT_mae__math__vec3d_t pos, double rotation, double confidence) {
    this(w_e_boneJNI.new_general_joint__SWIG_4(SWIGTYPE_p_std__shared_ptrT_mae__math__vec3d_t.getCPtr(pos), rotation, confidence), true);
  }

  public general_joint(SWIGTYPE_p_std__shared_ptrT_mae__math__vec3d_t pos, double rotation) {
    this(w_e_boneJNI.new_general_joint__SWIG_5(SWIGTYPE_p_std__shared_ptrT_mae__math__vec3d_t.getCPtr(pos), rotation), true);
  }

  public general_joint(SWIGTYPE_p_std__shared_ptrT_mae__math__vec3d_t pos) {
    this(w_e_boneJNI.new_general_joint__SWIG_6(SWIGTYPE_p_std__shared_ptrT_mae__math__vec3d_t.getCPtr(pos)), true);
  }

  public void set_x(double x) {
    w_e_boneJNI.general_joint_set_x(swigCPtr, this, x);
  }

  public double get_x() {
    return w_e_boneJNI.general_joint_get_x(swigCPtr, this);
  }

  public void set_y(double y) {
    w_e_boneJNI.general_joint_set_y(swigCPtr, this, y);
  }

  public double get_y() {
    return w_e_boneJNI.general_joint_get_y(swigCPtr, this);
  }

  public void set_z(double z) {
    w_e_boneJNI.general_joint_set_z(swigCPtr, this, z);
  }

  public double get_z() {
    return w_e_boneJNI.general_joint_get_z(swigCPtr, this);
  }

  public void set_valid(boolean is_valid) {
    w_e_boneJNI.general_joint_set_valid(swigCPtr, this, is_valid);
  }

  public boolean is_valid() {
    return w_e_boneJNI.general_joint_is_valid(swigCPtr, this);
  }

  public void set_confidence(double confidence) {
    w_e_boneJNI.general_joint_set_confidence(swigCPtr, this, confidence);
  }

  public double get_confidence() {
    return w_e_boneJNI.general_joint_get_confidence(swigCPtr, this);
  }

  public void set_rotation(double rotation) {
    w_e_boneJNI.general_joint_set_rotation(swigCPtr, this, rotation);
  }

  public double get_rotation() {
    return w_e_boneJNI.general_joint_get_rotation(swigCPtr, this);
  }

  public SWIGTYPE_p_std__shared_ptrT_mae__math__vec3d_t vec() {
    return new SWIGTYPE_p_std__shared_ptrT_mae__math__vec3d_t(w_e_boneJNI.general_joint_vec(swigCPtr, this), true);
  }

  public boolean equals_val(general_joint joint) {
    return w_e_boneJNI.general_joint_equals_val(swigCPtr, this, general_joint.getCPtr(joint), joint);
  }

  public boolean equals(general_joint joint) {
    return w_e_boneJNI.general_joint_equals(swigCPtr, this, general_joint.getCPtr(joint), joint);
  }

  public String str() {
    return w_e_boneJNI.general_joint_str(swigCPtr, this);
  }

}