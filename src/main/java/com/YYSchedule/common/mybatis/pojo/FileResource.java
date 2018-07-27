package com.YYSchedule.common.mybatis.pojo;

public class FileResource {
    private String fileChecksum;

    private String filePath;

    public String getFileChecksum() {
        return fileChecksum;
    }

    public void setFileChecksum(String fileChecksum) {
        this.fileChecksum = fileChecksum == null ? null : fileChecksum.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }
}