package com.example.test.shoppingcart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bilga on 21-03-2021
 */
public class ShoppingCart implements Serializable {

    private Long id;
    private List<ProductAmount> productList =  new ArrayList<>();

    public Integer getProductAmount(String productName){
        ProductAmount productAmount = productList.stream()
                .filter(item -> productName.equals(item.getProduct().getName()))
                .findAny()
                .orElse(null);
        return productAmount.getAmount();
    }

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
