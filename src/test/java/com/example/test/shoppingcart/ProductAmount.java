package com.example.test.shoppingcart;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by bilga on 21-03-2021
 */
public class ProductAmount implements Serializable {

    private Product product;
    private Integer amount;
    private BigDecimal totalPrice;

    public ProductAmount() {
    }

    public ProductAmount(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
        this.totalPrice = product.getPrice().multiply(BigDecimal.valueOf(amount));
    }

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
