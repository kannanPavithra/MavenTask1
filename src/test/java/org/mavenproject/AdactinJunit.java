package org.mavenproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AdactinJunit  {
	 
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@Test
	public void login() {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("pavithrakannan");
		
		String name = txtusername.getAttribute("value");
		Assert.assertEquals("verify username", "pavithrakannan", name);
		
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Pavithra");
		
		String pass = password.getAttribute("value");
		Assert.assertEquals("verify password", "Pavithra", pass);
		
		WebElement btnlogin = driver.findElement(By.id("login"));
        btnlogin.click();
        
        
	}
	@After
	public void afterMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}
	@Before
	public void beforeMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

}
