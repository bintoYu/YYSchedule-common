package com.YYSchedule.common.mybatis.pojo;

public class TaskBasic {
    private Long taskId;

    private String taskPhase;

    private String taskStatus;

    private Long loadedTime;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
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

    public Long getLoadedTime() {
        return loadedTime;
    }

    public void setLoadedTime(Long loadedTime) {
        this.loadedTime = loadedTime;
    }
}