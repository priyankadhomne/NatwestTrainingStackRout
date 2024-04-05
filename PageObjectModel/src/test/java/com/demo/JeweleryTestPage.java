package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JeweleryTestPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/AuromationTestingDemo1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        JeweleryPage jeweleryPage = new JeweleryPage(driver);
        driver.navigate().to("https://demowebshop.tricentis.com/register");
        jeweleryPage.clickJewelry();
        jeweleryPage.selectOrderBy("Price: High to Low");
        jeweleryPage.setPrizeByFilter();
        jeweleryPage.setSelectProduct();


        //driver.get("https://demowebshop.tricentis.com/black-white-diamond-heart");
        JeweleryProductPage jeweleryProductPage = new JeweleryProductPage(driver);
        jeweleryProductPage.setAddToCardButton();
        jeweleryProductPage.setSelectShoppingButton();


        // cart
        JeweleryCartPage jeweleryCartPage = new JeweleryCartPage(driver);
        jeweleryCartPage.setCheckDown();
        jeweleryCartPage.setClickOnCheckout();

        //Login
        JeweleryLoginPage jeweleryLoginPage = new JeweleryLoginPage(driver);
        jeweleryLoginPage.enterEmail("priyankadhomne22@navgurukul.org");
        jeweleryLoginPage.enterPassword("Priyanka");
        jeweleryLoginPage.setTickRemember();
        jeweleryLoginPage.setLoginButton();


        // cart
        jeweleryCartPage.setCheckDown();
        jeweleryCartPage.setClickOnCheckout();


    }
}
