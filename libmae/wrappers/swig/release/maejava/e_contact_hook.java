/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public final class e_contact_hook {
  public final static e_contact_hook NONE = new e_contact_hook("NONE");
  public final static e_contact_hook NAIL = new e_contact_hook("NAIL");
  public final static e_contact_hook TIP = new e_contact_hook("TIP");
  public final static e_contact_hook PAD = new e_contact_hook("PAD");
  public final static e_contact_hook BALL = new e_contact_hook("BALL");
  public final static e_contact_hook HALF_BALL = new e_contact_hook("HALF_BALL");
  public final static e_contact_hook QUARTER_BALL = new e_contact_hook("QUARTER_BALL");
  public final static e_contact_hook FOOT = new e_contact_hook("FOOT");
  public final static e_contact_hook HALF_HEEL = new e_contact_hook("HALF_HEEL");
  public final static e_contact_hook QUARTER_HEEL = new e_contact_hook("QUARTER_HEEL");
  public final static e_contact_hook FULL_HEEL = new e_contact_hook("FULL_HEEL");
  public final static e_contact_hook FULL_BALL = new e_contact_hook("FULL_BALL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static e_contact_hook swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + e_contact_hook.class + " with value " + swigValue);
  }

  private e_contact_hook(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private e_contact_hook(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private e_contact_hook(String swigName, e_contact_hook swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static e_contact_hook[] swigValues = { NONE, NAIL, TIP, PAD, BALL, HALF_BALL, QUARTER_BALL, FOOT, HALF_HEEL, QUARTER_HEEL, FULL_HEEL, FULL_BALL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

