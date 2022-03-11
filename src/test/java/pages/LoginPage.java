package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class LoginPage extends TestBase{
	//Elements
	@FindBy(name="email")
	static
	WebElement uname;
	
	@FindBy(name="password")
	static
	WebElement pwd;
	
	@FindBy(css=".ui.fluid.large.blue.submit.button")
	static
	WebElement loginBtn;
	
	@FindBy(linkText = "Forgot your password?")
	WebElement forgotPwd;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	//login
	public static void login(String strUser, String stPwd) {
		uname.sendKeys(strUser);
		pwd.sendKeys(stPwd);
		loginBtn.click();
	}
	
	//
}
