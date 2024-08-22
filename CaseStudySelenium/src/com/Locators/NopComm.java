package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NopComm {
	
@Test
	public void ExampleID()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		Boolean val=driver.findElement(By.id("Email")).isSelected();
		System.out.println(val);
		Boolean val1=driver.findElement(By.name("Email")).isSelected();
		System.out.println(val1);
		Boolean val2=driver.findElement(By.id("Password")).isEnabled();
		System.out.println(val2);
		Boolean val3=driver.findElement(By.name("Password")).isEnabled();
		System.out.println(val3);
		
		
}
}
