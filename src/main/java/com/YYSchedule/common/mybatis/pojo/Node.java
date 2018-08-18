package com.YYSchedule.common.mybatis.pojo;

public class Node {
    private Integer id;

    private String nodeId;

    private Boolean isBroken;

    private Integer successNum;

    private Integer taskNum;

    private Double cpuUsePerc;

    private Long freeMem;

    private Long jvmFreeMem;

    private Integer queueLength;

    private Integer threadNum;

    private String taskPhase;

    private Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public Boolean getIsBroken() {
        return isBroken;
    }

    public void setIsBroken(Boolean isBroken) {
        this.isBroken = isBroken;
    }

    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public Integer getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
    }

    public Double getCpuUsePerc() {
        return cpuUsePerc;
    }

    public void setCpuUsePerc(Double cpuUsePerc) {
        this.cpuUsePerc = cpuUsePerc;
    }

    public Long getFreeMem() {
        return freeMem;
    }

    public void setFreeMem(Long freeMem) {
        this.freeMem = freeMem;
    }

    public Long getJvmFreeMem() {
        return jvmFreeMem;
    }

    public void setJvmFreeMem(Long jvmFreeMem) {
        this.jvmFreeMem = jvmFreeMem;
    }

    public Integer getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(Integer queueLength) {
        this.queueLength = queueLength;
    }

    public Integer getThreadNum() {
        return threadNum;
    }

    public void setThreadNum(Integer threadNum) {
        this.threadNum = threadNum;
    }

    public String getTaskPhase() {
        return taskPhase;
    }

    public void setTaskPhase(String taskPhase) {
        this.taskPhase = taskPhase == null ? null : taskPhase.trim();
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}