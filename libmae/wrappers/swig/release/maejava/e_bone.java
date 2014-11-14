/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public final class e_bone {
  public final static e_bone INVALID_BONE = new e_bone("INVALID_BONE", MaeJavaJNI.INVALID_BONE_get());
  public final static e_bone HEAD = new e_bone("HEAD", MaeJavaJNI.HEAD_get());
  public final static e_bone LEFT_UPPER_ARM = new e_bone("LEFT_UPPER_ARM", MaeJavaJNI.LEFT_UPPER_ARM_get());
  public final static e_bone LEFT_FOREARM = new e_bone("LEFT_FOREARM", MaeJavaJNI.LEFT_FOREARM_get());
  public final static e_bone LEFT_WHOLE_ARM = new e_bone("LEFT_WHOLE_ARM", MaeJavaJNI.LEFT_WHOLE_ARM_get());
  public final static e_bone RIGHT_UPPER_ARM = new e_bone("RIGHT_UPPER_ARM", MaeJavaJNI.RIGHT_UPPER_ARM_get());
  public final static e_bone RIGHT_FOREARM = new e_bone("RIGHT_FOREARM", MaeJavaJNI.RIGHT_FOREARM_get());
  public final static e_bone RIGHT_WHOLE_ARM = new e_bone("RIGHT_WHOLE_ARM", MaeJavaJNI.RIGHT_WHOLE_ARM_get());
  public final static e_bone LEFT_THIGH = new e_bone("LEFT_THIGH", MaeJavaJNI.LEFT_THIGH_get());
  public final static e_bone LEFT_SHANK = new e_bone("LEFT_SHANK", MaeJavaJNI.LEFT_SHANK_get());
  public final static e_bone LEFT_WHOLE_LEG = new e_bone("LEFT_WHOLE_LEG", MaeJavaJNI.LEFT_WHOLE_LEG_get());
  public final static e_bone RIGHT_THIGH = new e_bone("RIGHT_THIGH", MaeJavaJNI.RIGHT_THIGH_get());
  public final static e_bone RIGHT_SHANK = new e_bone("RIGHT_SHANK", MaeJavaJNI.RIGHT_SHANK_get());
  public final static e_bone RIGHT_WHOLE_LEG = new e_bone("RIGHT_WHOLE_LEG", MaeJavaJNI.RIGHT_WHOLE_LEG_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static e_bone swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + e_bone.class + " with value " + swigValue);
  }

  private e_bone(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private e_bone(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private e_bone(String swigName, e_bone swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static e_bone[] swigValues = { INVALID_BONE, HEAD, LEFT_UPPER_ARM, LEFT_FOREARM, LEFT_WHOLE_ARM, RIGHT_UPPER_ARM, RIGHT_FOREARM, RIGHT_WHOLE_ARM, LEFT_THIGH, LEFT_SHANK, LEFT_WHOLE_LEG, RIGHT_THIGH, RIGHT_SHANK, RIGHT_WHOLE_LEG };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

