package com.basic;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DemoSSOpen {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/AuromationTestingDemo1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=2802183011095092157&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062011&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1%22)");

//        TakesScreenshot t = (TakesScreenshot) driver;
//        File src = t.getScreenshotAs(OutputType.FILE);
//        File dest = new File ("/home/ubuntu/Pictures/Screenshots.png");
//        FileUtils.copyFile(src,dest);
//
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
//        Thread.sleep(3000);
//        List<WebElement> li = driver.findElements(By.xpath("//div[contains(text(),'iphone')]"));
//        Thread.sleep(3000);
//        int count = li.size();
//        Thread.sleep(3000);
//        System.out.println(count);
//        Thread.sleep(3000);
//        for (int i=0; i<count; i++) {
//            Thread.sleep(3000);
//            WebElement element = li.get(i);
//            Thread.sleep(3000);
//            System.out.println(element.getText());
//        }

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        driver.navigate().to("https://www.google.com");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("QSpiders");
//        Thread.sleep(3000);
//        List<WebElement> li = driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
//        Thread.sleep(3000);
//        int count = li.size();
//        Thread.sleep(3000);
//        System.out.println(count);
//        Thread.sleep(3000);
//        for (int i=0; i<count; i++) {
//            Thread.sleep(3000);
//            WebElement element = li.get(i);
//            Thread.sleep(3000);
//            System.out.println(element.getText());
//        }


//        Thread.sleep(3000);
//        System.out.println(driver.getTitle());
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        try {
//            wait.until(ExpectedConditions.titleContains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
//            System.out.println("Webpage loaded");
//        }
//        catch (Exception e) {
//            System.out.println("Webpage not loaded");
//        }
        driver.get("https://demoqa.com/alerts");
        WebElement element = driver.findElement(By.xpath("//button[text()='Click me']"));
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,5);
        try{
            actions.doubleClick(element).perform();
            Alert a=driver.switchTo().alert();
            wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Webpage loaded");
        }
        catch (Exception e) {
            System.out.println("Webpage not loaded");
        }
    }
}
