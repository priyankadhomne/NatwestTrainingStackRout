package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage  extends BasePage{
    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a")
    WebElement clickOnRegisterImage;

    @FindBy(name = "firstName")
    WebElement enterFirstName;

    @FindBy(name = "lastName")
    WebElement enterLastName;

    @FindBy(name = "phone")
    WebElement enterPhoneNumber;
    @FindBy(name = "userName")
    WebElement enterEmail;
    @FindBy(name = "address1")
    WebElement enterAddress;

    @FindBy(name = "city")
    WebElement enterCityName;
    @FindBy(name = "state")
    WebElement enterStateName;
    @FindBy(name = "postalCode")
    WebElement enterPostalCode;
    @FindBy(name = "country")
    WebElement selectCountryName;

    @FindBy(name = "email")
    WebElement enterUserName;

    @FindBy(name = "password")
    WebElement enterPassword;

    @FindBy(name = "confirmPassword")
    WebElement enterConfirmPassword;

    @FindBy(name = "submit")
    WebElement clickOnSubmit;

    public void setClickOnRegisterImage() {
        clickOnRegisterImage.click();
    }
    public void setEnterFirstName(String str) {
        enterFirstName.sendKeys(str);
    }
    public void setEnterLastName(String str) {
        enterLastName.sendKeys(str);
    }
    public void setEnterPhoneNumber(String str) {
        enterPhoneNumber.sendKeys(str);
    }

    public void setEnterEmail(String str) {
        enterEmail.sendKeys(str);
    }
    public void setEnterAddress(String str) {
        enterAddress.sendKeys(str);
    }
    public void setEnterCityName(String str) {
        enterCityName.sendKeys(str);
    }
    public void setEnterStateName(String str) {
        enterStateName.sendKeys(str);
    }
    public void setEnterPostalCode(String str) {
        enterPostalCode.sendKeys(str);
    }
    public void setSelectCountryName() {
        Select select = new Select(selectCountryName);
        select.selectByVisibleText("INDIA");
    }
    public void setEnterUserNameEmail(String str) {
        enterUserName.sendKeys(str);
    }
    public void setEnterPassword(String str) {
        enterPassword.sendKeys(str);
    }
    public void setEnterConfirmPassword(String str) {
        enterConfirmPassword.sendKeys(str);
    }
    public void setClickOnSubmit() {
        clickOnSubmit.click();
    }
}
