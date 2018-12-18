package com.itheima.mapper;

import com.itheima.po.EUser;
import com.itheima.po.EUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EUserMapper {
    long countByExample(EUserExample example);

    int deleteByExample(EUserExample example);

    int insert(EUser record);

    int insertSelective(EUser record);

    List<EUser> selectByExample(EUserExample example);

    int updateByExampleSelective(@Param("record") EUser record, @Param("example") EUserExample example);

    int updateByExample(@Param("record") EUser record, @Param("example") EUserExample example);
}