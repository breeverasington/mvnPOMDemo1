package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class HomePage extends TestBase{
	//Elements
	@FindBy(name="email")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(css=".ui.fluid.large.blue.submit.button")
	WebElement loginBtn;
	
	@FindBy(linkText = "Forgot your password?")
	WebElement forgotPwd;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	//search
	public void searchItem(String product) {
		String strUser = null;
		String strPwd = null;
		uname.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}
	
	//
}