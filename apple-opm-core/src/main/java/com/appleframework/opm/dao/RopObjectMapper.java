package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopObject;
import com.appleframework.opm.entity.RopObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopObjectMapper {
	
    int countByExample(RopObjectExample example);

    int deleteByExample(RopObjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopObject record);

    int insertSelective(RopObject record);

    List<RopObject> selectByExample(RopObjectExample example);

    RopObject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopObject record, @Param("example") RopObjectExample example);

    int updateByExample(@Param("record") RopObject record, @Param("example") RopObjectExample example);

    int updateByPrimaryKeySelective(RopObject record);

    int updateByPrimaryKey(RopObject record);
}