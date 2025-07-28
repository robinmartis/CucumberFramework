package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver; 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement username; 
	
	@FindBy(id = "pass")
	private WebElement password; 
	
	@FindBy(linkText = "Create new account")
	private WebElement createNewAccountbtn; 
	
	public void enterEmail(String email) {
		username.sendKeys(email);
	}
	
	public void enterpass(String pas) {
		password.sendKeys(pas);
	}
	
	public void click_Create_New_Account() {
		createNewAccountbtn.click();
	}
	
	
	
	
	
	
	
}