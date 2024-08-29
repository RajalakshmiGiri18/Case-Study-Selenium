package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	@Test
	public void setUp() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		WebElement month=driver.findElement(By.id("month"));
		Select month_dd=new Select(month);
		month_dd.selectByIndex(9);
		Thread.sleep(2000);
		month_dd.selectByValue("9");
		Thread.sleep(2000);
		month_dd.selectByVisibleText("Feb");
		Thread.sleep(2000);
		driver.quit();	
	}	

}
