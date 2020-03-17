package com.rbm.multipledb.dao.product;

import com.rbm.multipledb.model.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository
        extends MongoRepository<Product, String> {


}
