package com.appleframework.opm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.opm.dao.RopApiServerMapper;
import com.appleframework.opm.entity.RopApiServer;
import com.appleframework.opm.service.RopApiServerService;

@Service
public class RopApiServerServiceImpl implements RopApiServerService {

	@Resource
	private RopApiServerMapper ropApiServerMapper;

	@Override
	public void save(RopApiServer record) {
		ropApiServerMapper.insert(record);
	}

	@Override
	public RopApiServer get(Long id) {
		return ropApiServerMapper.selectByPrimaryKey(id);
	}

}
