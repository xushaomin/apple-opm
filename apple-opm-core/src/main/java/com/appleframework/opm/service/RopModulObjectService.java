package com.appleframework.opm.service;

import java.util.List;

import com.appleframework.model.page.Pagination;
import com.appleframework.opm.entity.RopModulObject;

public interface RopModulObjectService {

	public List<RopModulObject> findPageByModulId(Pagination page, Long modulId);
    
}
