package com.appleframework.opm.service;

import java.util.List;

import com.appleframework.model.page.Pagination;
import com.appleframework.opm.entity.RopModul;

public interface RopModulService {

    public List<RopModul> findPageByKeyword(Pagination page, String keyword);
    
    public List<RopModul> findAll();
    
    public RopModul getByModulCode(String modulCode);
    
    public Long save(RopModul record);
    
}
