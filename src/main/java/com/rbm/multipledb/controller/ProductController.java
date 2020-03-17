package com.rbm.multipledb.controller;

import com.rbm.multipledb.dao.product.ProductRepository;
import com.rbm.multipledb.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rakshabm on 2020-03-16
 **/
@RestController
public class ProductController {

    @Autowired ProductRepository productRepository;

    @GetMapping("/product")
    public List<Product> getUser(){



        return productRepository.findAll();
    }
}
