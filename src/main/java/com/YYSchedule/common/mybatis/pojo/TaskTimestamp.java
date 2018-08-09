package com.YYSchedule.common.mybatis.pojo;

public class TaskTimestamp {
    private Long taskId;

    private Long loadedTime;

    private Long distributedTime;

    private Long startedTime;

    private Long finishedTime;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getLoadedTime() {
        return loadedTime;
    }

    public void setLoadedTime(Long loadedTime) {
        this.loadedTime = loadedTime;
    }

    public Long getDistributedTime() {
        return distributedTime;
    }

    public void setDistributedTime(Long distributedTime) {
        this.distributedTime = distributedTime;
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