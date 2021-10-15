package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.liveguru.MyDashboardPageUI;

public class MyDashboardPageObject extends AbstractPage {
	private WebDriver driver;
	
	public MyDashboardPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getWelcomeSuccessMessage() {
		waitElementVisible(driver, MyDashboardPageUI.WELCOME_MESSAGE_TEXT);
		return getElementText(driver, MyDashboardPageUI.WELCOME_MESSAGE_TEXT);
	}

}
