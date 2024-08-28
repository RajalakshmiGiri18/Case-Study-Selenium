package com.Browserlaunch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMultipleURL {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "./FirefoxDriver/geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "./EdgeBrowserJars/msedgedriver.exe");
        String[] urls = {
            "https://themeforest.net/",
            "https://demo.opencart.com/",
            "https://www.rediff.com/",
            "http://www.leafground.com/pages/Dropdown.html",
            "http://www.tizag.com/javascriptT/javascriptalert.php",
            "http://www.echoecho.com/htmlforms10.htm",
            "http://www.leafground.com/home.html",
            "http://automationpractice.com/index.php",
            "https://login.salesforce.com/?locale=in",
            "http://www.filehosting.org/",
            "http://www.bing.com/",
            "https://www.freecrm.com/",
            "http://www.half.ebay.com/",
            "https://alaskatrips.poweredbygps.com/",
            "http://www.qaclickacademy.com/interview.php",
            "https://app.saucelabs.com/login",
            "https://opensource-demo.orangehrmlive.com/",
            "http://only-testing-blog.blogspot.com/2014/05/form.html",
            "https://admin-demo.nopcommerce.com/Admin/Order/List",
            "https://auth.hollandandbarrett.com/u/login"
        };

        for (String url : urls) { 
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get(url);
            waitAndQuit(chromeDriver);

            WebDriver edgeDriver = new EdgeDriver();
            edgeDriver.get(url);
            waitAndQuit(edgeDriver);

            
            WebDriver firefoxDriver = new FirefoxDriver();
            firefoxDriver.get(url);
            waitAndQuit(firefoxDriver);
        }
    }

    private static void waitAndQuit(WebDriver driver) {
   
        try {
            Thread.sleep(1000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
