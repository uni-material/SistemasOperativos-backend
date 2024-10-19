package com.acme.greenbiteproject.platform.greenbiteprojectplatform.service;

import com.acme.greenbiteproject.platform.greenbiteprojectplatform.model.entity.Product;

import java.util.List;

public interface IProduct {

     List<Product> listAll();

    Product save(Product product);

    Product findById(Integer id);

    void delete(Product product);
}
