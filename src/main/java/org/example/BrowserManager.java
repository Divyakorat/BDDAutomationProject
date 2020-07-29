package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
    //creating object for load properties
    public static LoadProp loadProp = new LoadProp();
    //storing variable
    public static String browser = loadProp.getProperty("Browser");
    //creating class to open browser
    public  void BrowserSetup()
    {//if user want to run in to chrome browser
        if (browser.equalsIgnoreCase("chrome"))
        {
            //path and property for chrome driver
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
            //creating chromdriver object to open google chrome browser
            driver = new ChromeDriver();
            //if user want to run in firefox
        } else if (browser.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette",true);
            driver = new FirefoxDriver();
            //if user want to run in internet explorer
        } else if (browser.equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.IE.Driver", "src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            //if user enter wrong browser or keep empty
        } else
            System.out.println("You have entered wrong browser or empty browser" + browser);
        //maximising screen
        driver.manage().window().maximize();
        //applying implicity wait of 20 sec to the driver instance
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //open nopcommerce url
        driver.get(loadProp.getProperty("URL")); }
    //using reusable method to close browser
    public void closeBrowser()
    {
        driver.close();
    }
}


