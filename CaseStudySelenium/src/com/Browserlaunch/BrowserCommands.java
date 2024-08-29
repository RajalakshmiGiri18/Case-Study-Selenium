package com.Browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
    WebDriver driver;
    String[] urls = {
        "https://demo.opencart.com/",
        "http://www.bing.com/",
        "https://www.freecrm.com/",
        "http://www.half.ebay.com/",
        "https://opensource-demo.orangehrmlive.com/"
    };

    @Test(priority = 1)
    public void ChromeBrowsercmd() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
        for (String url : urls) {
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            System.out.println(driver.getTitle().length());
            String pagesrc = driver.getPageSource();
            System.out.println(pagesrc);
            int l = driver.getPageSource().length();
            System.out.println("page source length:" + l);
            Thread.sleep(5000); 
            driver.quit();
        }
    }

    @Test(priority = 2)
    public void EdgeBrowserLaunch() throws Exception {
        System.setProperty("webdriver.edge.driver", "./EdgeBrowserJars/msedgedriver.exe");
        for (String url : urls) {
            driver = new EdgeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            System.out.println(driver.getTitle().length());
            String pagesrc = driver.getPageSource();
            System.out.println(pagesrc);
            int l = driver.getPageSource().length();
            System.out.println("page source length:" + l);
            Thread.sleep(5000);
            driver.quit();
        }
    }

    @Test(priority = 3)
    public void FirefoxBrowserLaunch() throws Exception {
        System.setProperty("webdriver.gecko.driver", "./FirefoxDriver/geckodriver.exe");
        for (String url : urls) {
            driver = new FirefoxDriver();
            driver.get(url);
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            System.out.println(driver.getTitle().length());
            String pagesrc = driver.getPageSource();
            System.out.println(pagesrc);
            int l = driver.getPageSource().length();
            System.out.println("page source length:" + l);
            Thread.sleep(5000); 
            driver.quit();
        }
    }
}
