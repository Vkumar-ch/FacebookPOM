package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;

public class HomePage {
    WebDriver driver;

    @FindBy(linkText = "Create story")
    WebElement createPostElement;

    @FindBy(xpath = "//div[contains(text(),'Create a Photo Story')]")
    WebElement photoElement;

    @FindBy(xpath = "//span[contains(text(),'Discard')]")
    WebElement discardElement;

//    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
//    WebElement discardStoryElement;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void addPhoto() throws InterruptedException, IOException, AWTException {
        Thread.sleep(3000);
        createPostElement.click();
        Thread.sleep(3000);
        photoElement.click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\hp\\Downloads\\AutoIt\\profileFile.exe");
        Thread.sleep(3000);
        discardElement.click();
        Thread.sleep(1000);
//        discardStoryElement.click();
//        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.mouseMove(860,364);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }
}
