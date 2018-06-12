package com.binto.YYSchedule.common.mybatis.pojo;

public class TaskFile {
    private Integer taskId;

    private String fileName;

    private String fileChecksum;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileChecksum() {
        return fileChecksum;
    }

    public void setFileChecksum(String fileChecksum) {
        this.fileChecksum = fileChecksum == null ? null : fileChecksum.trim();
    }
}