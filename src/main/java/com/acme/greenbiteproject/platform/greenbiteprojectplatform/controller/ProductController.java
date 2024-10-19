package com.acme.greenbiteproject.platform.greenbiteprojectplatform.controller;

import com.acme.greenbiteproject.platform.greenbiteprojectplatform.dto.dtoProduct;
import com.acme.greenbiteproject.platform.greenbiteprojectplatform.model.entity.Product;
import com.acme.greenbiteproject.platform.greenbiteprojectplatform.service.IProduct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private IProduct productService;

    @GetMapping
    public List<dtoProduct> getAllProducts(){
        return productService.listAll().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return  m.map(y, dtoProduct.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        Product productDelete = productService.findById(id);
        productService.delete(productDelete);
    }

    @GetMapping("/{id}")
    public Product showById(@PathVariable Integer id){
        return productService.findById(id);
    }



}
