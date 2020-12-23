package com.OrangeHrm;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginPage_Saucelab {
	
	public static final String USERNAME = "koshti";
	public static final String ACCESS_KEY = "1f4561a0-dc7b-4802-a05c-5e07ab85488e";
	public static final String URL = "https://koshti:1f4561a0-dc7b-4802-a05c-5e07ab85488e@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	@Test
	public void LoginWithValidCredentials() throws MalformedURLException, InterruptedException {
		
        // TODO Auto-generated method stub
    	// Below Configuration for Win10/Chrome
    	//MutableCapabilities sauceOptions = new MutableCapabilities();
    	DesiredCapabilities sauceOptions = new DesiredCapabilities();
    	
    	//EdgeOptions browserOptions = new EdgeOptions();
    	ChromeOptions browserOptions = new ChromeOptions();
    	//SafariOptions browserOptions = new SafariOptions();
    	//FirefoxOptions browserOptions = new FirefoxOptions();
    	//browserOptions.setExperimentalOption("w3c", true);
    	browserOptions.setCapability("platformName", "macOS 10.13");
    	//browserOptions.setCapability("platformName", "Windows 10");
    	//browserOptions.setCapability("platformName", "Windows 7");
    	browserOptions.setCapability("browserVersion", "latest");
    	browserOptions.setCapability("sauce:options", sauceOptions);
   	
        WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), browserOptions);
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(8000);
		String Element = driver.findElement(By.linkText("Dashboard")).getText();
		System.out.println(Element);
		driver.quit();
		
		
		
		
		
		/*
		 * DesiredCapabilities sauceOptions = new DesiredCapabilities();
		 * 
		 * ChromeOptions browserOptions = new ChromeOptions();
		 * 
		 * browserOptions.setCapability("platformName", "macOS 10.13");
		 * browserOptions.setCapability("browserVersion", "latest");
		 * browserOptions.setCapability("sauce:options", "sauceOptions");
		 * 
		 * WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),
		 * browserOptions);
		 * 
		 * 
		 * 
		 * // WebDriverManager.chromedriver().version("86.0.4240.22").setup(); //
		 * ChromeDriver driver = new ChromeDriver(); //driver.navigate().to(
		 * "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 * driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 * //driver.findElement(By.xpath(xpathExpression));
		 * driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		 * driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 * driver.findElement(By.id("btnLogin")).click();
		 * driver.findElement(By.linkText("Dashboard")).isDisplayed(); driver.close();
		 * //Closes the current instance of the browser opened by WebDriver where the
		 * focus is driver.quit(); //Quit will close all the instances of browsers
		 * opened by WebDriver
		 */	}

}
