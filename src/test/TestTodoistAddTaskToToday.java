package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.*;

import pages.TodoistHomePage;

import pages.TodoistLogin;

import pages.TodoistTodayPage;

public class TestTodoistAddTaskToToday {
	
	final boolean CANCEL = false;
	final boolean CREATE = true;
	
	String driverPath = "C:\\SeleniumDrivers\\chromedriver.exe";
	
	WebDriver driver;
	
	TodoistLogin objLogin;
	
	TodoistHomePage objHomePage;
	
	TodoistTodayPage objTodayPage;
	
	@BeforeTest

	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://todoist.com/users/showLogin");
		
		// Create Login page object
		
		objLogin = new TodoistLogin(driver);
		
		// Login to the application
		
		objLogin.loginToTodoist("uscgrad93@yahoo.com", "TestPassword1!");
		
		// Advance to the Home page
		
		objHomePage = new TodoistHomePage(driver);
		
		objHomePage.clickTodayFilter();		
	}
	
	@Test(priority=0)

	public void test_Add_Task_To_Today_Page() {
		
		objTodayPage = new TodoistTodayPage(driver);
		
		objTodayPage.addTask("This is a new task", "Today", CREATE);
		
		// we should verify the task was created here...
		
	}

	@Test(priority=1)	

	public void test_Dont_Add_Task_To_Today_Page() {
				
		objTodayPage = new TodoistTodayPage(driver);
		
		objTodayPage.addTask("This is not a new task", "Today", CANCEL);
		
		// we should verify the task was not created here...
		
			
	}
	
	@AfterTest
	
	public void terminateBrowser() {

		objHomePage.clickMenuButton();
		
		objHomePage.clickLogoutItem();
		
		driver.quit();
		
	}
	
}
