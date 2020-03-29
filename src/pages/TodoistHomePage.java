/*
 * This class represents elements that would be unique to the Home page.
 * In this case, the Home page contains things like the 'Quick Find', 
 * 'Notifications', 'Menu Icon', etc.  Though they have not all been implemented
 * for this exercise.
 * 
 * The architecture for this page is such that 'common' items would appear in this class
 * and not need to be repeated across all classes/pages.
 * 
 */
package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class TodoistHomePage {
	
	WebDriver driver;
	
	By menuButton = By.className("menu_icon");
	
	By logoutItem = By.xpath("/html/body/div[14]/div/div[2]/div[10]/div[2]");
	//By logoutItem = By.cssSelector(".usermenu__row:nth-child(15)");
	
	By logoButton = By.id("logo");
	
	By todayFilter = By.id("filter_today");
	
	By inboxFilter = By.id("filter_inbox");
	
	public TodoistHomePage(WebDriver driver) {
		
		this.driver = driver;
	}

	
	// Click the menu button
	
	public void clickMenuButton() {
		
		driver.findElement(menuButton).click();
	}
	
	// Click the Log out item
	
	public void clickLogoutItem() {
		
		driver.findElement(logoutItem).click();
		
	}
	
	// Click Today filter
	
	public void clickTodayFilter() {
		
		driver.findElement(logoButton).click();
		//driver.findElement(inboxFilter).click();
		//driver.findElement(todayFilter).click();
	}
	
}
