package com.example.test.shoppingcart;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by bilga on 21-03-2021
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/resources/features" },
        glue = {"com.example.test.shoppingcart" })
public class ShoppingCartTest {
}
