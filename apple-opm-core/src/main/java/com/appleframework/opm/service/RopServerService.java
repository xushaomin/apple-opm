package com.appleframework.opm.service;

import java.util.List;

import com.appleframework.opm.entity.RopServer;
import com.appleframework.opm.model.EnvType;
import com.appleframework.opm.model.ServerBo;

public interface RopServerService {
	
    public RopServer get(String serverHost, String serverPort);
    
    public Long save(RopServer record);
        
    public List<ServerBo> findByAppIdAndApiId(Long appId, Long apiId);
    
    public ServerBo getByEnvTypeAndDefault(EnvType envType);
    
}
