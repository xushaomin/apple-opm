package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopObjectAttribute;
import com.appleframework.opm.entity.RopObjectAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopObjectAttributeMapper {
	
    int countByExample(RopObjectAttributeExample example);

    int deleteByExample(RopObjectAttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopObjectAttribute record);

    int insertSelective(RopObjectAttribute record);

    List<RopObjectAttribute> selectByExample(RopObjectAttributeExample example);

    RopObjectAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopObjectAttribute record, @Param("example") RopObjectAttributeExample example);

    int updateByExample(@Param("record") RopObjectAttribute record, @Param("example") RopObjectAttributeExample example);

    int updateByPrimaryKeySelective(RopObjectAttribute record);

    int updateByPrimaryKey(RopObjectAttribute record);
}