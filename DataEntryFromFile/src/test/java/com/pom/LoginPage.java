package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement clickOnSubmit;

    public void setUsername(String str) {
        username.sendKeys(str);
    }
    public void setPassword(String str) {
        password.sendKeys(str);
    }
    public void setClickOnSubmit() {
        clickOnSubmit.click();
    }
}
