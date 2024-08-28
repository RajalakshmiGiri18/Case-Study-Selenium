package com.Browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
	WebDriver driver;

	@Test(priority = 1)
	public void ChromeBrowsercmd() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		String pagesrc = driver.getPageSource();
		System.out.println(pagesrc);
		int l = driver.getPageSource().length();
		System.out.println("page source length:" + l);
		driver.quit();
	}

	@Test(priority = 2)
	public void EdgeBrowserLaunch() throws Exception {
		System.setProperty("webdriver.edge.driver", "./EdgeBrowserJars/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		String pagesrc = driver.getPageSource();
		System.out.println(pagesrc);
		int l = driver.getPageSource().length();
		System.out.println("page source length:" + l);
		driver.quit();
	}

	@Test(priority = 3)
	public void FirefoxBrowserLaunch() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./FirefoxDriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		String pagesrc = driver.getPageSource();
		System.out.println(pagesrc);
		int l = driver.getPageSource().length();
		System.out.println("page source length:" + l);
		driver.quit();
	}

}
