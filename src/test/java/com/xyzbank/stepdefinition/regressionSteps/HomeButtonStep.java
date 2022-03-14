package com.xyzbank.stepdefinition.regressionSteps;

import com.xyzbank.pageobjects.CustomerPage;
import com.xyzbank.pageobjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomeButtonStep {

   CustomerPage customerPage = new CustomerPage();
   HomePage homePage = new HomePage();

    @Given("clicks home button")
    public void clicks_home_button() {
        customerPage.getHomeBtn().click();

    }
    @Then("customer should be on home page")
    public void customer_should_be_on_home_page() {
        System.out.println(homePage.getCustomerLoginBtn().getText());
        Assert.assertTrue(homePage.getCustomerLoginBtn().isDisplayed());
    }

}
