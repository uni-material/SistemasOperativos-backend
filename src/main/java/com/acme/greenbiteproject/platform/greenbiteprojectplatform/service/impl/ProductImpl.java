package com.acme.greenbiteproject.platform.greenbiteprojectplatform.service.impl;

import com.acme.greenbiteproject.platform.greenbiteprojectplatform.model.dao.ProductDao;
import com.acme.greenbiteproject.platform.greenbiteprojectplatform.model.entity.Product;
import com.acme.greenbiteproject.platform.greenbiteprojectplatform.service.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductImpl implements IProduct {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> listAll() {
        return productDao.findAll();
    }

    @Transactional

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Transactional(readOnly = true)
    @Override
    public Product findById(Integer id) {
        return productDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Product product) {
        productDao.delete(product);

    }
}
