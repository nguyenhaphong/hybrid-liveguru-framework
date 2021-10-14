package com.liveguru.user;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class User_01_Register_To_System {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://live.demoguru99.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		// Open my account page
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
		
		// Opent Register page
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
	}
	
  
	@Test
	public void Register_01_Empty_Data () {
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		
		//Verify error massage
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='advice-required-entry-firstname']")).getText(), "This is a required field");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='advice-required-entry-lastnam']")).getText(), "This is a required field");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='advice-required-entry-email_address']")).getText(), "This is a required field");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='advice-required-entry-password']")).getText(), "This is a required field");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='advice-required-entry-confirmation']")).getText(), "This is a required field");
		
	}
	
	@Test
	public void Register_02_Invalid_Email () {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234@123.321");
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='advice-validate-email-email_address']")).getText(), "Please enter a valid email address. For example johndoe@domain.com.");
		
	}
	
	@Test
	public void Register_03_Password_Less_Than_6_Chars () {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='advice-validate-password-password']")).getText(), "Please enter 6 or more characters without leading or trailing spaces.");
	}
	
	@Test
	public void Register_04_Confirm_Password_Not_Matching_Password () {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='advice-validate-password-password']")).getText(), "Please make sure your password match.");
	}
	
	@Test
	public void Register_05_Valid_Data () {
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Phong");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Nguyen");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("automation" + getRandomNumber() + "@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//li[@class='success-msg']//span")).getText(), "Thank you for registering Main Website Store.");
		
	}
 

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
  public int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(99999);
  }

}
