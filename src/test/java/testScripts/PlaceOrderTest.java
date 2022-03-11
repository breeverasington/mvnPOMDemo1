package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchResultPage;

public class PlaceOrderTest extends TestBase{
	HomePage homePage;
	SearchResultPage resultPage;
	
	@BeforeTest
	public void launchApp() {
		initialize();
	}
	
	public void searchItem() {
		homePage = new HomePage();
		homePage.searchItem("Phone");
		resultPage = new SearchResultPage();
		resultPage.isResultPageDisplayed();
	}
	
		@Test
		public void addItemTest() {
		resultPage.addItemToCart();
		resultPage.isItemAdded();
		}
}