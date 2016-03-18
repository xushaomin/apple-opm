package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopApiReturn;
import com.appleframework.opm.entity.RopApiReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopApiReturnMapper {
	
    int countByExample(RopApiReturnExample example);

    int deleteByExample(RopApiReturnExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopApiReturn record);

    int insertSelective(RopApiReturn record);

    List<RopApiReturn> selectByExample(RopApiReturnExample example);

    RopApiReturn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopApiReturn record, @Param("example") RopApiReturnExample example);

    int updateByExample(@Param("record") RopApiReturn record, @Param("example") RopApiReturnExample example);

    int updateByPrimaryKeySelective(RopApiReturn record);

    int updateByPrimaryKey(RopApiReturn record);
}