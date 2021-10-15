package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.liveguru.RegisterPageUI;

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
		waitElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
		
	}

	public String getGetRequiredErrorMassageAtFristNameTextbox() {
		waitElementVisible(driver, RegisterPageUI.REQUIRED_ERROR_MSG_FIRSTNAME_TEXTBOX);
		return getElementText(driver, RegisterPageUI.REQUIRED_ERROR_MSG_FIRSTNAME_TEXTBOX);
	}

	public String getGetRequiredErrorMassageAtLastNameTextbox() {
		waitElementVisible(driver, RegisterPageUI.REQUIRED_ERROR_MSG_LASTNAME_TEXTBOX);
		return getElementText(driver, RegisterPageUI.REQUIRED_ERROR_MSG_LASTNAME_TEXTBOX);
	}

	public String getGetRequiredErrorMassageAtEmailTextbox() {
		waitElementVisible(driver, RegisterPageUI.REQUIRED_ERROR_MSG_EMAIL_TEXTBOX);
		return getElementText(driver, RegisterPageUI.REQUIRED_ERROR_MSG_EMAIL_TEXTBOX);
	}

	public String getGetRequiredErrorMassageAtPasswordTextbox() {
		waitElementVisible((driver, RegisterPageUI.REQUIRED_ERROR_MSG_PASSWORD_TEXTBOX));
		return getElementText(driver, RegisterPageUI.REQUIRED_ERROR_MSG_PASSWORD_TEXTBOX);
	}

	public String getGetRequiredErrorMassageAtConfirmPasswordTextbox() {
		waitElementVisible(driver, RegisterPageUI.REQUIRED_ERROR_MSG_CONFIRM_PASSWORD_TEXTBOX);
		return getElementText(driver, RegisterPageUI.REQUIRED_ERROR_MSG_CONFIRM_PASSWORD_TEXTBOX);
	}

	public void inputToEmailTextbox(String emailValue) {
		waitElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, emailValue);
		
	}

	public String getInvalidErrorMessageAtEmailTextbox() {
		waitElementVisible(driver, RegisterPageUI.VALIDATE_ERROR_MSG_EMAIL_TEXTBOX);
		return getElementText(driver, RegisterPageUI.VALIDATE_ERROR_MSG_EMAIL_TEXTBOX);
	}

	public void inputToPasswordTextbox(String passwordValue) {
		waitElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, passwordValue);
		
	}

	public void inputToConfirmPasswordTextbox(String confirmPassword) {
		waitElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, confirmPassword);
		
	}

	public String getGetInvalidErrorMessageAtPasswordTextbox() {
		waitElementVisible(driver, RegisterPageUI.VALIDATE_PASSWORD_MSG_EMAIL_TEXTBOX);
		return getElementText(driver, RegisterPageUI.VALIDATE_PASSWORD_MSG_EMAIL_TEXTBOX);
	}

	public String getInvalidErrorMessageAtConfirmPasswordTextbox() {
		waitElementVisible(driver, RegisterPageUI.VALIDATE_CONFIRM_PASSWORD_MSG_EMAIL_TEXTBOX);
		return getElementText(driver, RegisterPageUI.VALIDATE_CONFIRM_PASSWORD_MSG_EMAIL_TEXTBOX);
	}

	public void inputToFirstNameTextbox(String firstNameValue) {
		waitElementVisible(driver, RegisterPageUI.FIRST_NAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX, firstNameValue);
		
	}

	public void inputToLastNameTextbox(String lastNameValue) {
		waitElementVisible(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, lastNameValue);
		
	}

}
