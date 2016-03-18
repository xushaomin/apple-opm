package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopApiParams;
import com.appleframework.opm.entity.RopApiParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopApiParamsMapper {
	
    int countByExample(RopApiParamsExample example);

    int deleteByExample(RopApiParamsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopApiParams record);

    int insertSelective(RopApiParams record);

    List<RopApiParams> selectByExample(RopApiParamsExample example);

    RopApiParams selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopApiParams record, @Param("example") RopApiParamsExample example);

    int updateByExample(@Param("record") RopApiParams record, @Param("example") RopApiParamsExample example);

    int updateByPrimaryKeySelective(RopApiParams record);

    int updateByPrimaryKey(RopApiParams record);
}