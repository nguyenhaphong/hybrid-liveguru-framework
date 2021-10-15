package com.liveguru.user;

import org.testng.annotations.Test;

import pageObjects.liveGuru.HomePageObject;
import pageObjects.liveGuru.LoginPageObject;
import pageObjects.liveGuru.MyDashboardPageObject;
import pageObjects.liveGuru.RegisterPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_03_Page_Object {
	WebDriver driver;
	HomePageObject homePage;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	MyDashboardPageObject myDashboardPage;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://live.demoguru99.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Get URL mowr ra trang Home
		homePage = new HomePageObject(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		// Click vào My Account link => Mở ra trang login
		homePage.clickToMyAccountLink();
		loginPage = new LoginPageObject(driver);
		
		// Click vào Create an Account => Mở ra trang Register
		loginPage.clickToCreateAnAccountButton();
		registerPage = new RegisterPageObject(driver);
	}
	
  
	@Test
	public void Register_01_Empty_Data () {
		// Click vào Register button
		registerPage.clickToRegisterButton();
		
		// Hàm verify dữ liệu
		Assert.assertEquals(registerPage.getRequiredErrorMassageAtFristNameTextbox, "This is a required field.");
		Assert.assertEquals(registerPage.getRequiredErrorMassageAtLastNameTextbox, "This is a required field.");
		Assert.assertEquals(registerPage.getRequiredErrorMassageAtEmailTextbox, "This is a required field.");
		Assert.assertEquals(registerPage.getRequiredErrorMassageAtPasswordTextbox, "This is a required field.");
		Assert.assertEquals(registerPage.getRequiredErrorMassageAtConfirmPasswordTextbox, "This is a required field.");
			
	}
	
	@Test
	public void Register_02_Invalid_Email () {
		// Nhập dữ liệu vào field email
		registerPage.inputToEmailTextbox("123@123.456");
		
		// Click vào register buton
		registerPage.clickToRegisterButton();
		
		// Hàm verify dữ liệu
		Assert.assertEquals(registerPage.getInvalidErrorMessageAtEmailTextbox(), "Please enter a valid email address. For example johndoe@domain.com.");
		
	}
	
	@Test
	public void Register_03_Password_Less_Than_6_Chars () {
		registerPage.inputToPasswordTextbox("1234");
		
		registerPage.clickToRegisterButton();
		
		Assert.assertEquals(registerPage.getInvalidErrorMessageAtPasswordTextbox, "Please enter 6 or more characters without leading or trailing spaces.");
	}
	
	@Test
	public void Register_04_Confirm_Password_Not_Matching_Password () {
		registerPage.inputToPasswordTextbox("1234");
		
		registerPage.inputToConfirmPasswordTextbox("123456");
		
		registerPage.clickToRegisterButton();
		
		Assert.assertEquals(registerPage.getInvalidErrorMessageAtConfirmPasswordTextbox(), "Please make sure your password match.");
	}
	
	@Test
	public void Register_05_Valid_Data () {
		registerPage.inputToFirstNameTextbox("Phong");
		
		registerPage.inputToLastNameTextbox("Nguyen");
		
		registerPage.inputToEmailTextbox("automation" + getRandomNumber() + "@gmail.com");
		
		registerPage.inputToPasswordTextbox("123456");
		
		registerPage.inputToConfirmPasswordTextbox("123456");
		
		registerPage.clickToRegisterButton();
		
		myDashboardPage = new MyDashboardPageObject(driver);
		Assert.assertEquals(myDashboardPage.getWelcomeSuccessMessage(), "Thank you for registering Main Website Store.");
		
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
