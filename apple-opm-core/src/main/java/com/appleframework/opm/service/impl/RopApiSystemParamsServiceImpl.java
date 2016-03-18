package com.appleframework.opm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.opm.dao.RopApiSystemParamsMapper;
import com.appleframework.opm.entity.RopApiSystemParams;
import com.appleframework.opm.entity.RopApiSystemParamsExample;
import com.appleframework.opm.service.RopApiSystemParamsService;

@Service("ropApiSystemParamsService")
public class RopApiSystemParamsServiceImpl implements RopApiSystemParamsService {

	@Resource
	private RopApiSystemParamsMapper ropApiSystemParamsMapper;

	@Override
	public List<RopApiSystemParams> findAll() {
		RopApiSystemParamsExample example = new RopApiSystemParamsExample();
		example.createCriteria();
		return ropApiSystemParamsMapper.selectByExample(example);
	}
}
