package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class TodoistLogin {
	
	WebDriver driver;

	By todoistUserName = By.name("email");
	By todoistPassword = By.name("password");
	By todoistLoginButton = By.className("submit_btn");
	
	public TodoistLogin(WebDriver driver) {
		this.driver = driver;
	}
	

	// Set the email/user id
	public void setEmail(String strEmail) {
		driver.findElement(todoistUserName).sendKeys(strEmail);
		
	}

	// Set the password
	public void setPassword(String strPassword) {
		driver.findElement(todoistPassword).sendKeys(strPassword);
	}

	// Click the login button
	public void clickLogin() {
		driver.findElement(todoistLoginButton).click();
	}


	/**
	 * Method to login to the Todoist application
	 * @param strEmail
	 * @param strPassword
	 * @return
	 */
	
	public void loginToTodoist(String strEmail, String strPassword) {
		
		// Fill in the email box
		this.setEmail(strEmail);
		
		// Fill in the password box
		this.setPassword(strPassword);
		
		// Click the Login button
		this.clickLogin();
	}
	
}