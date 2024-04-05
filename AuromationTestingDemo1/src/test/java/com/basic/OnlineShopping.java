package com.basic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlineShopping {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/AuromationTestingDemo1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://advantageonlineshopping.com/");

        //driver.manage().window().setSize(new Dimension(1024, 768));
        //Thread.sleep(3000);
        //((JavascriptExecutor) driver).executeScript("document.body.style.zoom='60%'");


//        Thread.sleep(3000);
//        driver.findElement(By.id("menuUser")).click();
//        Thread.sleep(5000);
//
//
//        ((JavascriptExecutor) driver).executeScript("arguments[0].style.transform = 'scale(5)';", menuUser);

//        WebElement element = driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();

        WebElement menuUser = driver.findElement(By.id("menuUser"));
        menuUser.click(); // Click on the "menuUser" element

        // Wait for the next page to load (add an appropriate wait here if needed)

        // Zoom in on the page (increase zoom level)
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '75%'");

        Thread.sleep(5000); // Wait for 5 seconds
        driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();






        //driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]")).click();
        //driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
        //CREATE NEW ACCOUNT  "//a[contains(text(),'Fiction')]")).click()
        //Thread.sleep(3000);




    }
}
