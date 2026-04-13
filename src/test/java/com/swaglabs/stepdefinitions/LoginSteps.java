package com.swaglabs.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.swaglabs.pages.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on the login page")
    public void user_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("User enters valid username and password")
    public void enter_valid_credentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @And("User clicks Login button")
    public void click_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should be navigated to the Products page")
    public void verify_products_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        driver.quit();
    }
}
