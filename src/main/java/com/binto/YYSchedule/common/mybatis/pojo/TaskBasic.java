package com.binto.YYSchedule.common.mybatis.pojo;

public class TaskBasic {
    private Integer taskId;

    private String taskPriority;

    private String taskPhase;

    private String taskStatus;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority == null ? null : taskPriority.trim();
    }

    public String getTaskPhase() {
        return taskPhase;
    }

    public void setTaskPhase(String taskPhase) {
        this.taskPhase = taskPhase == null ? null : taskPhase.trim();
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }
}