package com.itheima.mapper;

import com.itheima.po.SalesOrder;
import com.itheima.po.SalesOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesOrderMapper {
    long countByExample(SalesOrderExample example);

    int deleteByExample(SalesOrderExample example);

    int insert(SalesOrder record);

    int insertSelective(SalesOrder record);

    List<SalesOrder> selectByExample(SalesOrderExample example);

    int updateByExampleSelective(@Param("record") SalesOrder record, @Param("example") SalesOrderExample example);

    int updateByExample(@Param("record") SalesOrder record, @Param("example") SalesOrderExample example);
}