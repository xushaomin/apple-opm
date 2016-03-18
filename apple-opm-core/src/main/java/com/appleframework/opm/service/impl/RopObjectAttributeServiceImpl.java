package com.appleframework.opm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.opm.dao.RopObjectAttributeMapper;
import com.appleframework.opm.entity.RopObjectAttribute;
import com.appleframework.opm.entity.RopObjectAttributeExample;
import com.appleframework.opm.service.RopObjectAttributeService;

@Service
public class RopObjectAttributeServiceImpl implements RopObjectAttributeService {

	@Resource
	private RopObjectAttributeMapper ropObjectAttributeMapper;

	@Override
	public List<RopObjectAttribute> findAllByObjectId(Long objectId) {
		RopObjectAttributeExample example = new RopObjectAttributeExample();
		example.createCriteria().andObjectIdEqualTo(objectId);
		return ropObjectAttributeMapper.selectByExample(example);
	}

}
