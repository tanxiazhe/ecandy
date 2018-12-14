package com.ecandy.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecandy.product.mapper.ProductMapper;
import com.ecandy.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public int add(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public List<Product> getAll() {
        return productMapper.selectAll();
    }

    @Override
    public void delete(Long id) {
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Product getByName(String name) {
        return productMapper.selectByName(name);
    }

    @Override
    public Product getById(long id) {
        return productMapper.selectByPrimaryKey(id);
    }

}
