package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")
    WebElement CreateAccountLink;

    @FindBy(name = "firstname")
    WebElement firstNameElement;

    @FindBy(name = "lastname")
    WebElement surnameElement;

    @FindBy(name = "reg_email__")
    WebElement emailElement;

    @FindBy(name = "reg_email_confirmation__")
    WebElement conformEmailElement;

    @FindBy(name = "reg_passwd__")
    WebElement passwordElement;

    @FindBy(name = "birthday_day")
    WebElement dayElement;

    @FindBy(name = "birthday_month")
    WebElement monthElement;

    @FindBy(name = "birthday_year")
    WebElement yearElement;

    @FindBy(name = "websubmit")
    WebElement signUpSubmitElement;

    @FindBy(xpath = "//label[contains(text(),'Female')]")
    WebElement femaleRadioElement;

    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement maleRadioElement;

    @FindBy(name = "websubmit")
    WebElement submitElement;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void signUpClick() throws InterruptedException {
        Thread.sleep(3000);
        CreateAccountLink.click();
        Thread.sleep(3000);
        firstNameElement.sendKeys("vk");
        surnameElement.sendKeys("ch");
        Thread.sleep(1000);
        emailElement.sendKeys("vinodhkumarch554@gmail.com");
        Thread.sleep(1000);
        conformEmailElement.sendKeys("vinodhkumarch554@gmail.com");
        passwordElement.sendKeys("12345678@v");
        Thread.sleep(1000);
        Select selectDay = new Select(dayElement);
        selectDay.selectByValue("8");
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByValue("2");
        Select selectYear = new Select(yearElement);
        selectYear.selectByVisibleText("1998");
        Thread.sleep(1000);
        boolean sel = femaleRadioElement.isDisplayed();
        if (sel == true) {
            femaleRadioElement.click();
        }
        boolean selectNo = maleRadioElement.isDisplayed();

        if (selectNo == true) {
            maleRadioElement.click();
    }
        Thread.sleep(1000);
        submitElement.click();
        Thread.sleep(1000);

  }
}
