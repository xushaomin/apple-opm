package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopApi;
import com.appleframework.opm.entity.RopApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopApiMapper {
	
    int countByExample(RopApiExample example);

    int deleteByExample(RopApiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopApi record);

    int insertSelective(RopApi record);

    List<RopApi> selectByExample(RopApiExample example);

    RopApi selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopApi record, @Param("example") RopApiExample example);

    int updateByExample(@Param("record") RopApi record, @Param("example") RopApiExample example);

    int updateByPrimaryKeySelective(RopApi record);

    int updateByPrimaryKey(RopApi record);
}