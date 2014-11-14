/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maenitejava;

public class DeviceInfoVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected DeviceInfoVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DeviceInfoVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MaeNiteJavaJNI.delete_DeviceInfoVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DeviceInfoVector() {
    this(MaeNiteJavaJNI.new_DeviceInfoVector__SWIG_0(), true);
  }

  public DeviceInfoVector(long n) {
    this(MaeNiteJavaJNI.new_DeviceInfoVector__SWIG_1(n), true);
  }

  public long size() {
    return MaeNiteJavaJNI.DeviceInfoVector_size(swigCPtr, this);
  }

  public long capacity() {
    return MaeNiteJavaJNI.DeviceInfoVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    MaeNiteJavaJNI.DeviceInfoVector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return MaeNiteJavaJNI.DeviceInfoVector_empty(swigCPtr, this);
  }

  public void clear() {
    MaeNiteJavaJNI.DeviceInfoVector_clear(swigCPtr, this);
  }

  public void pushBack(SWIGTYPE_p_std__shared_ptrT_device_info_t x) {
    MaeNiteJavaJNI.DeviceInfoVector_pushBack(swigCPtr, this, SWIGTYPE_p_std__shared_ptrT_device_info_t.getCPtr(x));
  }

  public SWIGTYPE_p_std__shared_ptrT_device_info_t get(int i) {
    return new SWIGTYPE_p_std__shared_ptrT_device_info_t(MaeNiteJavaJNI.DeviceInfoVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, SWIGTYPE_p_std__shared_ptrT_device_info_t val) {
    MaeNiteJavaJNI.DeviceInfoVector_set(swigCPtr, this, i, SWIGTYPE_p_std__shared_ptrT_device_info_t.getCPtr(val));
  }

}
