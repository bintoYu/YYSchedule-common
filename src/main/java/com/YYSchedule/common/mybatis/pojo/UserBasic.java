package com.YYSchedule.common.mybatis.pojo;

public class UserBasic {
    private Integer userId;

    private String username;

    private String password;

    private Integer missionCount;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getMissionCount() {
        return missionCount;
    }

    public void setMissionCount(Integer missionCount) {
        this.missionCount = missionCount;
    }
}