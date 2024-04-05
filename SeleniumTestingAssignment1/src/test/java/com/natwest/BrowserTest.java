package com.natwest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/SeleniumTestingAssignment1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        String greetingText = driver.getTitle();
        if (greetingText.equals("Google")) {
            System.out.println("Greeting message is correct");
        }
        else {
            System.out.println("Greeting message is not correct");
        }
    }
}
