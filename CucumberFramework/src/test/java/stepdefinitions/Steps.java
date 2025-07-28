package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver; 

	@Given("User is on home page")
    public void user_is_on_home_page() {
        System.out.println("Navigated to home page");
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		driver.get("https://www.facebook.com/");
    }

    @When("User enter username and password")
    public void user_enter_username_and_password() {
        System.out.println("Entered username and password");
        driver.findElement(By.id("email")).sendKeys("robin.martis@abc.com"); 
		driver.findElement(By.id("pass")).sendKeys("password");
				
    }

    @And("Click on Create new account button")
    public void click_on_create_new_account_button() {
        System.out.println("Clicked on Create new account button");
        driver.findElement(By.linkText("Create new account")).click(); 
		 
    }

    @And("Enter First Name")
    public void enter_first_name() {
        System.out.println("Entered First Name");

		driver.findElement(By.name("firstname")).sendKeys("Robin"); 
     
    }

    @And("Enter last Name")
    public void enter_last_name() {
        System.out.println("Entered Last Name");
		driver.findElement(By.name("lastname")).sendKeys("Martis"); 
		
    }

    @And("Enter Phone no")
    public void enter_phone_no() {
        System.out.println("Entered Phone Number");
        
        driver.findElement(By.name("reg_email__")).sendKeys("9611299166");

    }

    @And("Enter New Password")
    public void enter_new_password() {
        System.out.println("Entered New Password");
        driver.findElement(By.name("reg_passwd__")).sendKeys("NewPassword");
		
    }
	
}
