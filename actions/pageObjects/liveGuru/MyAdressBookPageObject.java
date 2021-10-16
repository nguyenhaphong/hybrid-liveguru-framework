package pageObjects.liveGuru;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.liveguru.MyAdressBookPageUI;

public class MyAdressBookPageObject extends AbstractPage {
    private WebDriver driver;

    public MyAdressBookPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToTelephoneTextbox(String telephoneValue) {
        waitElementVisible(driver, MyAdressBookPageUI.TELEPHONE_TEXTBOX);
        sendKeyToElement(driver, MyAdressBookPageUI.TELEPHONE_TEXTBOX, telephoneValue);
    }

    public void inputToStreetAddressTextbox(String streetAddressValue) {
        waitElementVisible(driver, MyAdressBookPageUI.STREET_ADDRESS_TEXTBOX);
        sendKeyToElement(driver, MyAdressBookPageUI.STREET_ADDRESS_TEXTBOX, streetAddressValue);
    }

    public void inputToCityTextbox(String cityValue) {
        waitElementVisible(driver, MyAdressBookPageUI.CITY_TEXTBOX);
        sendKeyToElement(driver, MyAdressBookPageUI.CITY_TEXTBOX, cityValue);
    }

    public void inputToZipTextbox(String zipValue) {
        waitElementVisible(driver, MyAdressBookPageUI.ZIP_TEXTBOX);
        sendKeyToElement(driver, MyAdressBookPageUI.ZIP_TEXTBOX, zipValue);
    }

    public void selectValueInCountryDropdown(String countryValue) {
        waitElementVisible(driver, MyAdressBookPageUI.COUNTRY_DROPDOWN);
        selectItemInDropdown(driver, MyAdressBookPageUI.COUNTRY_DROPDOWN, countryValue);
    }

    public void clickToSaveAddressButton() {
        waitElemenClickable(driver, MyAdressBookPageUI.SAVE_ADDRESS_BUTTON);
        clickToElement(driver, MyAdressBookPageUI.SAVE_ADDRESS_BUTTON);
    }

    public boolean isAddressSuccessMessageDisplayed() {
        waitElementVisible(driver, MyAdressBookPageUI.ADDRESS_SUCCESS_MESSAGE);
        return isElementDisplayed(driver, MyAdressBookPageUI.ADDRESS_SUCCESS_MESSAGE);
    }
}
