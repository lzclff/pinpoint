/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto.flink;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TFJvmGcType implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  SERIAL(1),
  PARALLEL(2),
  CMS(3),
  G1(4);

  private final int value;

  private TFJvmGcType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TFJvmGcType findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return SERIAL;
      case 2:
        return PARALLEL;
      case 3:
        return CMS;
      case 4:
        return G1;
      default:
        return null;
    }
  }
}
