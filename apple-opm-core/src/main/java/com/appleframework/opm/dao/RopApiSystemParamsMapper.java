package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopApiSystemParams;
import com.appleframework.opm.entity.RopApiSystemParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopApiSystemParamsMapper {
	
    int countByExample(RopApiSystemParamsExample example);

    int deleteByExample(RopApiSystemParamsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopApiSystemParams record);

    int insertSelective(RopApiSystemParams record);

    List<RopApiSystemParams> selectByExample(RopApiSystemParamsExample example);

    RopApiSystemParams selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopApiSystemParams record, @Param("example") RopApiSystemParamsExample example);

    int updateByExample(@Param("record") RopApiSystemParams record, @Param("example") RopApiSystemParamsExample example);

    int updateByPrimaryKeySelective(RopApiSystemParams record);

    int updateByPrimaryKey(RopApiSystemParams record);
}