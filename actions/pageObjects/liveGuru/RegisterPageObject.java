package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class RegisterPageObject extends AbstractPage {
	private WebDriver driver;
	
	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public String getRequiredErrorMassageAtFristNameTextbox;
	public String getRequiredErrorMassageAtLastNameTextbox;
	public String getRequiredErrorMassageAtEmailTextbox;
	public String getRequiredErrorMassageAtPasswordTextbox;
	public String getRequiredErrorMassageAtConfirmPasswordTextbox;
	public String getInvalidErrorMessageAtPasswordTextbox;

	public void clickToRegisterButton() {
		// TODO Auto-generated method stub
		
	}

	public void inputToEmailTextbox(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getInvalidErrorMessageAtEmailTextbox() {
		// TODO Auto-generated method stub
		return null;
	}

	public void inputToPasswordTextbox(String string) {
		// TODO Auto-generated method stub
		
	}

	public void inputToConfirmPasswordTextbox(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getInvalidErrorMessageAtConfirmPasswordTextbox() {
		// TODO Auto-generated method stub
		return null;
	}

	public void inputToFirstNameTextbox(String string) {
		// TODO Auto-generated method stub
		
	}

	public void inputToLastNameTextbox(String string) {
		// TODO Auto-generated method stub
		
	}

}
