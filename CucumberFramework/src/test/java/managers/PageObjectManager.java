package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CreateNewAccountPage;
import pageObjects.LoginPage;

public class PageObjectManager {
	
	private WebDriver driver; 
	
	private LoginPage loginPage; 
	private CreateNewAccountPage createNewAccountPage; 
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage getLoginPage() {
		return (loginPage == null ) ? loginPage = new LoginPage(driver): loginPage; 
	}
	
	public CreateNewAccountPage getCreateNewAccountPage() {
		return (createNewAccountPage== null) ? createNewAccountPage = new CreateNewAccountPage(driver): createNewAccountPage; 
	}
	
	

}
