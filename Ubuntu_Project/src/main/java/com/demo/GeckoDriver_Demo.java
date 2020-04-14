package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class GeckoDriver_Demo {

	@Test
	public void openFirefox() throws Exception {

		System.setProperty("webdriver.gecko.driver",
				"src/main/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("sachin geck driver");
		System.out.println("*********** inside GeckoDriver_Demo class ************* ");
		Thread.sleep(5000);
		driver.close();
	}

}
