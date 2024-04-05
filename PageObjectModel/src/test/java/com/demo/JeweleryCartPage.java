package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeweleryCartPage {
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkDown;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;


    JeweleryCartPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setCheckDown() {
        checkDown.click();
    }

    public void setClickOnCheckout() {
        clickOnCheckout.click();
    }
}
