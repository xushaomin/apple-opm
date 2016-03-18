package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopServer;
import com.appleframework.opm.entity.RopServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopServerMapper {
	
    int countByExample(RopServerExample example);

    int deleteByExample(RopServerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopServer record);

    int insertSelective(RopServer record);

    List<RopServer> selectByExample(RopServerExample example);

    RopServer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopServer record, @Param("example") RopServerExample example);

    int updateByExample(@Param("record") RopServer record, @Param("example") RopServerExample example);

    int updateByPrimaryKeySelective(RopServer record);

    int updateByPrimaryKey(RopServer record);
}