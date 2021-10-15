package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.liveguru.HomePageUI;

public class HomePageObject extends AbstractPage {
	private WebDriver driver;

	// Hàm khởi tạo - constructor method
	// Trùng tên với tên class ko có kiểu trả về
	// Đượcgọi đến đầu tiên khi class được khởi tạo lên
	// Giúp mình khởi tạo context nào trước overloading: đa hình thái: 1 hàm cùng tên khác số lượng tham số/ 1 hàm cùng tên nhưng cùng số lượng tham số + khác kiểu dữ liệu của tham số
	
	// Gán biến local = global
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToMyAccountLink() {
		WaitElemenClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
		
	}

}
