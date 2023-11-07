package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MainClass {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath =   "//a[@id='signIn']")
	public WebElement SignInButtonHomePage;

	@FindBy(linkText =   "Account")
	public WebElement Account ;

	public void clickonAccount(){
		clickOnButton(Account);
	}

	public void ClickOnSignButtonInHomePage(){
		clickOnButton(SignInButtonHomePage);
	}

}
