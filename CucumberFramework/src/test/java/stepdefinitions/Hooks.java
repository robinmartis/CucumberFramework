package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.types.Hook;

public class Hooks {
	
	TestContext testContext; 
	
	public Hooks(TestContext context) {
		testContext = context; 
	}
	
	@Before
	public void beforeStep() {
		System.out.println("Steps to execute before the steps ");
	}

	
	@After
	public void afterStep() {
		System.out.println("Steps to execute after the steps");
	}
}
