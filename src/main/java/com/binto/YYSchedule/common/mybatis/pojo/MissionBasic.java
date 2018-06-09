package com.binto.YYSchedule.common.mybatis.pojo;

import java.util.Date;

public class MissionBasic {
    private Integer missionId;

    private String missionName;

    private Date missionStartTime;

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

    public Date getMissionStartTime() {
        return missionStartTime;
    }

    public void setMissionStartTime(Date missionStartTime) {
        this.missionStartTime = missionStartTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}