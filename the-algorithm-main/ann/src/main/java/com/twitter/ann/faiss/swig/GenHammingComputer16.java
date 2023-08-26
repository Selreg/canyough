/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.twitter.ann.faiss;

public class GenHammingComputer16 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GenHammingComputer16(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GenHammingComputer16 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_GenHammingComputer16(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setA0(long value) {
    swigfaissJNI.GenHammingComputer16_a0_set(swigCPtr, this, value);
  }

  public long getA0() {
    return swigfaissJNI.GenHammingComputer16_a0_get(swigCPtr, this);
  }

  public void setA1(long value) {
    swigfaissJNI.GenHammingComputer16_a1_set(swigCPtr, this, value);
  }

  public long getA1() {
    return swigfaissJNI.GenHammingComputer16_a1_get(swigCPtr, this);
  }

  public GenHammingComputer16(SWIGTYPE_p_unsigned_char a8, int code_size) {
    this(swigfaissJNI.new_GenHammingComputer16(SWIGTYPE_p_unsigned_char.getCPtr(a8), code_size), true);
  }

  public int hamming(SWIGTYPE_p_unsigned_char b8) {
    return swigfaissJNI.GenHammingComputer16_hamming(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(b8));
  }

}
