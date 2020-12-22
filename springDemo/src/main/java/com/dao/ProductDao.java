package com.dao;

import com.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDao {
    // JDBC Code
    @Autowired
    ProductRepository productRepository ;
    public List getProduct(){
        List<Product> productList = productRepository.findAll();
        return  productList ;
    }

    public void register(Product product){
        productRepository.save(product);
    }
}
