/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class e_contact_hook_c {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected e_contact_hook_c(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(e_contact_hook_c obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeJavaJNI.delete_e_contact_hook_c(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static String str(e_contact_hook hook) {
    return MaeJavaJNI.e_contact_hook_c_str(hook.swigValue());
  }

  public static e_contact_hook_vector vec() {
    return new e_contact_hook_vector(MaeJavaJNI.e_contact_hook_c_vec(), true);
  }

  public static e_contact_hook parse(String str) {
    return e_contact_hook.swigToEnum(MaeJavaJNI.e_contact_hook_c_parse(str));
  }

  public e_contact_hook_c() {
    this(MaeJavaJNI.new_e_contact_hook_c(), true);
  }

}
