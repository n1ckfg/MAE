/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class string_int_map {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected string_int_map(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(string_int_map obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_string_int_map(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public string_int_map() {
    this(w_e_boneJNI.new_string_int_map__SWIG_0(), true);
  }

  public string_int_map(string_int_map arg0) {
    this(w_e_boneJNI.new_string_int_map__SWIG_1(string_int_map.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return w_e_boneJNI.string_int_map_size(swigCPtr, this);
  }

  public boolean empty() {
    return w_e_boneJNI.string_int_map_empty(swigCPtr, this);
  }

  public void clear() {
    w_e_boneJNI.string_int_map_clear(swigCPtr, this);
  }

  public int get(String key) {
    return w_e_boneJNI.string_int_map_get(swigCPtr, this, key);
  }

  public void set(String key, int x) {
    w_e_boneJNI.string_int_map_set(swigCPtr, this, key, x);
  }

  public void del(String key) {
    w_e_boneJNI.string_int_map_del(swigCPtr, this, key);
  }

  public boolean has_key(String key) {
    return w_e_boneJNI.string_int_map_has_key(swigCPtr, this, key);
  }

}