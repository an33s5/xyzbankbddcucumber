package com.xyzbank.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.xyzbank.base.TestBase.driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"btn logout\"]")
    @Getter
    WebElement logoutBtn;

    @FindBy(css = "[id=\"userSelect\"]")
    WebElement selectAccountDropdown;

    @FindBy(css = "[type=\"submit\"]")
    @Getter
    WebElement loginBtn;


    public void selectFromDropdown() {
        Select select = new Select(selectAccountDropdown);
        select.selectByVisibleText("Harry Potter");
    }

    public boolean verifyCustomerLoggedOut(){
        if (selectAccountDropdown.isDisplayed()){
            System.out.println(selectAccountDropdown.getText());
            return true;
        }
        return false;
    }


}
