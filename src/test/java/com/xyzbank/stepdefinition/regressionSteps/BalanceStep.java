package com.xyzbank.stepdefinition.regressionSteps;

import com.xyzbank.pageobjects.CustomerPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BalanceStep {
    CustomerPage customerPage = new CustomerPage();

    @Then("verify customer balance is displayed")
    public void verify_customer_balance_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(customerPage.getCustomerPage().getText());
        Assert.assertTrue(customerPage.getAccountInformation().getText().contains("Balance : 2000"));
    }
}
