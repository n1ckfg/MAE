/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class laban_sequence_reader {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected laban_sequence_reader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(laban_sequence_reader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_laban_sequence_reader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public laban_sequence_reader() {
    this(w_e_boneJNI.new_laban_sequence_reader(), true);
  }

  public laban_sequence read_sequence_file(String file_name) {
    long cPtr = w_e_boneJNI.laban_sequence_reader_read_sequence_file(swigCPtr, this, file_name);
    return (cPtr == 0) ? null : new laban_sequence(cPtr, true);
  }

  public laban_sequence read_sequence_str(String xml_string) {
    long cPtr = w_e_boneJNI.laban_sequence_reader_read_sequence_str(swigCPtr, this, xml_string);
    return (cPtr == 0) ? null : new laban_sequence(cPtr, true);
  }

}
