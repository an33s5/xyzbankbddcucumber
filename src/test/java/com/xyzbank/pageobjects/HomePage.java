package com.xyzbank.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.xyzbank.base.TestBase.driver;

public class HomePage {

    public HomePage (){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[ng-click=\"customer()\"]")
    @Getter
    WebElement customerLoginBtn;

    @FindBy(css = "[ng-click=\"manager()\"]")
    @Getter
    WebElement managerLoginBtn;


}
