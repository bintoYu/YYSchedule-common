/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.binto.YYSchedule.common.rpc.domain.task;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * task type enumeration
 */
public enum TaskPhase implements org.apache.thrift.TEnum {
  COMMON(0),
  STATIC(1);

  private final int value;

  private TaskPhase(int value) {
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
  public static TaskPhase findByValue(int value) { 
    switch (value) {
      case 0:
        return COMMON;
      case 1:
        return STATIC;
      default:
        return null;
    }
  }
}
