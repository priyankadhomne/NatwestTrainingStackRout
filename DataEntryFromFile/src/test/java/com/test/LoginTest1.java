package com.test;

import com.pom.LoginPage;
import com.utils.DriverUtils;
import com.utils.ExcelData;
import org.testng.annotations.Test;

public class LoginTest1 {
    @Test
    public void verifyLogin() {
        LoginPage loginPage = new LoginPage();
        DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String email = ExcelData.getdata("/home/ubuntu/Documents/DataEntryFromFile/src/test/java/data/Book6.xlsx","Sheet1",0,0);
        String pass = (ExcelData.getdata("/home/ubuntu/Documents/DataEntryFromFile/src/test/java/data/Book6.xlsx","Sheet1",0,1));
        loginPage.setUsername(email);
        loginPage.setPassword(pass);
        loginPage.setClickOnSubmit();
    }
}
