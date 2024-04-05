package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.WatchEvent;

public class JeweleryPage {
    @FindBy(xpath = "//a[contains(text(),'Jewelry')]")
    WebElement jeweleryButton;

    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement orderByDropdown;

    @FindBy(xpath = "//span[contains(text(),'500.00')]")
    WebElement filterByPrice;

    @FindBy(xpath = "//a[contains(text(),'Black & White Diamond Heart')]")
    WebElement selectProduct;





    JeweleryPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }



    public void clickJewelry(){
        jeweleryButton.click();
    }

    public void selectOrderBy(String txt) throws InterruptedException {
        Select select = new Select(orderByDropdown);
        Thread.sleep(3000);
        select.selectByVisibleText(txt);
    }

    public void setPrizeByFilter() {
        filterByPrice.click();
    }

    public void setSelectProduct() {
        selectProduct.click();
    }
}
