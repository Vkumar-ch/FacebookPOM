package com.selenium.pages;

import com.selenium.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseClass {

//    WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailElement;

    @CacheLookup
    @FindBy(name = "pass")
    WebElement passwordElement;

    @CacheLookup
    @FindBy(name = "login")
    WebElement loginElement;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void loginPageClick() throws InterruptedException, IOException {
        Thread.sleep(1000);
        emailElement.sendKeys("testingtestdatablz@gmail.com");
        Thread.sleep(1000);
        passwordElement.sendKeys("testing123");
        Thread.sleep(1000);

        loginElement.click();
        Thread.sleep(1000);






    }

}
