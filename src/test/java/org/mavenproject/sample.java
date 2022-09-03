package org.mavenproject;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Greens");
		String name = username.getAttribute("value");
		Assert.assertEquals("verify username", "Greens", name);
		
		
		
		 WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("Hello@123456");
	    String pass = password.getAttribute("value");
	    Assert.assertEquals("verify password", "Hello@123456", pass);
	    
	    WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
		
		
	}
		
@AfterClass
public static void aftrcls() {
	driver.quit();
	
}

}

