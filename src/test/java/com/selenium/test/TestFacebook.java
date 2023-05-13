package com.selenium.test;

import com.selenium.baseclass.BaseClass;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;
import com.selenium.pages.SignUpPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class TestFacebook extends BaseClass {

    SignUpPage signUpPage;
    LoginPage loginPage;
    HomePage homePage;


   @BeforeMethod
    public void init() throws InterruptedException {
       setUp();
       signUpPage = new SignUpPage(driver);
       loginPage = new LoginPage(driver);
       homePage = new HomePage(driver);

   }
//   @Test
//    public void createAccountForFacebook() throws InterruptedException {
//       signUpPage.signUpClick();
//       Thread.sleep(1000);
//   }

   @Test(priority = 0)
   @Epic("Facebook Application")
   @Story("Log into Facebook")
   @Severity(SeverityLevel.CRITICAL)
    public void loginOntoFacebook() throws InterruptedException, IOException {
       loginPage.loginPageClick();
       Thread.sleep(1000);
   }

   @Test(priority = 1)
   @Epic("Facebook Application:Home Page")
   @Story("Upload a post")
   @Severity(SeverityLevel.BLOCKER)
    public void uploadPhoto() throws IOException, InterruptedException, AWTException {
       signUpPage.signUpClick();
       Thread.sleep(1000);
       loginPage.loginPageClick();
       Thread.sleep(3000);
       homePage.addPhoto();

   }

//   @AfterTest
//    public void tearDown(){
//       closeBrowser();
//   }



}
