package com.example.test.hackerrank.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilga on 15-11-2020
 */
public class PriceRequest implements Serializable {

    private List<String> products = new ArrayList<>();
    private List<Float> productPrices = new ArrayList<>();
    private List<String> productSold = new ArrayList<>();
    private List<Float> soldPrice = new ArrayList<>();

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public List<Float> getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(List<Float> productPrices) {
        this.productPrices = productPrices;
    }

    public List<String> getProductSold() {
        return productSold;
    }

    public void setProductSold(List<String> productSold) {
        this.productSold = productSold;
    }

    public List<Float> getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(List<Float> soldPrice) {
        this.soldPrice = soldPrice;
    }
}
