package Pages;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserForm extends MainClass {

	public AddUserForm(WebDriver driver) {
		super(driver);
	}
	@FindBy(name = "FirstName")
	WebElement firstName;
	
	@FindBy(name = "LastName")
	WebElement lastName;
	
	@FindBy(name = "UserName")
	WebElement userName;
	
	@FindBy(name = "Password")
	WebElement Password;
	
	@FindBy(xpath = "//input[@value='15']")
	WebElement companyAAA;
	
	@FindBy(xpath = "//input[@value='16']")
	WebElement companyBBB;
	
	//dropdown
	@FindBy(name = "RoleId")
	WebElement role;
	
	@FindBy(name = "Email")
	WebElement email;
	
	@FindBy(name = "Mobilephone")
	WebElement mobilePhone;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButton;
	 
	
	
	public void setUserData(String FN, String LS, String US, String pass) {
		filladdvalue(firstName, FN);
		filladdvalue(lastName, LS);
		filladdvalue(userName, US);
		filladdvalue(Password, pass); 
	}
	public void company(String companyName) {
		if(companyName=="AAA") {
			clickOnButton(companyAAA); 
			}
		if(companyName=="BBB"){
			clickOnButton(companyBBB);
		} 
		else {
			clickOnButton(companyAAA);
		}
			
		}
	public void setRule(String ruleName) {
		selectvalue(role, ruleName);
	}
	public void setEmail(String Email) {
		filladdvalue(email, Email);
	}
	public void setCellPhone(String phone) {
		filladdvalue(mobilePhone, phone);
	}
	public void clickonSave() {
		clickOnButton(saveButton);
	}
	
	
	}
	


