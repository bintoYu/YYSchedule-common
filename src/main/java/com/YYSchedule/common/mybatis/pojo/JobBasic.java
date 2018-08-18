package com.YYSchedule.common.mybatis.pojo;

public class JobBasic {
    private Long jobId;

    private String jobPriority;

    private String taskPhase;

    private Long committedTime;

    private Integer taskNum;

    private Integer finishNum;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobPriority() {
        return jobPriority;
    }

    public void setJobPriority(String jobPriority) {
        this.jobPriority = jobPriority == null ? null : jobPriority.trim();
    }

    public String getTaskPhase() {
        return taskPhase;
    }

    public void setTaskPhase(String taskPhase) {
        this.taskPhase = taskPhase == null ? null : taskPhase.trim();
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

    public Integer getFinishNum() {
        return finishNum;
    }

    public void setFinishNum(Integer finishNum) {
        this.finishNum = finishNum;
    }
}