package com.xyzbank.stepdefinition.smokeSteps;

import com.xyzbank.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LogoutStep {

    LoginPage loginPage = new LoginPage();


    @Given("click logout btn at the top right")
    public void click_logout_btn_at_the_top_right() {
    loginPage.getLogoutBtn().click();
    }
    @Then("verify customer logged out")
    public void verify_customer_logged_out() {
        Assert.assertTrue(loginPage.verifyCustomerLoggedOut());
    }
}
