package com.xyzbank.stepdefinition.smokeSteps;

import com.xyzbank.pageobjects.CustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DepositStep {

    CustomerPage customerPage = new CustomerPage();
    @Given("click deposit category button")
    public void click_deposit_category_button() {
        customerPage.getDepositCategoryBtn().click();
    }
    @Given("enter deposit amount {string}")
    public void enter_deposit_amount(String amount) {
        customerPage.getAmountInput().sendKeys(amount);

    }
    @Given("click deposit button")
    public void click_deposit_button() {
        customerPage.getDepositBtn().click();
    }
    @Then("verify amount has been deposited")
    public void verify_amount_has_been_deposited() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(customerPage.getSuccessfulDepositMsg().getText().contains("Successful"));
    }
}
