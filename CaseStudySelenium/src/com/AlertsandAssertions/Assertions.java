package com.AlertsandAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions {
	public class EaseMyTripTest {
	    WebDriver driver;

	    @Test
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.easemytrip.com");
	        String string1 = "MyAccount";
	        String string2 = "My Booking";
	        Assert.assertEquals(string1, "MyAccount", "String1 does not match expected value");
	        Assert.assertNotEquals(string1, string2, "String1 should not be equal to String2");
	        Assert.assertTrue(string1.contains("Account"), "String1 does not contain 'Account'");
	        Assert.assertFalse(string1.isEmpty(), "String1 should not be empty");
	        Assert.assertNull(null, "Object should be null");
	        Assert.assertNotNull(string1, "String1 should not be null");
	        driver.quit();
	    }
	}


}
