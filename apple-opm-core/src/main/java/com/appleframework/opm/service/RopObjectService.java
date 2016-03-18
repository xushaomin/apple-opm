package com.appleframework.opm.service;

import java.util.List;

import com.appleframework.model.page.Pagination;
import com.appleframework.opm.entity.RopObject;

public interface RopObjectService {

    public List<RopObject> findPageByModulId(Pagination page, Long modulId);
    
    
}
