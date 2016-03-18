package com.appleframework.opm.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.appleframework.opm.dao.RopApiMapper;
import com.appleframework.opm.entity.RopApi;
import com.appleframework.opm.entity.RopApiExample;
import com.appleframework.opm.service.RopApiService;

@Service
public class RopApiServiceImpl implements RopApiService {

	@Resource
	private RopApiMapper ropApiMapper;

	@Override
	public RopApi get(Long modulId, String apiPath, String apiVersion) {
		RopApiExample example = new RopApiExample();
		example.createCriteria().andModulIdEqualTo(modulId).andApiPathEqualTo(apiPath).andApiVersionEqualTo(apiVersion);
		List<RopApi> list = ropApiMapper.selectByExample(example);
		if(list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	
	public Long save(RopApi record) {
		record.setCreateTime(new Date());
		ropApiMapper.insert(record);
		return record.getId();
	}
	
	public RopApi get(Long id) {
		return ropApiMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public List<RopApi> findListByModulId(Long modulId) {
		RopApiExample example = new RopApiExample();
		example.createCriteria().andModulIdEqualTo(modulId);
		return ropApiMapper.selectByExample(example);
	}
	
	@Override
	public List<RopApi> findListByModulIdAndKeyword(Long modulId, String keyword) {
		RopApiExample example = new RopApiExample();
		if(!StringUtils.isEmpty(keyword)) {
			example.createCriteria().andModulIdEqualTo(modulId).andApiNameLike("%" + keyword + "%");
		}
		else {
			example.createCriteria().andModulIdEqualTo(modulId);
		}
		return ropApiMapper.selectByExample(example);
	}
	
	@Override
	public List<RopApi> findListByState() {
		RopApiExample example = new RopApiExample();
		example.createCriteria().andStateEqualTo(1);
		return ropApiMapper.selectByExample(example);
	}
	
}
