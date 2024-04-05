package com.test;

import com.pom.RegisterPage;
import com.utils.DriverUtils;
import org.testng.annotations.Test;

public class RegisterPageTest {
    @Test
    public void verifyRegisterPage() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage();
        DriverUtils.getDriver().get("https://demo.guru99.com/test/newtours/index.php");
        Thread.sleep(3000);
        registerPage.setClickOnRegisterImage();

        registerPage.setEnterFirstName("Priya");
        registerPage.setEnterLastName("Dhomne");
        registerPage.setEnterPhoneNumber("5637765490");
        registerPage.setEnterEmail("priyankadhomne22@navgurukul.org");

        registerPage.setEnterAddress("Near Karnataka Bank, Arcade Pg");
        registerPage.setEnterCityName("Bengaluru");
        registerPage.setEnterStateName("Karnatak");
        registerPage.setEnterPostalCode("443355");
        registerPage.setSelectCountryName();

        registerPage.setEnterUserNameEmail("priyankadhomne22@navgurukul.org");
        registerPage.setEnterPassword("Priyanka");
        registerPage.setEnterConfirmPassword("Priyanka");
        registerPage.setClickOnSubmit();

    }
}
