package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotHB {
	
	  WebDriver driver;
	  @Test
	  public void TestHB() throws InterruptedException, IOException {
		  
		  System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("https://www.hollandandbarrett.com/"); 
            Thread.sleep(2000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
            driver.findElement(By.className("MyHB-module_container__GPBlR")).click();
            driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gmail.com");
            driver.findElement(By.id("password")).sendKeys("raghBN@123");
            driver.findElement(By.name("action")).click();
            Thread.sleep(2000);
            File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(src, new File("./screenshot/holland.png"));
    		driver.quit();	
            
            driver.quit();
		  
	  }

}
