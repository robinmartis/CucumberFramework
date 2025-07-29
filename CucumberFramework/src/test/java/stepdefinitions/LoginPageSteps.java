package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager1;
import pageObjects.CreateNewAccountPage;
import pageObjects.LoginPage;
import testDataTypes.Customer;

public class LoginPageSteps {
//	WebDriver driver; 
//	LoginPage loginPage; 
//	CreateNewAccountPage newAccountPage; 
//	PageObjectManager pageObjectManager; 

	TestContext testContext; 
	LoginPage loginPage; 
	public LoginPageSteps(TestContext context) {
		testContext = context; 
		loginPage = testContext.getPageObjectManager().getLoginPage(); 
	}
	
	@Given("User is on home page")
    public void user_is_on_home_page() throws IOException {
		
		loginPage.navigateTo_LoginPage();
		 
    }
	
	
	@When("User enter {string} and {string}>")
	public void user_enter_and(String username, String password) {
        System.out.println("Entered username and password");
        
        Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(username);
        
        loginPage.enterEmail(username);
        loginPage.enterpass(password);
        
        
    }

    @And("Click on Create new account button")
    public void click_on_create_new_account_button() {
        System.out.println("Clicked on Create new account button");
        
        loginPage.click_Create_New_Account();
        
    }
    
    
}
