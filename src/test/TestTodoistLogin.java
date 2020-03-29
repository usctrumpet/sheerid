package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.TodoistHomePage;

import pages.TodoistLogin;

public class TestTodoistLogin {
	
	String driverPath = "C:\\SeleniumDrivers\\chromedriver.exe";
	
	WebDriver driver;
	
	TodoistLogin objLogin;
	
	TodoistHomePage objHomePage;
	
	@BeforeTest
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
		driver.get("https://todoist.com/users/showLogin");
	}
	
	@Test(priority=0)
	
	public void test_Home_Page() {
		
		// Create Login page object
		
		objLogin = new TodoistLogin(driver);
		
		// Login to the application
		
		objLogin.loginToTodoist("uscgrad93@yahoo.com", "TestPassword1!");
		
		// Advance to the Home page
		
		objHomePage = new TodoistHomePage(driver);
		
		objHomePage.clickMenuButton();
		
		objHomePage.clickLogoutItem();
		
		driver.quit();
		
	}
	
	

}
