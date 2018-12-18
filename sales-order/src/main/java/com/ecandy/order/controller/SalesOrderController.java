package com.ecandy.order.controller;

import com.ecandy.order.mapper.SalesOrderMapper;
import com.ecandy.order.model.SalesOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalesOrderController {

    @Autowired
    private SalesOrderMapper salesOrderMapper;
    @GetMapping("/user")
    public Authentication user(Authentication user) {
        return user;
    }

    @GetMapping("/SalesOrders")
    public List<SalesOrder> list() throws  Exception{
        return salesOrderMapper.selectSalesOrders();
    }
}
