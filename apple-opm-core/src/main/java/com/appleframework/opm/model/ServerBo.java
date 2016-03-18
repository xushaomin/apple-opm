package com.appleframework.opm.model;

import java.io.Serializable;

public class ServerBo implements Serializable {

	private static final long serialVersionUID = -6432672856218794723L;

	private String host;

	private String port;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public ServerBo(String host, String port) {
		super();
		this.host = host;
		this.port = port;
	}
	
	public ServerBo() {
		
	}
	
	
}