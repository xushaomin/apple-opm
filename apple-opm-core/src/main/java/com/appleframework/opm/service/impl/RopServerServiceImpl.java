package com.appleframework.opm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.opm.dao.RopServerExtendMapper;
import com.appleframework.opm.dao.RopServerMapper;
import com.appleframework.opm.entity.RopServer;
import com.appleframework.opm.entity.RopServerExample;
import com.appleframework.opm.model.EnvType;
import com.appleframework.opm.model.ServerBo;
import com.appleframework.opm.service.RopServerService;

@Service
public class RopServerServiceImpl implements RopServerService {

	@Resource
	private RopServerMapper ropServerMapper;
	
	@Resource
	private RopServerExtendMapper ropServerExtendMapper;

	@Override
	public RopServer get(String serverHost, String serverPort) {
		RopServerExample example = new RopServerExample();
		example.createCriteria().andServerHostEqualTo(serverHost).andServerPortEqualTo(serverPort);
		List<RopServer> list = ropServerMapper.selectByExample(example);
		if(list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	@Override
	public Long save(RopServer record) {
		ropServerMapper.insert(record);
		return record.getId();
	}

	@Override
	public List<ServerBo> findByAppIdAndApiId(Long appId, Long apiId) {
		return ropServerExtendMapper.selectByAppIdAndApiId(appId, apiId);
	}
	
	@Override
	public ServerBo getByEnvTypeAndDefault(EnvType envType) {
		return ropServerExtendMapper.selectByEnvTypeAndDefault(envType.getIndex());
	}

}
