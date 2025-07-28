package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage {
	
	WebDriver driver; 
	
	public CreateNewAccountPage(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement lastname; 
	
	@FindBy(name = "reg_email__")
	private WebElement reg_email; 
	
	@FindBy(name = "reg_passwd__")
	private WebElement password; 
	
	public void enterFirstName (String name) {
		firstname.sendKeys(name);
	}
	
	public void enterLastName (String name) {
		lastname.sendKeys(name);
	}
	
	public void enterReg_email (String email) {
		reg_email.sendKeys(email);
	}
	
	
	public void enterReg_pass(String pass) {
		password.sendKeys(pass);
	}
	


}
