package com.xyzbank.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.xyzbank.base.TestBase.driver;

public class CustomerPage {

    public CustomerPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[ng-click=\"deposit()\"]")
    @Getter
    WebElement depositCategoryBtn;

    @FindBy(css = "[class=\"borderM box padT20 ng-scope\"]")
    @Getter
    WebElement customerPage;

    @FindBy(css = "[ng-model=\"amount\"]")
    @Getter
    WebElement amountInput;

    @FindBy(css = "[ng-show=\"message\"]")
    @Getter
    WebElement successfulDepositMsg;

    @FindBy(css = "[type=\"submit\"]")
    @Getter
    WebElement depositBtn;

    @FindBy(css = "[ng-hide=\"noAccount\"]:nth-of-type(2) ")
    @Getter
    WebElement accountInformation;

    @FindBy(css = "[ng-click=\"home()\"]")
    @Getter
    WebElement homeBtn;

    public boolean verifyCustomerLoggedIn(){
        if (customerPage.getText().contains("Welcome")){
            return true;
        }
        return false;
    }
}
