package com.example.test.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by bilga on 10-11-2020
 */
public class ProductAmount implements Serializable {

    private Product product;
    private Integer amount;
    private BigDecimal totalPrice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
