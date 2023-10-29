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
	
	//seconde page
	
	@FindBy(xpath = "//iframe[@id='form-usclaro']")
	public WebElement FrameId;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement Firstname;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement LastName;
	
	@FindBy(xpath =  "(//input[@type='text'])[3]")
	WebElement Company;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement Email ;
	
	@FindBy(xpath =  "(//input[@type='text'])[5]")
	WebElement PhoneNumber;
	
	@FindBy(className ="select")
	WebElement InterstingIn;
	
	@FindBy(className = "submit")
	WebElement submit_B;
	
	@FindBy(xpath   = "//p[contains(text(),'Invalid CAPTCHA')]")
	public WebElement error;

	public String getSourceURL() {
		return getattributesrc(FrameId);
	}
	

	public void ClickonMPLS() {
		 clickOnButton(MPLS);
	}
	public void acceptallcookies() {
		clickOnButton(acceptallcookies);
	}
	
	public void fillname(String name) {
		filladdvalue(Firstname, name);
	}
	
	public void filllastname(String LN) {
		filladdvalue(LastName, LN);
	}
	public void fillcompanyName(String compname) {
		filladdvalue(Company, compname);
	}
	public void fillemail(String em) {
		filladdvalue(Email, em);
	}
	public void fillnumber(String number) {
		filladdvalue(PhoneNumber, number);
	}
	public void fillinterstingin(String value) {
		selectvalue(InterstingIn, value);
	}
	
	public void clickonsubmitB() {
		clickOnButton(submit_B);
	}
}
