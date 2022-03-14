package com.xyzbank.stepdefinition.smokeSteps;

import com.xyzbank.base.TestBase;
import com.xyzbank.pageobjects.CustomerPage;
import com.xyzbank.pageobjects.HomePage;
import com.xyzbank.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.xyzbank.base.TestBase.driver;

public class LoginStep {

    HomePage homePage =  new HomePage();
    LoginPage loginPage = new LoginPage();
    CustomerPage customerPage = new CustomerPage();

    @Given("customer is on home page")
    public void customer_is_on_home_page() {

      TestBase.driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }
    @Given("clicks customer login button")
    public void clicks_customer_login_button() {
        homePage.getCustomerLoginBtn().click();
    }
    @Given("select the name from drop down and click login")
    public void select_the_name_from_drop_down_and_click_login() throws InterruptedException {
        loginPage.selectFromDropdown();
        Thread.sleep(1000);
        loginPage.getLoginBtn().click();
    }
    @Then("verify user has logged in")
    public void verify_user_has_logged_in() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(customerPage.verifyCustomerLoggedIn());
    }
}
