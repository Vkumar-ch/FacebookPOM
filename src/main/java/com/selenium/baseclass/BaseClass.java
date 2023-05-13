package com.selenium.baseclass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;
    public ExtentReports reports;
    public ExtentTest test;

    public void setUp() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
//        PropertyConfigurator.configure("C:\\Users\\hp\\IdeaProjects\\FacebookPom\\target\\log4j.properties");

        reports = new ExtentReports("C:\\Users\\hp\\IdeaProjects\\FacebookPom\\src\\ExtentReports.html");
        test  = reports.startTest("Extent Start");


    }

    public void closeBrowser(){
        driver.close();
        reports.endTest(test);
        reports.flush();
    }

}
