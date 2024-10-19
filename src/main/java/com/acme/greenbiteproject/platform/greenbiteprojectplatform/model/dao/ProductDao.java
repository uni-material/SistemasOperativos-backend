package com.acme.greenbiteproject.platform.greenbiteprojectplatform.model.dao;

import com.acme.greenbiteproject.platform.greenbiteprojectplatform.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
