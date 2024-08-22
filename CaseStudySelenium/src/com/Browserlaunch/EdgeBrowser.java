package com.Browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeBrowser {
	WebDriver driver;

	@Test
	public void BrowserLaunch() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./EdgeBrowserJars/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();

	}
}
