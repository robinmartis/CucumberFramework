package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataProvider.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import managers.FileReaderManager;
import managers.PageObjectManager;
import pageObjects.CreateNewAccountPage;
import pageObjects.LoginPage;

public class Steps {
	WebDriver driver; 
	LoginPage loginPage; 
	CreateNewAccountPage newAccountPage; 
	PageObjectManager pageObjectManager; 
//	ConfigFileReader configFileReader; 

	@Given("User is on home page")
    public void user_is_on_home_page() throws IOException {
//		configFileReader = new ConfigFileReader();
//		configFileReader.configReader();
        System.out.println("Navigated to home page");
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitWait())); 
		
		pageObjectManager = new PageObjectManager(driver); 
		loginPage = pageObjectManager.getLoginPage(); 
		newAccountPage = pageObjectManager.getCreateNewAccountPage(); 
		
//		driver.get("https://www.facebook.com/");
		
		driver.get(FileReaderManager.getInstance().getConfigReader().getuRL()); 
    }

    @When("User enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("Entered username and password");
        
//        Without Page Factory 
//        driver.findElement(By.id("email")).sendKeys("robin.martis@abc.com"); 
//		driver.findElement(By.id("pass")).sendKeys("password");
		
//        With Page Factory 
//        loginPage = new LoginPage(driver); 
//        loginPage.enterEmail("robin.martis@abc.com");
//        loginPage.enterpass("password");
        
//        With PageObjectManager
        loginPage.enterEmail("robin.martis@abc.com");
        loginPage.enterpass("password");
        
        
    }

    @And("Click on Create new account button")
    public void click_on_create_new_account_button() {
        System.out.println("Clicked on Create new account button");
        
//      Without Page Factory 
//        driver.findElement(By.linkText("Create new account")).click(); 
		 
//        Using Page Factory 
//        loginPage = new LoginPage(driver); 
//        loginPage.click_Create_New_Account();
        
//      With PageObjectManager
        loginPage.click_Create_New_Account();
        
    }

    @And("Enter First Name")
    public void enter_first_name() {
        System.out.println("Entered First Name");

//      Without Page Factory 
//		driver.findElement(By.name("firstname")).sendKeys("Robin"); 

//      Using Page Factory 
//        newAccountPage = new CreateNewAccountPage(driver); 
//        newAccountPage.enterFirstName("Robin"); 
        
//      With PageObjectManager
        newAccountPage.enterFirstName("Robin"); 
        
    }

    @And("Enter last Name")
    public void enter_last_name() {
        System.out.println("Entered Last Name");
//      Without Page Factory 
//		driver.findElement(By.name("lastname")).sendKeys("Martis"); 
		
//      Using Page Factory 
//        newAccountPage = new CreateNewAccountPage(driver); 
//        newAccountPage.enterLastName("Martis"); 
 
//      With PageObjectManager        
        newAccountPage.enterLastName("Martis");
		
    }

    @And("Enter Phone no")
    public void enter_phone_no() {
        System.out.println("Entered Phone Number");
        
//      Without Page Factory 
//        driver.findElement(By.name("reg_email__")).sendKeys("9611299166");
        
//      Using Page Factory 
//        newAccountPage = new CreateNewAccountPage(driver); 
//        newAccountPage.enterReg_email("abc.as@asa.com"); 

//      With PageObjectManager          
        newAccountPage.enterReg_email("abc.as@asa.com");         
        
    }

    @And("Enter New Password")
    public void enter_new_password() {
        System.out.println("Entered New Password");
        
//      Without Page Factory 
//        driver.findElement(By.name("reg_passwd__")).sendKeys("NewPassword");
        
//      Using Page Factory 
//        newAccountPage = new CreateNewAccountPage(driver); 
//        newAccountPage.enterReg_pass("asdadasd"); 

//      With PageObjectManager           
        newAccountPage.enterReg_pass("asdadasd"); 
        
        
    }
	
}
