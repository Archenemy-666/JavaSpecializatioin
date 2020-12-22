package com.ts.springDemo;

import com.dao.ProductDao;
import com.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductDao productDao ;

    @RequestMapping("/request")
    public Product register(){
        Product product = new Product(1 , "phone" , 100000.23 ) ;

        productDao.register(product);
        return product ;
    }

    @RequestMapping("/showAllProducts")
    public List<Product> showAllProducts(){
        List<Product> productList = productDao.getProduct();
        return productList ;

            /*
       Product product1 = new Product(1 , "phone" , 100000.23 ) ;
       Product product2 = new Product(2 , "laptop" , 200000.63 ) ;
       Product product3 = new Product(3 , "headphones" , 20000.44 ) ;

       List<Product> productList = new ArrayList<Product>();
       productList.add(product1);
       productList.add(product2);
       productList.add(product3);
    */

        }


    }
