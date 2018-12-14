package com.ecandy.product.service;

import java.util.List;

import com.ecandy.product.model.Product;

public interface ProductService {

    int add(Product product);

    List<Product> getAll();

    void delete(Long id);

    Product getByName(String name);

    Product getById(long id);

}
