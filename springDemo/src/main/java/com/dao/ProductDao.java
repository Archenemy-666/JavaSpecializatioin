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
    public List setProduct(List<Product> productList){
        productRepository.saveAll(productList);
        return  productList ;
    }

    public void register(Product product){
        productRepository.save(product);
    }

    public Product getProductById(Integer productId){
        Product product = productRepository.findById(productId).orElse(new Product());
        return product ;
    }

    public Product getProductByName(String productName){
        Product product = productRepository.findByProductName(productName).orElse(new Product());
        return product ;
    }
    public List<Product> getSortedProduct(){
        List <Product> productList = productRepository.findAllSorted();
        return  productList;

    }
}
