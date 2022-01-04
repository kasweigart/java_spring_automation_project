package com.kylesweigart.demo.pagesObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaDocumentationPage {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Points to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        // Instantiate new ChromeDriver object
        driver = new ChromeDriver();
    }

    @Test
    public void javaDocumentationTest() {
        // Supply URL as argument to get() method
        driver.get("https://docs.oracle.com/en/java/");

        // Gets title from URL
        System.out.println(driver.getTitle());

        // Gets current URL
        System.out.println(driver.getCurrentUrl());

        // Closes web browser
        driver.close();

        // Quits the driver, closing every associated web browser window
        driver.quit();
    }
}
