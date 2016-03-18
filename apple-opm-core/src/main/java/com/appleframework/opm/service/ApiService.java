package com.appleframework.opm.service;

import java.util.List;

import com.appleframework.opm.model.ApiBo;

public interface ApiService {
	
	public List<ApiBo> getList(String appkey);
	
}
