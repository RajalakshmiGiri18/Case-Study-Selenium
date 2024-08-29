package com.Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Screenshot {
    WebDriver driver;

    @Test
    public void testInChrome() {
        System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
        driver = new ChromeDriver();
        performTest();
    }

    @Test
    public void testInEdge() {
        System.setProperty("webdriver.edge.driver", "./EdgeBrowserJars/msedgedriver.exe");
        driver = new EdgeDriver();
        performTest();
    }

    public void performTest() {
 
            driver.manage().window().maximize();
            driver.get("https://www.hollandandbarrett.com/");

            WebElement signInButton = driver.findElement(By.xpath("//a[@href='/u/login']"));
            signInButton.click();

            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            username.sendKeys("your_username");
            password.sendKeys("your_password");
            loginButton.click();

            WebElement rewardsLink = driver.findElement(By.linkText("Rewards"));
            rewardsLink.click();
            takeScreenshot("screenshot.png");
            WebElement accountElement = driver.findElement(By.id("account"));       
            driver.quit();
        
    }

    public void takeScreenshot(String fileName) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
