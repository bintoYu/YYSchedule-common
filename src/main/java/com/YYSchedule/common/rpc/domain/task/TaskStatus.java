/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.YYSchedule.common.rpc.domain.task;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * task status enumeration
 */
public enum TaskStatus implements org.apache.thrift.TEnum {
  COMMITTED(0),
  DISTRIBUTE_FAILED(1),
  DISTRIBUTED(2),
  COLLECTD(3),
  ACCEPT_FAILED(4),
  ACCEPTED(5),
  RUNNING(6),
  INTERRUPTED(7),
  KILLED(8),
  TIMEOUT(9),
  FAILURE(10),
  FINISHED(11);

  private final int value;

  private TaskStatus(int value) {
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
  public static TaskStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return COMMITTED;
      case 1:
        return DISTRIBUTE_FAILED;
      case 2:
        return DISTRIBUTED;
      case 3:
        return COLLECTD;
      case 4:
        return ACCEPT_FAILED;
      case 5:
        return ACCEPTED;
      case 6:
        return RUNNING;
      case 7:
        return INTERRUPTED;
      case 8:
        return KILLED;
      case 9:
        return TIMEOUT;
      case 10:
        return FAILURE;
      case 11:
        return FINISHED;
      default:
        return null;
    }
  }
}
