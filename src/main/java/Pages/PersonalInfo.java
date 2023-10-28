package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInfo extends MainClass {

	public PersonalInfo(WebDriver driver) {
		super(driver);
		
	} 
	@FindBy(xpath = "//iframe[@id='form-usclaro']")
	public WebElement FrameId;
	
	@FindBy(xpath = "//label[contains(text(),'First Name')]/input")
	WebElement FirstName; 
	
	@FindBy(xpath  = "//label[contains(text(),'Last Name')]/input")
	WebElement LastName;
	
	@FindBy(xpath =  "//label[contains(text(),'Company Name')]/input")
	WebElement Company;
	
	@FindBy(xpath =  "//label[contains(text(),'Phone Number')]/input")
	WebElement PhoneNumber;
	
	@FindBy(xpath = "Email")
	WebElement Email ;
	
	@FindBy(id = "//label[contains(text(),'Interested in')]/input")
	WebElement InterstingIn;
	
	@FindBy(xpath  = "(//input[@type='submit'])")
	WebElement submit_B;
	
	@FindBy(className  = "error no-label")
	public WebElement error;
	
	public void fillallinPersonIformation(String FN, String LN, String CompanyName, String emailadrees,String PN, String InterstinginDD) {
		filladdvalue(FirstName, FN);
		filladdvalue(LastName, LN);
		filladdvalue(Company, CompanyName);
		filladdvalue(Email, emailadrees);
		filladdvalue(PhoneNumber, PN);
		selectvalue(InterstingIn, InterstinginDD);
		clickOnButton(submit_B);
	}
}
