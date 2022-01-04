package com.kylesweigart.demo.pagesObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaDocumentationPage {
    WebDriver chromeDriver;
    WebDriver firefoxDriver;
    WebDriver edgeDriver;

    @BeforeTest
    public void setUp() {
        // Points to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        // Instantiate new ChromeDriver object
        chromeDriver = new ChromeDriver();

        // Points to geckodriver.exe
        // System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        // Instantiate new Firefox driver object
        // firefoxDriver = new FirefoxDriver();

        // Points to msedgedriver.exe
        // System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        // Instantiate new Microsoft Edge driver object
        // edgeDriver = new EdgeDriver();
    }

    @Test
    public void javaDocumentationTest() {
        // Supply URL as argument to get() method
        chromeDriver.get("https://docs.oracle.com/en/java/");

        // Gets title from URL
        System.out.println(chromeDriver.getTitle());

        // Gets current URL
        System.out.println(chromeDriver.getCurrentUrl());

        // Implicit wait
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Finds web page element by ID in HTML tag and assigns to wait object
        WebElement javaHeader2 = new WebDriverWait(chromeDriver, 5).until(
                (chromeDriver -> chromeDriver.findElement(By.id("JavaPlatform%2CStandardEdition(JavaSE)"))
        ));

        // Assert Java header equals the expected header text
        Assert.assertEquals(javaHeader2.getText(), "Java Platform, Standard Edition (Java SE)");
    }

    @AfterTest
    public void cleanUp() {
        // Closes web browser
        // chromeDriver.close();

    }
}
