package com.ecandy.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecandy.product.client.EmployeeClient;
import com.ecandy.product.model.Employee;
import com.ecandy.product.model.Product;
import com.ecandy.product.service.ProductService;

@RequestMapping("/Products")
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    EmployeeClient employeeClient;

    @PostMapping
    public int add(@RequestBody Product product) {
        return productService.add(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        productService.delete(id);
    }

    @GetMapping("/{id}")
    public Product get(@PathVariable long id) {
        return productService.getById(id);

    }

    @GetMapping
    public List<Product> list() {
        return productService.getAll();

    }

    @GetMapping("/employees")
    public List<Employee> employeeList() {
        return employeeClient.findAll();

    }

}
