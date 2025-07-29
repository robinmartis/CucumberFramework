package managers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import enums.DriverType;
import enums.EnvironmentType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager1 {
	
	private WebDriver driver; 
	private static DriverType driverType; 
	private static EnvironmentType environmentType; 
	
	
	public WebDriverManager1() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser(); 
		environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment(); 
	}
	
	public WebDriver getDriver() {
		if (driver == null) driver= createDriver(); 
		return driver; 
	}
	
	private WebDriver createDriver() {
		   switch (environmentType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
	}
	
	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}

	private WebDriver createLocalDriver() {
        switch (driverType) {	    
        case FIREFOX : driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	
        	WebDriverManager.chromedriver().setup();
    		driver = new ChromeDriver(); 
    		driver.get(FileReaderManager.getInstance().getConfigReader().getuRL()); 
        	
    		break;
        case INTERNETEXPLORER : 
        	InternetExplorerOptions options = new InternetExplorerOptions();
        	driver = new InternetExplorerDriver();
    		break;
        }

        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitWait())); 
		
        return driver;
	}	

	public void closeDriver() {
		driver.close();
		driver.quit();
	}


}
