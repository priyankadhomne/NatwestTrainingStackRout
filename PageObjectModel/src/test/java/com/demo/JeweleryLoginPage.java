package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeweleryLoginPage {
    @FindBy(name="Email")
    WebElement txtEmail;

    @FindBy(name="Password")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@id='RememberMe']")
    WebElement tickRemember;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement loginButton;

    JeweleryLoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void enterEmail(String msg) {
        txtEmail.sendKeys(msg);
    }

    public void enterPassword(String msg) {
        txtPassword.sendKeys(msg);
    }

    public void setTickRemember() {
        tickRemember.click();
    }

    public void setLoginButton() {
        loginButton.click();
    }
}
