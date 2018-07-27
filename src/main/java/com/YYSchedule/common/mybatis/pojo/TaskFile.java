package com.YYSchedule.common.mybatis.pojo;

public class TaskFile {
    private Long taskId;

    private String fileName;

    private String fileChecksum;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
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