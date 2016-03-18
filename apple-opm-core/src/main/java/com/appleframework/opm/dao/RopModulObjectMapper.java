package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopModulObject;
import com.appleframework.opm.entity.RopModulObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopModulObjectMapper {
	
    int countByExample(RopModulObjectExample example);

    int deleteByExample(RopModulObjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopModulObject record);

    int insertSelective(RopModulObject record);

    List<RopModulObject> selectByExample(RopModulObjectExample example);

    RopModulObject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopModulObject record, @Param("example") RopModulObjectExample example);

    int updateByExample(@Param("record") RopModulObject record, @Param("example") RopModulObjectExample example);

    int updateByPrimaryKeySelective(RopModulObject record);

    int updateByPrimaryKey(RopModulObject record);
}