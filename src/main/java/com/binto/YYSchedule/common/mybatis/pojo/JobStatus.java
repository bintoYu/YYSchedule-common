package com.binto.YYSchedule.common.mybatis.pojo;

import java.util.Date;

public class JobStatus {
    private Integer jobId;

    private Date committedTime;

    private Integer taskNum;

    private Double jobStatus;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Date getCommittedTime() {
        return committedTime;
    }

    public void setCommittedTime(Date committedTime) {
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