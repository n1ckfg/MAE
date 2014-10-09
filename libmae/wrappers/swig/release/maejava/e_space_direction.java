/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public final class e_space_direction {
  public final static e_space_direction NONE = new e_space_direction("NONE");
  public final static e_space_direction LEFT = new e_space_direction("LEFT");
  public final static e_space_direction FRONT_LEFT = new e_space_direction("FRONT_LEFT");
  public final static e_space_direction FRONT = new e_space_direction("FRONT");
  public final static e_space_direction FRONT_RIGHT = new e_space_direction("FRONT_RIGHT");
  public final static e_space_direction RIGHT = new e_space_direction("RIGHT");
  public final static e_space_direction BACK_RIGHT = new e_space_direction("BACK_RIGHT");
  public final static e_space_direction BACK = new e_space_direction("BACK");
  public final static e_space_direction BACK_LEFT = new e_space_direction("BACK_LEFT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static e_space_direction swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + e_space_direction.class + " with value " + swigValue);
  }

  private e_space_direction(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private e_space_direction(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private e_space_direction(String swigName, e_space_direction swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static e_space_direction[] swigValues = { NONE, LEFT, FRONT_LEFT, FRONT, FRONT_RIGHT, RIGHT, BACK_RIGHT, BACK, BACK_LEFT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

