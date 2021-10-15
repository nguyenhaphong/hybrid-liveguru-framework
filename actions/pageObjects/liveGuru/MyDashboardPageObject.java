package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class MyDashboardPageObject extends AbstractPage {
	private WebDriver driver;
	
	public MyDashboardPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getWelcomeSuccessMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
