/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class string_bool_map {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected string_bool_map(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(string_bool_map obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        maeJNI.delete_string_bool_map(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public string_bool_map() {
    this(maeJNI.new_string_bool_map__SWIG_0(), true);
  }

  public string_bool_map(string_bool_map arg0) {
    this(maeJNI.new_string_bool_map__SWIG_1(string_bool_map.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return maeJNI.string_bool_map_size(swigCPtr, this);
  }

  public boolean empty() {
    return maeJNI.string_bool_map_empty(swigCPtr, this);
  }

  public void clear() {
    maeJNI.string_bool_map_clear(swigCPtr, this);
  }

  public boolean get(String key) {
    return maeJNI.string_bool_map_get(swigCPtr, this, key);
  }

  public void set(String key, boolean x) {
    maeJNI.string_bool_map_set(swigCPtr, this, key, x);
  }

  public void del(String key) {
    maeJNI.string_bool_map_del(swigCPtr, this, key);
  }

  public boolean has_key(String key) {
    return maeJNI.string_bool_map_has_key(swigCPtr, this, key);
  }

}
