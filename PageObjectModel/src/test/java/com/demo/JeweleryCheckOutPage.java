package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeweleryCheckOutPage {
    @FindBy(xpath = "//input[@class='button-1 new-address-next-step-button']")
    WebElement tickOnContinue;

    @FindBy(xpath = "//input[@id='PickUpInStore']")
     WebElement tickOnPickUpInStore;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")
    WebElement tickOnAgainContinue;

    @FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
    WebElement tickOnPaymentOption;

    @FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
    WebElement tickOnPaymentInfo;

    @FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
    WebElement tickOnOrder;

    JeweleryCheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setTickOnContinue() {
        tickOnContinue.click();
    }

    public void setTickOnPickUpInStore() {
        tickOnPickUpInStore.click();
    }
    public void setTickOnAgainContinue() {
        tickOnAgainContinue.click();
    }
    public void setTickOnPaymentOption() {
        tickOnPaymentOption.click();
    }
    public void setTickOnPaymentInfo() {
        tickOnPaymentInfo.click();
    }
    public void setTickOnOrdere() {
        tickOnOrder.click();
    }
}

