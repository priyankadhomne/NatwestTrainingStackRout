package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollByUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/AuromationTestingDemo1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=2802183011095092157&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062011&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1%22)");
        JavascriptExecutor j = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        String Scrolldown = "window.scrollBy(0,10000)";
        j.executeScript(Scrolldown);
        Thread.sleep(3000);

        String ScrollUp = "window.scrollBy(0,-10000)";
        j.executeScript(ScrollUp);
        Thread.sleep(3000);



        driver.findElement(By.name("field-keywords")).sendKeys("iphone 15 pro max");//index,value or visible text;
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 Pro (128 GB) - Natural Titanium')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        //element.click();


    }
}
