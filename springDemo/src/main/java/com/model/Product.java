package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
    @Id @GeneratedValue
    private int productId ;
    private String productName ;
    private double productPrice ;


    public Product(){}

    public Product(int productId , String productName , double productPrice){
        this.productId = productId ;
        this.productName = productName;
        this.productPrice = productPrice;

    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }
}
