package com.DriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class SelDriverCommands {
	WebDriver driver;
	@Test
	 public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://store.webkul.com");
	        String pageTitle = driver.getTitle();
	        System.out.println("Page Title: " + pageTitle);
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Number of links: " + links.size());
	        for (WebElement link : links) {
	            System.out.println(link.getAttribute("href"));
	    }
	        driver.quit();
	 }

}
