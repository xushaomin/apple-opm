package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopApiError;
import com.appleframework.opm.entity.RopApiErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopApiErrorMapper {
	
    int countByExample(RopApiErrorExample example);

    int deleteByExample(RopApiErrorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopApiError record);

    int insertSelective(RopApiError record);

    List<RopApiError> selectByExample(RopApiErrorExample example);

    RopApiError selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopApiError record, @Param("example") RopApiErrorExample example);

    int updateByExample(@Param("record") RopApiError record, @Param("example") RopApiErrorExample example);

    int updateByPrimaryKeySelective(RopApiError record);

    int updateByPrimaryKey(RopApiError record);
}