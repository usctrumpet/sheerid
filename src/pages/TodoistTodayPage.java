/*
 * This class represents the page that would be opened if the user 
 * selects the 'Today' item in the left pane.
 * Similarly, there would be a separate class for the 'Inbox', 
 * 'Next 7 days', etc items.
 * 
 * The architecture for this is that the elements found on this 'Today' page
 * are somewhat unique to this page: 'Add task', 'Add reminder', etc.  
 * Elements for the 'Inbox' page would typically be unique to the 'Inbox' page. 
 * and would exist in the class for that page.
 * 
 * Classes for all pages have not been implemented in this exercise.
 */

package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class TodoistTodayPage {
	
	WebDriver driver;
	
	By menuButton = By.className("menu_icon");
	
	By logoutItem = By.xpath("/html/body/div[14]/div/div[2]/div[10]/div[2]");
	
	By addNewTaskButton = By.linkText("Add task");
	
	By taskText = By.cssSelector(".public-DraftStyleDefault-block");
	
	By taskDate = By.className("item_editor_assign");
	
	By addTaskButton = By.className("item_editor_submit");
	
	By cancelTaskButton = By.className("cancel");
	
	public TodoistTodayPage(WebDriver driver) {
		
		this.driver = driver;
	}
	

	// Add a task
	
	public void addTask(String strTaskText, String strDate, boolean action) {
		
		// This will create a new task 
		
		driver.findElement(addNewTaskButton).click();
		
		driver.findElement(taskText).sendKeys(strTaskText);
		
		setTaskDate(strDate);
		
		// if the user specifies to create it, create it, otherwise cancel the operation
		
		if (action == true) {
			driver.findElement(addTaskButton).click();
			// dismiss the empty task box
			driver.findElement(cancelTaskButton).click();
		}
		else {
			driver.findElement(cancelTaskButton).click();
			}
		
				
	}
	
	public void setTaskDate(String taskDate) {
		/* 
		 * This control/element is very complicated and will not be 
         * implemented in this exercise.  But you can see that a complete
         * class would be implemented for it with all of the applicable 
         * elements.
         * 
         * If the user passes in a date, it would simply set it to that date.
         * If the user passes in 'Today', 'Tomorrow', 'Next week', or 'No Date',
         * that element would be clicked setting the date to the appropriate
         * date.
         * 
         * Manipulating the calendar controls would prove to be much more
         * involved.
         */		
		
		if (taskDate == "Today") {
			return;
		}
		else {
			/*
			 * We would do all the other stuff here...
			 */
		}
	}
	

}
