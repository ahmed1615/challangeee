package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MainClass {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "w-dropdown-toggle-1")
	public WebElement solution ;
	
	@FindBy (xpath = "//div[contains(text(),'MPLS')]")
	public WebElement MPLS;
	
	@FindBy(id = "onetrust-accept-btn-handler")
	WebElement acceptallcookies;
	
	public void ClickonMPLS() {
		 clickOnButton(MPLS);
	}
	public void acceptallcookies() {
		clickOnButton(acceptallcookies);
	}
}
