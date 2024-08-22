package com.Browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMultipleURL {
	WebDriver driver;
	String[] urls = { "http://automationpractice.com/index.php", "https://www.example.com", "https://www.google.com",
			"https://www.wikipedia.org", "https://www.github.com" };

	@BeforeMethod
	@Parameters("browser")
	public void setup(@Optional("chrome") String browser) {
		try {
			System.out.println("Browser: " + browser);
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "./EdgeBrowserJars/msedgedriver.exe");
				driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./FirefoxDriver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to initialize the WebDriver for browser: " + browser);
		}
	}

	@Test
	public void testURLs() throws Exception {
		for (String url : urls) {
			driver.get(url);
			System.out.println("Title: " + driver.getTitle());
			System.out.println("Title Length: " + driver.getTitle().length());
			String pagesrc = driver.getPageSource();
			System.out.println("Page Source Length: " + pagesrc.length());
		}
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { TestMultipleURL.class });
		testng.setDefaultSuiteName("Suite");
		testng.setDefaultTestName("Test");
		testng.setGroups("chrome,edge,firefox");
		testng.run();
	}
}
