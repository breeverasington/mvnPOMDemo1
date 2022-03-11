package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.TestBase;
import pages.LoginPage;

public class ContactTest extends TestBase{
	static LoginPage login;
	@BeforeTest
	public void launchApp() {
		initialize();
	}
	
	@Test
	public void validateUser() {
	}
}
