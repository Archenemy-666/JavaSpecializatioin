package com.ts.springDemo;

import com.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


   @RequestMapping("/showAllProducts")
   public List showAllProducts(){
       Product product1 = new Product(1 , "phone" , 100000.23 ) ;
       Product product2 = new Product(2 , "laptop" , 200000.63 ) ;
       Product product3 = new Product(3 , "headphones" , 20000.44 ) ;

       List<Product> productList = new ArrayList<Product>();
       productList.add(product1);
       productList.add(product2);
       productList.add(product3);

       return productList ;




   }
}
