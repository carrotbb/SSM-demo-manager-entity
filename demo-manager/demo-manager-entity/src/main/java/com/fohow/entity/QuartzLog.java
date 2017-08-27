package com.fohow.entity;

import java.util.Date;

public class QuartzLog {
    private String id;

    private Date createTime;

    private Date exceTime;

    private String quartzId;

    private Integer runStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExceTime() {
        return exceTime;
    }

    public void setExceTime(Date exceTime) {
        this.exceTime = exceTime;
    }

    public String getQuartzId() {
        return quartzId;
    }

    public void setQuartzId(String quartzId) {
        this.quartzId = quartzId == null ? null : quartzId.trim();
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }
}