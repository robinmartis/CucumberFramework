package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager1;

public class TestContext {
	
	private WebDriverManager1 webdriverManager; 
	private PageObjectManager pageObjectManager; 
	
	public TestContext() {
		
		webdriverManager = new WebDriverManager1(); 
		pageObjectManager = new PageObjectManager(webdriverManager.getDriver()); 
		
	}
	
	public WebDriverManager1 getWebDriverManager() {
		return webdriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
