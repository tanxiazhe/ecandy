package com.ecandy.order.mapper;

import com.ecandy.order.model.SalesOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SalesOrderMapper {
    SalesOrder selectSalesOrderById(@Param("id") String id) throws Exception;
    List<SalesOrder> selectSalesOrders() throws Exception;
}
