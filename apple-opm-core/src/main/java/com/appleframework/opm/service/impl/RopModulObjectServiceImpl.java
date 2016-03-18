package com.appleframework.opm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.model.page.Pagination;
import com.appleframework.opm.dao.RopModulObjectMapper;
import com.appleframework.opm.entity.RopModulObject;
import com.appleframework.opm.service.RopModulObjectService;

@Service
public class RopModulObjectServiceImpl implements RopModulObjectService {

	@Resource
	private RopModulObjectMapper ropModulObjectMapper;

	public List<RopModulObject> findPageByModulId(Pagination page, Long modulId) {
		
		return null;
	}

}
