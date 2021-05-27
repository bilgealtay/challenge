package com.example.test.shoppingcart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.math.BigDecimal;

/**
 * Created by bilga on 21-03-2021
 */
public class ShoppingCartTests {

    private Product product;
    private ShoppingCart shoppingCart;

    @Given("^An empty shopping cart$")
    @And("^And a product, Dove Soap with a unit price of 39.99$")
    public void initialize_shopping_cart_and_product() throws Throwable {
        shoppingCart = new ShoppingCart();
        product = new Product(1L, "Dove Soap", BigDecimal.valueOf(39.99));
    }

    @When("^The user adds (-?\\d+)$ Dove Soaps to the shopping cart")
    public void add_product_to_shopping_cart(int amount) throws Throwable {
        ProductAmount productAmount = new ProductAmount(product, amount);
        shoppingCart.getProductList().add(productAmount);
    }

    @Then("^The shopping cart should contain 5 Dove Soaps each with a unit price of 39.99 the result should be (-?\\d+)$")
    @And("^And the shopping cart’s total price should equal 199.95 the result should be (-?\\d+)$")
    public void validate_result(int result) throws Throwable {
        Assert.assertThat(5, Matchers.equalTo(shoppingCart.getProductAmount(product.getName())));
    }
}
