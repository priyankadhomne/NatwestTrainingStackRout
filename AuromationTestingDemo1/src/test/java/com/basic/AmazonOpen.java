package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOpen {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/AuromationTestingDemo1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        //driver.findElement(By.xpath("//button[@class='oxd-button--medium.oxd-button--main.orangehrm-login-button']")).click();
        //driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();

        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstName")).sendKeys("Raghav");
        driver.findElement(By.name("middleName")).sendKeys("Raman");
        driver.findElement(By.name("lastName")).sendKeys("Shrivastawa");

        driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Raghav@123");
        //driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active")).sendKeys("your_username_here");
        driver.findElement(By.cssSelector("username")).sendKeys("Minal");
    }
}
