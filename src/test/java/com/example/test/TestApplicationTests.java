package com.example.test;

import com.example.test.entity.Product;
import com.example.test.entity.ProductAmount;
import com.example.test.entity.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;



@SpringBootTest
class TestApplicationTests {

    private ShoppingCart shoppingCart = new ShoppingCart();
    private Product product = new Product();

    @Test
    void contextLoads() {
    }
/*
    @Test
    void shoppingCartIsEmpty() {

        // alert if cart is empty
        Assertions.assertTrue(shoppingCart.getProductList().isEmpty());

        product.setId(1L);
        product.setName("Blue Paint");
        product.setPrice(BigDecimal.valueOf(39.99));
        // alert if blue paint amount different from 5
        addProductToShoppingCart(product, 3);
        Assertions.assertTrue(shoppingCart.getProductList().isEmpty());
    }

    @Test
    void shoppingCartDifferentAmount() {

        product.setId(1L);
        product.setName("Blue Paint");
        product.setPrice(BigDecimal.valueOf(39.99));

        // alert if blue paint amount different from 5
        addProductToShoppingCart(product, 3);
        Assertions.assertFalse(shoppingCart.getProductList().get(0).getProduct().getName().equalsIgnoreCase("Blue Paint") && shoppingCart.getProductList().get(0).getAmount() != 5);

        addProductToShoppingCart(product, 5);
        Assertions.assertTrue(shoppingCart.getProductList().get(0).getProduct().getName().equalsIgnoreCase("Blue Paint") && shoppingCart.getProductList().get(0).getAmount() == 5);


        Assertions.assertTrue(shoppingCart.getProductList().get(0).getProduct().getName().equalsIgnoreCase("Blue Paint") && shoppingCart.getProductList().get(0).getTotalPrice().equals(BigDecimal.valueOf(199.95)));

    }

    private void addProductToShoppingCart(Product product, Integer amount){
        ProductAmount productAmount = new ProductAmount();
        shoppingCart = new ShoppingCart();
        productAmount.setProduct(product);
        productAmount.setAmount(amount);
        productAmount.setTotalPrice(product.getPrice().multiply(new BigDecimal(productAmount.getAmount())));
        shoppingCart.getProductList().add(productAmount);
    }

     */

}
