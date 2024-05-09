package StepDefinitons;

import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void setup() {
		setupDriver();
		
	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
		teardownDriver();
	}
	
}
