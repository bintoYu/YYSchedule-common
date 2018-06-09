package com.binto.YYSchedule.common.mybatis.pojo;

public class JobBasic {
    private Integer jobId;

    private String jobDistributionMode;

    private String taskPhase;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobDistributionMode() {
        return jobDistributionMode;
    }

    public void setJobDistributionMode(String jobDistributionMode) {
        this.jobDistributionMode = jobDistributionMode == null ? null : jobDistributionMode.trim();
    }

    public String getTaskPhase() {
        return taskPhase;
    }

    public void setTaskPhase(String taskPhase) {
        this.taskPhase = taskPhase == null ? null : taskPhase.trim();
    }
}