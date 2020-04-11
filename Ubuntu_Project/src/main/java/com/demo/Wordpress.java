package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Wordpress {

	public static WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("https://wordpress.com/log-in");
		driver.findElement(By.name("usernameOrEmail")).sendKeys("jsachinj");		
		driver.findElement(By.name("password")).sendKeys("sears@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		Thread.sleep(10000);
	}

	@Test
	public void wordpressTest() throws Exception {

		System.out.println("********* inside Test method ***** ");
		driver.findElement(By.xpath("//img[@class='gravatar']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

	@AfterMethod
	public void tearDown() {

		//driver.quit();

	}

}
