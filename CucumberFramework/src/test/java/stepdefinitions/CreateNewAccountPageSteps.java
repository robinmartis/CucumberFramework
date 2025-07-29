package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import managers.PageObjectManager;
import pageObjects.CreateNewAccountPage;
import pageObjects.LoginPage;

public class CreateNewAccountPageSteps {
	
//	WebDriver driver; 
//	LoginPage loginPage; 
//	CreateNewAccountPage newAccountPage; 
//	PageObjectManager pageObjectManager; 
	
	
	TestContext testContext; 
	CreateNewAccountPage createNewAccountPage; 
	public CreateNewAccountPageSteps(TestContext context) {
		testContext = context; 
		createNewAccountPage = testContext.getPageObjectManager().getCreateNewAccountPage(); 
	}
	
	

    @And("Enter First Name")
    public void enter_first_name() {
        System.out.println("Entered First Name");

        createNewAccountPage.enterFirstName("Robin"); 
        
    }

    @And("Enter last Name")
    public void enter_last_name() {
        System.out.println("Entered Last Name");

        createNewAccountPage.enterLastName("Martis");
		
    }

    @And("Enter Phone no")
    public void enter_phone_no() {
        System.out.println("Entered Phone Number");
       
        createNewAccountPage.enterReg_email("abc.as@asa.com");         
        
    }

    @And("Enter New Password")
    public void enter_new_password() {
        System.out.println("Entered New Password");
       
        createNewAccountPage.enterReg_pass("asdadasd"); 
        
        
    }

}
