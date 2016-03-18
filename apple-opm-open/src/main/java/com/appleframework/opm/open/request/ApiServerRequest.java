package com.appleframework.opm.open.request;

import javax.validation.constraints.NotNull;

import com.appleframework.rop.AbstractRopRequest;

public class ApiServerRequest extends AbstractRopRequest {
	
	@NotNull
	private String env;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
	
}
