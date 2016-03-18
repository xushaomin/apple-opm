package com.appleframework.opm.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.model.page.Pagination;
import com.appleframework.opm.dao.RopModulMapper;
import com.appleframework.opm.entity.RopModul;
import com.appleframework.opm.entity.RopModulExample;
import com.appleframework.opm.service.RopModulService;

@Service
public class RopModulServiceImpl implements RopModulService {

	@Resource
	private RopModulMapper ropModulMapper;

	@Override
	public List<RopModul> findPageByKeyword(Pagination page, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<RopModul> findAll() {
		RopModulExample example = new RopModulExample();
		example.createCriteria();
		return ropModulMapper.selectByExample(example);
	}
	
	@Override
	public RopModul getByModulCode(String modulCode) {
		RopModulExample example = new RopModulExample();
		example.createCriteria().andModulCodeEqualTo(modulCode);
		List<RopModul> list = ropModulMapper.selectByExample(example);
		if(list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	
	@Override
	public Long save(RopModul record) {
		record.setCreateTime(new Date());
		ropModulMapper.insert(record);
		return record.getId();
	}
	
}
