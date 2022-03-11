package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase{
	@FindBy(xpath = "//h1[contains(text(), 'Search')]")
	WebElement searchHeading;
	@FindBy(xpath = "//span[contains(text(), 'Add')]")
	WebElement addToCart;
	@FindBy(id="cart—total")
	WebElement cartTotal;
	@FindBy(css = "div.product-thumb")
	List<WebElement> items;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void addItemToCart() {
		addToCart.click();
	}

	public void isResultPageDisplayed() {
		// TODO Auto-generated method stub
		
	}

	public void isItemAdded() {
		// TODO Auto-generated method stub
		
	}
}