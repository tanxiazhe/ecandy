package com.ecandy.order.controller;

import com.ecandy.order.mapper.SalesOrderMapper;
import com.ecandy.order.model.SalesOrder;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@RestController
public class SalesOrderController {

    @Autowired
    private SalesOrderMapper salesOrderMapper;

//    @Autowired
//    private Registration registration;// 服务注册
//    @Autowired
//    private DiscoveryClient client;


    @GetMapping("/user")
    public Authentication user(Authentication user) {
        return user;
    }

    @GetMapping("/SalesOrders")
    public List<SalesOrder> list() throws  Exception{
//        List<ServiceInstance> instances = client.getInstances(registration.getServiceId());
//        if (instances != null && instances.size() > 0) {
//            LOGGER.info("/hello,host:" + instances.get(0).getHost()+", service_id:"+instances.get(0).getServiceId());
//        }

        return salesOrderMapper.selectSalesOrders();
    }
}
