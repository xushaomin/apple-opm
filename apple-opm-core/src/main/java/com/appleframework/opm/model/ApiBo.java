package com.appleframework.opm.model;

import java.io.Serializable;
import java.util.List;

public class ApiBo implements Serializable {
	
	private static final long serialVersionUID = 2174524725763041729L;

	private String apiName;

	private String apiPath;

	private String apiVersion;

	private String requestType;
	
	private List<ServerBo> servers;

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiPath() {
		return apiPath;
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public List<ServerBo> getServers() {
		return servers;
	}

	public void setServers(List<ServerBo> servers) {
		this.servers = servers;
	}

	public ApiBo(String apiName, String apiPath, String apiVersion, String requestType) {
		super();
		this.apiName = apiName;
		this.apiPath = apiPath;
		this.apiVersion = apiVersion;
		this.requestType = requestType;
	}

}