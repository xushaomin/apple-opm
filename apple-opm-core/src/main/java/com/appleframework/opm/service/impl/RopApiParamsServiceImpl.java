package com.appleframework.opm.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.opm.dao.RopApiParamsMapper;
import com.appleframework.opm.entity.RopApiParams;
import com.appleframework.opm.entity.RopApiParamsExample;
import com.appleframework.opm.service.RopApiParamsService;

@Service
public class RopApiParamsServiceImpl implements RopApiParamsService {

	@Resource
	private RopApiParamsMapper ropApiParamsMapper;

	@Override
	public List<RopApiParams> findListByApiId(Long apiId) {
		RopApiParamsExample example = new RopApiParamsExample();
		example.createCriteria().andApiIdEqualTo(apiId);
		return ropApiParamsMapper.selectByExample(example);
	}
	
	@Override
	public RopApiParams get(Long apiId, String paramName) {
		RopApiParamsExample example = new RopApiParamsExample();
		example.createCriteria().andApiIdEqualTo(apiId).andParamNameEqualTo(paramName);		
		List<RopApiParams> list = ropApiParamsMapper.selectByExample(example);
		if(list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	
	@Override
	public Long save(RopApiParams record) {
		record.setCreateTime(new Date());
		ropApiParamsMapper.insert(record);
		return record.getId();
	}
}
