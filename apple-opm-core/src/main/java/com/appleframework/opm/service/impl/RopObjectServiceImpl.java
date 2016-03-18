package com.appleframework.opm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.model.page.Pagination;
import com.appleframework.opm.dao.RopObjectMapper;
import com.appleframework.opm.entity.RopObject;
import com.appleframework.opm.service.RopObjectService;

@Service
public class RopObjectServiceImpl implements RopObjectService {

	@Resource
	private RopObjectMapper ropObjectMapper;

	@Override
	public List<RopObject> findPageByModulId(Pagination page, Long modulId) {
		return null;
	}	

}
