package com.demo.runner;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingApplication {

	/*
	 * Testing FB Application manually:
	 * 1. Open Browser
	 * 2. Open the application
	 * 3. Enter username
	 * 4. Enter password
	 * 5. Click on Login
	 * 6. Close the browser
	 */
	
	public static void main(String[] args) {
		//Configuring the browser to be opened
		WebDriverManager.chromedriver().setup();
	
		//Step1: Open the browser window
		WebDriver driver1 = new ChromeDriver();
		
		//Step2: Open the application
		driver1.get("https://www.facebook.com/");
		
		//Anything we see on the webpage is a webelement
		WebElement username = driver1.findElement(By.id("email"));
		username.sendKeys("TestAjay");
		
		driver1.findElement(By.name("pass")).sendKeys("TestPassword");
		
		//driver.findElement(By.id("u_0_5_Nk")).click();
		driver1.findElement(By.name("login")).click();
		
		driver1.quit();
		
		//https://www.orangehrm.com/contact-sales/
		//Enter name, phone number and email
		
		
		
	}
}
