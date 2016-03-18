package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopApiServer;
import com.appleframework.opm.entity.RopApiServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopApiServerMapper {
	
    int countByExample(RopApiServerExample example);

    int deleteByExample(RopApiServerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopApiServer record);

    int insertSelective(RopApiServer record);

    List<RopApiServer> selectByExample(RopApiServerExample example);

    RopApiServer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopApiServer record, @Param("example") RopApiServerExample example);

    int updateByExample(@Param("record") RopApiServer record, @Param("example") RopApiServerExample example);

    int updateByPrimaryKeySelective(RopApiServer record);

    int updateByPrimaryKey(RopApiServer record);
}