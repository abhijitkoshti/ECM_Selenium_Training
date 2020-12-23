package com.OrangeHrm;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {
 
	
	public void DragDrop() throws InterruptedException{
		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
}
