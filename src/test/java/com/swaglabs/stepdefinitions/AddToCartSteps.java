package com.swaglabs.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.ProductsPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class AddToCartSteps {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;

    @Given("User is logged in")
    public void logged_in() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @When("User adds a product to the cart")
    public void add_product() {
        productsPage = new ProductsPage(driver);
        productsPage.addProductToCart();
    }

    @Then("Product should appear in the cart")
    public void verify_added() {
        Assert.assertTrue(productsPage.isCartIconDisplayed());
        driver.quit();
    }
}
