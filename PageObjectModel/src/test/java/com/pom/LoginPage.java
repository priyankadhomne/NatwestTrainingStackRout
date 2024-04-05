package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //Declaration   //locator
    @FindBy(name="username")
    WebElement txtUsername;

    @FindBy(xpath = "//input[@name='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonLogin;

    //Initialization(object create)

    LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    // Utilization(Create methods)
    public void enterUsername(String str) {
        txtUsername.sendKeys(str);
    }

    public void enterPassword(String str) {
        txtPassword.sendKeys(str);
    }

    public void clickLogin() {
        buttonLogin.click();
    }

}
