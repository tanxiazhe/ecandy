package com.ecandy.product.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecandy.product.model.Employee;

@FeignClient(name = "employee")
public interface EmployeeClient {

    @GetMapping("/Employees/{id}")
    List<Employee> findById(@PathVariable("id") Long id);

    @GetMapping("/Employees/")
    List<Employee> findAll();

}
