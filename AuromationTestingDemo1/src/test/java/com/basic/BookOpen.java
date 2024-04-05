package com.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BookOpen {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/AuromationTestingDemo1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.navigate().to("https://demowebshop.tricentis.com/register");
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");


        //Hover
        Thread.sleep(3000);
        /*WebElement elements = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.doubleClick(elements).perform();*/

        //WebElement element = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        WebElement element = driver.findElement(By.xpath("//button[contains,text(),'Double-Click Me To See Alert']"));
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        act.contextClick(element).perform();
        //Alert a = driver.switchTo().alert();
        //System.out.println(a.getText());
        //a.accept();
        //a.dismiss

        /*act.moveToElement(elements).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Desktops')][1]")).click();*/

        /*driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        driver.findElement(By.name("Email")).sendKeys("priyankadhomne22@navgurukul.org");
        driver.findElement(By.name("Password")).sendKeys("Priyanka");*/
        /*driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();*/


        /*Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Books')][1]")).click();
        Thread.sleep(3000);
        WebElement element1 = driver.findElement(By.xpath("//select[@id='products-orderby']"));//index,value or visible text;
        //driver.FindByElement(By.id()@slv);
        Select sel = new Select(element1);
        Thread.sleep(3000);
        //sel.selectByIndex(2);
        sel.selectByVisibleText("Name: A to Z");
        //sel.deselectAll();*/


        /*driver.findElement(By.xpath("//span[@class='PriceRange']")).click();
        //driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Fiction')]")).click();
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//div[@class='short-description']"));
        System.out.println(element.getText());

        driver.findElement(By.id("add-to-cart-button-45")).click();
        driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

        //driver.findElement(By.name("BillingNewAddress.CountryId")).sendKeys("India");
        //driver.findElement(By.name("BillingNewAddress.City")).sendKeys("Tirora");
        //driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("At post Kawalewada, District Gondia");
        //driver.findElement(By.name("BillingNewAddress.ZipPostalCode")).sendKeys("441911");
        //driver.findElement(By.name("BillingNewAddress.PhoneNumber")).sendKeys("9075367109");
        //driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button'][1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("PickUpInStore")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[5]/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[6]/div[2]/div[2]/input")).click();
        Thread.sleep(3000);*/

    }
}
