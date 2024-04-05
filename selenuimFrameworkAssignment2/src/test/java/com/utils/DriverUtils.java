package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {
    static WebDriver driver;
    public static void createDriver() {
        System.setProperty("webdriver.chrome.driver","/home/ubuntu/Documents/selenuimFrameworkAssignment2/src/test/java/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static WebDriver getDriver() {
        if(driver == null) {
            createDriver();
        }
        return driver;
    }
}
