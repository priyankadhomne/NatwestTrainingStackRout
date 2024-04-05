package com.demo;

import org.testng.annotations.Test;

public class PractTest {
   @Test(priority = 1)
    public void Addition() {
        System.out.println("This is Addition");
    }

    @Test(enabled = false)
    //(priority = 2,dependsOnMethods = "Subtraction")
    public void Division() {
        System.out.println("This is Division");
    }

    @Test(priority = 3)
    public void Subtraction() {
        System.out.println("This is subtraction");
    }

    /*@Test
    public void orangeHRMVerifyLogin() {
        System.out.println("Login verified");
    }

    @Test(groups = {"orangeHRMVerifyLogin","testNGVerifyLogin"})
    public void testNGVerifyLogin() {
        System.out.println("Test login verified");
    }

    @Test(dependsOnMethods = {"orangeHRMVerifyLogin","testNGVerifyLogin"})
    public void amazonVerifiedLogout() {
        System.out.println("Logout successfully");
    }*/
}
