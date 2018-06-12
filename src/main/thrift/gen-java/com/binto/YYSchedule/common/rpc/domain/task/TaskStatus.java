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
 * task status enumeration
 */
public enum TaskStatus implements org.apache.thrift.TEnum {
  COMMITTED(0),
  SCHEDULING_FAILED(1),
  SCHEDULED(2),
  ISSUE_FAILED(3),
  ISSUED(4),
  ACCEPT_FAILED(5),
  ACCEPTED(6),
  RUNNING(7),
  INTERRUPTED(8),
  KILLED(9),
  TIMEOUT(10),
  FAILURE(11),
  FINISHED(12);

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
        return SCHEDULING_FAILED;
      case 2:
        return SCHEDULED;
      case 3:
        return ISSUE_FAILED;
      case 4:
        return ISSUED;
      case 5:
        return ACCEPT_FAILED;
      case 6:
        return ACCEPTED;
      case 7:
        return RUNNING;
      case 8:
        return INTERRUPTED;
      case 9:
        return KILLED;
      case 10:
        return TIMEOUT;
      case 11:
        return FAILURE;
      case 12:
        return FINISHED;
      default:
        return null;
    }
  }
}