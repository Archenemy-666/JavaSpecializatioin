package com.ts.springDemo;

import com.dao.ProductDao;
import com.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductDao productDao ;

    @RequestMapping("/request")
    public void register(){

        Product product = new Product(2 , "laptop" , 200000.63 ) ;
        productDao.register(product);
    }
    @RequestMapping("/registerAll")
    public List<Product> registerAll(){
      // only printing 2 values 2 and 3 but not one reason ?
        Product product1 = new Product(1 , "phone" , 100000.23 ) ;
        Product product2 = new Product(2 , "laptop" , 200000.63 ) ;
        Product product3 = new Product(3 , "headphones" , 20000.44 ) ;
        List<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productDao.setProduct(productList);
        return showAllProducts() ;


    }

    @RequestMapping("/showAllProducts")
    public List<Product> showAllProducts() {
        List<Product> productList = productDao.getProduct();
        return productList;
    }

    @RequestMapping("/ShowProductsById/{productId}")
    public Product showProductById(@PathVariable("productId") Integer productId){
        Product product = productDao.getProductById(productId);
        return product ;
    }
    @RequestMapping("/ShowProductsByName/{productName}")
    public Product showProductById(@PathVariable("productName") String productName){
        Product product = productDao.getProductByName(productName);
        return product ;
    }
    @RequestMapping("/showAllSortedProducts")
    public List<Product> showAllSortedProducts(){
        List<Product> productList = productDao.getSortedProduct();
        return productList ;
    }



    }
