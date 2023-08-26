/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.twitter.ann.faiss;

public class GenHammingComputerM8 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GenHammingComputerM8(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GenHammingComputerM8 obj) {
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
        swigfaissJNI.delete_GenHammingComputerM8(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setA(SWIGTYPE_p_unsigned_long value) {
    swigfaissJNI.GenHammingComputerM8_a_set(swigCPtr, this, SWIGTYPE_p_unsigned_long.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_long getA() {
    long cPtr = swigfaissJNI.GenHammingComputerM8_a_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long(cPtr, false);
  }

  public void setN(int value) {
    swigfaissJNI.GenHammingComputerM8_n_set(swigCPtr, this, value);
  }

  public int getN() {
    return swigfaissJNI.GenHammingComputerM8_n_get(swigCPtr, this);
  }

  public GenHammingComputerM8(SWIGTYPE_p_unsigned_char a8, int code_size) {
    this(swigfaissJNI.new_GenHammingComputerM8(SWIGTYPE_p_unsigned_char.getCPtr(a8), code_size), true);
  }

  public int hamming(SWIGTYPE_p_unsigned_char b8) {
    return swigfaissJNI.GenHammingComputerM8_hamming(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(b8));
  }

}
