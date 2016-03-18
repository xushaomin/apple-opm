package com.appleframework.opm.entity;

import java.io.Serializable;
import java.util.Date;

public class RopModul implements Serializable {
    private Long id;

    private String modulName;

    private String modulCode;

    private String modulDesc;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModulName() {
        return modulName;
    }

    public void setModulName(String modulName) {
        this.modulName = modulName == null ? null : modulName.trim();
    }

    public String getModulCode() {
        return modulCode;
    }

    public void setModulCode(String modulCode) {
        this.modulCode = modulCode == null ? null : modulCode.trim();
    }

    public String getModulDesc() {
        return modulDesc;
    }

    public void setModulDesc(String modulDesc) {
        this.modulDesc = modulDesc == null ? null : modulDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}