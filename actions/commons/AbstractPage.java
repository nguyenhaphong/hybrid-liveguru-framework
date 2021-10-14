package commons;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
	//WebDriver driver;
	// Hàm dùng chung cho package PageObjects
	// Selenium API Wrapper
	
	// Set access modifier là public hết
	// Tên hàm  lowerCase
	// Tham số của hàm (param)
	// Kiểu trả về (return type)
	// Sử dụng biến toàn cục hay cục bộ
	
	// Get URL open mở ra 1 page
	public void openPageUrl (WebDriver driver, String pageUrl) {
		driver.get(pageUrl);
	}
	
	// Get title
	public String getPageTitle (WebDriver driver) {
		return driver.getTitle();
	}
	
	// Get URl của page
	public String getPageUrl (WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public void backToPage (WebDriver driver) {
		driver.navigate().back();
	}
	
	public void refreshCurrentPage (WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public void forwardToPage (WebDriver driver) {
		driver.navigate().forward();;
	}
	
	public void acceptAlert (WebDriver driver) {
		alert = driver.switchTo().alert();
		alert.accept();
	}
	
	private Alert alert;

}
