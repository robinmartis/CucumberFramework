package seleniumTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2E_Test {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("robin.martis@abc.com"); 
		driver.findElement(By.id("pass")).sendKeys("password");
		
		driver.findElement(By.linkText("Create new account")).click(); 
		
		driver.findElement(By.name("firstname")).sendKeys("Robin"); 
		driver.findElement(By.name("lastname")).sendKeys("Martis"); 
		driver.findElement(By.name("reg_email__")).sendKeys("9611299166");
		driver.findElement(By.name("reg_passwd__")).sendKeys("NewPassword"); 
		
		
	}

}
