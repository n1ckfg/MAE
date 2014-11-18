/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class LabanSequenceReader {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public LabanSequenceReader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(LabanSequenceReader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_LabanSequenceReader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LabanSequenceReader() {
    this(MaeJavaJNI.new_LabanSequenceReader(), true);
  }

  public LabanSequence readSequenceFile(String file_name) {
    long cPtr = MaeJavaJNI.LabanSequenceReader_readSequenceFile(swigCPtr, this, file_name);
    return (cPtr == 0) ? null : new LabanSequence(cPtr, true);
  }

  public LabanSequence readSequenceStr(String xml_string) {
    long cPtr = MaeJavaJNI.LabanSequenceReader_readSequenceStr(swigCPtr, this, xml_string);
    return (cPtr == 0) ? null : new LabanSequence(cPtr, true);
  }

}