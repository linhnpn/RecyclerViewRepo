package com.example.productrecyclerview;

import java.io.Serializable;

public class Product implements Serializable {
    public int productImage;
    public String productName;

    public Product() {
    }

    public Product(int productImage, String productName) {
        this.productImage = productImage;
        this.productName = productName;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
