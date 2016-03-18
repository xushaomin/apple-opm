package com.appleframework.opm.dao;

import com.appleframework.opm.entity.RopModul;
import com.appleframework.opm.entity.RopModulExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RopModulMapper {
	
    int countByExample(RopModulExample example);

    int deleteByExample(RopModulExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RopModul record);

    int insertSelective(RopModul record);

    List<RopModul> selectByExample(RopModulExample example);

    RopModul selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RopModul record, @Param("example") RopModulExample example);

    int updateByExample(@Param("record") RopModul record, @Param("example") RopModulExample example);

    int updateByPrimaryKeySelective(RopModul record);

    int updateByPrimaryKey(RopModul record);
}