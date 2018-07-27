package com.YYSchedule.common.mybatis.pojo;

public class MissionBasic {
    private Integer missionId;

    private String missionName;

    private Long missionStartTime;

    private Integer jobCount;

    private Integer userId;

    public Integer getMissionId() {
        return missionId;
    }

    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName == null ? null : missionName.trim();
    }

    public Long getMissionStartTime() {
        return missionStartTime;
    }

    public void setMissionStartTime(Long missionStartTime) {
        this.missionStartTime = missionStartTime;
    }

    public Integer getJobCount() {
        return jobCount;
    }

    public void setJobCount(Integer jobCount) {
        this.jobCount = jobCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}