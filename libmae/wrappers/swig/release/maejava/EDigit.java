/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public final class EDigit {
  public final static EDigit NONE_DIGIT = new EDigit("NONE_DIGIT");
  public final static EDigit THUMB = new EDigit("THUMB");
  public final static EDigit INDEXFINGER = new EDigit("INDEXFINGER");
  public final static EDigit MIDDLEFINGER = new EDigit("MIDDLEFINGER");
  public final static EDigit RINGFINGER = new EDigit("RINGFINGER");
  public final static EDigit LITTLEFINGER = new EDigit("LITTLEFINGER");
  public final static EDigit BIGTOE = new EDigit("BIGTOE");
  public final static EDigit LONGTOE = new EDigit("LONGTOE");
  public final static EDigit MIDDLETOE = new EDigit("MIDDLETOE");
  public final static EDigit RINGTOE = new EDigit("RINGTOE");
  public final static EDigit LITTLETOE = new EDigit("LITTLETOE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static EDigit swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + EDigit.class + " with value " + swigValue);
  }

  private EDigit(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private EDigit(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private EDigit(String swigName, EDigit swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static EDigit[] swigValues = { NONE_DIGIT, THUMB, INDEXFINGER, MIDDLEFINGER, RINGFINGER, LITTLEFINGER, BIGTOE, LONGTOE, MIDDLETOE, RINGTOE, LITTLETOE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
