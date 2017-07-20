package com.w2a.AppiumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 * Small Change for Jenkins
 */
public class AppTest {
	WebDriver driver;
	String baseURL;
	
	@BeforeClass
	public void setUp(){
		driver = new ChromeDriver();
		baseURL = "http://www.gmail.co.in";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	
	@Test
	public void loginTest(){
		driver.get(baseURL);
		driver.findElement(By.id("identifierId")).sendKeys("abahsdbasd12123123");
		driver.findElement(By.id("identifierNext")).click();
		
		WebElement errorMsg = driver.findElement((By.xpath("//div[contains(text(),'Google Account')]")));
		System.out.println(errorMsg.getText());
		
		System.out.println("Code is working, now got commit");
	}
	@AfterClass
	public void tearDown(){
		driver.close();
		driver.quit();	
	}
}
