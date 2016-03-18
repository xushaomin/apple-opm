package com.appleframework.opm.entity;

import java.io.Serializable;
import java.util.Date;

public class RopServer implements Serializable {
	
    private Long id;

    private String serverDesc;

    private String serverHost;

    private String serverPort;

    private Integer state;

    private Integer sideType;

    private Integer envType;
    
    private Boolean isDefault;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServerDesc() {
        return serverDesc;
    }

    public void setServerDesc(String serverDesc) {
        this.serverDesc = serverDesc == null ? null : serverDesc.trim();
    }

    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost == null ? null : serverHost.trim();
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort == null ? null : serverPort.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSideType() {
        return sideType;
    }

    public void setSideType(Integer sideType) {
        this.sideType = sideType;
    }

    public Integer getEnvType() {
        return envType;
    }

    public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setEnvType(Integer envType) {
        this.envType = envType;
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