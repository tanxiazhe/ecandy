package com.ecandy.user.mapper;

import com.ecandy.user.model.EUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Param;
@Component
@Mapper
public interface EUserMapper {
    EUser selectEUserByName(@Param("name")String name) throws Exception;
}
