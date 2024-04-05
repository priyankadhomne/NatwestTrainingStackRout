package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWorkShop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/AuromationTestingDemo1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demowebshop.tricentis.com/register");
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        driver.findElement(By.name("FirstName")).sendKeys("Priyanka");
        driver.findElement(By.name("LastName")).sendKeys("Dhomne");
        driver.findElement(By.name("Email")).sendKeys("priyankadhomne22@navgurukul.org");
        driver.findElement(By.name("Password")).sendKeys("Priyanka");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Priyanka");
        driver.findElement(By.xpath("//input[@id='register-button']")).click();


    }
}
