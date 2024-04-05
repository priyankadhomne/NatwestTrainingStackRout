package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeweleryProductPage {
    // explicit = timeout
    //implicit = ElementNot Found

    @FindBy(xpath = "//input[@id='add-to-cart-button-14']")
    WebElement addToCardButton;

    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
            WebElement selectShoppingButton;


    JeweleryProductPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setAddToCardButton() {
        addToCardButton.click();
    }

    public void setSelectShoppingButton() {
        selectShoppingButton.click();
    }
}
