package com.YYSchedule.common.mybatis.pojo;

public class TaskTimestamp {
    private Long taskId;

    private String taskPhase;

    private Long loadedTime;

    private Long issuedTime;

    private Long startedTime;

    private Long finishedTime;

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

    public Long getLoadedTime() {
        return loadedTime;
    }

    public void setLoadedTime(Long loadedTime) {
        this.loadedTime = loadedTime;
    }

    public Long getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Long issuedTime) {
        this.issuedTime = issuedTime;
    }

    public Long getStartedTime() {
        return startedTime;
    }

    public void setStartedTime(Long startedTime) {
        this.startedTime = startedTime;
    }

    public Long getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
    }
}