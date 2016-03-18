package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopApp;
import com.appleframework.opm.entity.RopAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopAppMapper {
	
    int countByExample(RopAppExample example);

    int deleteByExample(RopAppExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopApp record);

    int insertSelective(RopApp record);

    List<RopApp> selectByExample(RopAppExample example);

    RopApp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopApp record, @Param("example") RopAppExample example);

    int updateByExample(@Param("record") RopApp record, @Param("example") RopAppExample example);

    int updateByPrimaryKeySelective(RopApp record);

    int updateByPrimaryKey(RopApp record);
}