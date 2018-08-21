package com.YYSchedule.common.mybatis.pojo;

public class TaskTemp {
    private Long taskId;

    private String task;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task == null ? null : task.trim();
    }
}