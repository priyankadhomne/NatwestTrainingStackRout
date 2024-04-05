package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NatwestOpen {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/AuromationTestingDemo1/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();

      //driver.get("https://googlechromelabs.github.io/chrome-for-testing/");
      driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        // forword,backword and refresh
        driver.navigate().to("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158294!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=Cj0KCQjwqdqvBhCPARIsANrmZhNTOlScff6Yiu01bDr9Q6lADaXBTRnT1Taj_TuDZSq4kkXfhCmpkYwaArrFEALw_wcB");
        driver.navigate().forward();
        driver.navigate().to("https://www.flipkart.com/travel/flights?param=DTNavIcon&fm=neo%2Fmerchandising&iid=M_6eb4846e-0bc1-4ecc-974e-b37bf80d4db4_1_372UD5BXDFYS_MC.V4ZPKTOAO321&otracker=hp_rich_navigation_7_1.navigationCard.RICH_NAVIGATION_Travel_V4ZPKTOAO321&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_7_L0_view-all&cid=V4ZPKTOAO321");
        driver.navigate().back();
        driver.navigate().refresh();
        //close = close parent browser
        //Quit -= close parent and child browser close.
        //driver.close();
        driver.quit();
    }
}
