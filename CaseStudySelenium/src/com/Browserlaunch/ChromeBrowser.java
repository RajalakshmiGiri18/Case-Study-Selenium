package com.Browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowser {
	WebDriver driver;

	@Test
	public void BrowserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
	}
}
