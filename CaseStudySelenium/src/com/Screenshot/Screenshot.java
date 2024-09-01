package com.Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

public class Screenshot {
    WebDriver driver;

    @Test
    public void performTest() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hollandandbarrett.com/"); 
        // Wait for the overlay to disappear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));

         
        WebElement element = driver.findElement(By.className("MyHB-module_container__GPBlR"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

        Thread.sleep(2000);
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"_root_\"]/div[1]/div[3]/div[1]/div[2]/a"));
        signInButton.click();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.name("action"));

        username.sendKeys("raghu.astepahead@gmail.com");
        password.sendKeys("raghuBN@123");
        loginButton.click();

        WebElement rewardsLink = driver.findElement(By.linkText("Rewards"));
        rewardsLink.click();
        
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("./screenshot/google.png"));       
        driver.quit();
    }
}
