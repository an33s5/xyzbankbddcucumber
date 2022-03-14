package com.xyzbank.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.xyzbank.base.TestBase.driver;

public class BankManagerPage {

    public BankManagerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"center\"]")
    WebElement bankManagerControls;

    @FindBy(css = "[class=\"form-group\"]:nth-of-type(1)")
    WebElement firstNameField;

    @FindBy(css = "[ng-class=\"btnClass1\"]")
    @Getter
    WebElement addCustomerBtn;

    @FindBy(css = "[ng-class=\"btnClass2\"]")
    @Getter
    WebElement openAccountBtn;

    @FindBy(css = "[ng-class=\"btnClass3\"]")
    @Getter
    WebElement customersBtn;

    @FindBy(css = "[id=\"userSelect\"]")
    @Getter
    WebElement customerField;

    @FindBy(css = "[class=\"ng-pristine ng-valid\"]")
    @Getter
    WebElement searchCustomerField;

    public boolean verifyAddCustomerFieldsDisplayed() {
        if (firstNameField.isDisplayed()) {
            System.out.println(firstNameField.getText());
            return true;
        }
        return false;
    }
    public boolean verifyOpenAccountFieldsDisplayed() {
        if (customerField.isDisplayed()) {
            System.out.println(customerField.getText());
            return true;
        }
        return false;
    }
    public boolean verifyCustomersFieldsDisplayed() {
        if (searchCustomerField.isDisplayed()) {
            System.out.println(searchCustomerField.getText());
            return true;
        }
        return false;
    }
}
