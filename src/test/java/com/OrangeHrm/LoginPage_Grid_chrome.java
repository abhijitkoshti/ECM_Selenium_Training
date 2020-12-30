package com.OrangeHrm;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage_Grid_chrome {

	RemoteWebDriver driver;
	
	@Test
	public void LoginWithValidCredentials() {
//		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
//		ChromeDriver driver = new ChromeDriver();
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//driver.findElement(By.xpath(xpathExpression));
		driver.findElementByName("txtUsername").sendKeys("Admin");
		driver.findElementByName("txtPassword").sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElementByLinkText("Dashboard").isDisplayed();
		driver.quit(); //Quit will close all the instances of browsers opened by WebDriver
	}
	
	@BeforeTest
	public void launchBrowser() throws MalformedURLException {
//		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
        //driver = new RemoteWebDriver(new URL("http://192.168.43.120:4444/wd/hub"), options);
//        driver = new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"), capability);
        
        driver = new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"), capability);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
	}

}
