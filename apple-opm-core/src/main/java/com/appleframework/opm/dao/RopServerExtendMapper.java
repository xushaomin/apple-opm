package com.appleframework.opm.dao;

import com.appleframework.opm.model.ServerBo;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopServerExtendMapper {
	
    List<ServerBo> selectForRop(@Param("appId") Long appId, @Param("apiId") Long apiId, @Param("envType") Integer envType);
    
    ServerBo selectByEnvTypeAndDefault(@Param("envType") Integer envType);

}