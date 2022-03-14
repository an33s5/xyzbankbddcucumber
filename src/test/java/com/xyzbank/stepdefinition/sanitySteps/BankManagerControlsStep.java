package com.xyzbank.stepdefinition.sanitySteps;

import com.xyzbank.pageobjects.BankManagerPage;
import com.xyzbank.pageobjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BankManagerControlsStep {
    HomePage homePage = new HomePage();
    BankManagerPage bankManagerPage = new BankManagerPage();

    @Given("clicks bank manager button")
    public void clicks_bank_manager_button() {
        homePage.getManagerLoginBtn().click();
    }
    @Then("verify bank manager controls are displayed")
    public void verify_bank_manager_controls_are_displayed() throws InterruptedException {
        bankManagerPage.getAddCustomerBtn().click();
        Thread.sleep(1000);
        Assert.assertTrue(bankManagerPage.verifyAddCustomerFieldsDisplayed());

        bankManagerPage.getOpenAccountBtn().click();
        Thread.sleep(1000);
        Assert.assertTrue(bankManagerPage.verifyOpenAccountFieldsDisplayed());

        bankManagerPage.getCustomersBtn().click();
        Thread.sleep(1000);
        Assert.assertTrue(bankManagerPage.verifyCustomersFieldsDisplayed());

    }
}
