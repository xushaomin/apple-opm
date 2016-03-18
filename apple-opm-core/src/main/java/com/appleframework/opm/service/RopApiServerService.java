package com.appleframework.opm.service;

import com.appleframework.opm.entity.RopApiServer;

public interface RopApiServerService {
	    
    public void save(RopApiServer record);
    
    public RopApiServer get(Long id);
    
}
