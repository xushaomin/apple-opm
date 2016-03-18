package com.appleframework.opm.service;

import java.util.List;

import com.appleframework.opm.entity.RopApiParams;

public interface RopApiParamsService {

	public List<RopApiParams> findListByApiId(Long apiId);
	
	public RopApiParams get(Long apiId, String paramName);
	
	public Long save(RopApiParams record);
    
}
