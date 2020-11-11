package com.example.test.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilga on 10-11-2020
 */
public class ShoppingCart implements Serializable {

    private Long id;
    private List<ProductAmount> productList =  new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductAmount> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductAmount> productList) {
        this.productList = productList;
    }
}
