package com.YYSchedule.common.mybatis.pojo;

public class JobStatus {
    private Long jobId;

    private Long committedTime;

    private Integer taskNum;

    private Double jobStatus;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getCommittedTime() {
        return committedTime;
    }

    public void setCommittedTime(Long committedTime) {
        this.committedTime = committedTime;
    }

    public Integer getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
    }

    public Double getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Double jobStatus) {
        this.jobStatus = jobStatus;
    }
}