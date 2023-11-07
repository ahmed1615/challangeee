package test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.Account;
import Pages.HomePage;

public class ScenarioTest extends TestBase{

	public String EmailMessageError= "Please enter a valid email or phone number.";
	public String passwordMessageError= "Your password must contain between 4 and 60 characters.";
	public String EmailFormatError= "Sorry, we can't find an account with this email address. Please try again or create a new account.";
	HomePage hp;
	Account account;
	Actions action;
	JavascriptExecutor jse;
	
	@Test(alwaysRun = true, priority = 1)
	public void GottoSigninPage(){
		HomePage hp = new HomePage(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-3000)");
		 hp.ClickOnSignButtonInHomePage();
		
	} 

	@Test(priority = 2, description = "login without email and password")
	public void LoginWithoutEmailAndPassword(){
		Account account =new Account(driver);
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		 wait.until(ExpectedConditions.elementToBeClickable(account.SignInButton));
		account.clickOnSignButton();
		wait.until(ExpectedConditions.visibilityOf(account.EmailError));
		assertEquals(account.EmailError.getText(), EmailMessageError);
		assertEquals(account.passwordError.getText(), passwordMessageError);
	}

	@Test(priority = 3, description = "login invalid nemail and invalid password")
	public void LoginWithinvalidEmailAndPassword(){
		Account account =new Account(driver);
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(account.emailUsername));
		Actions action = new Actions(driver);
		action.moveToElement(account.emailUsername).click().build().perform();
		action.sendKeys("email@test.com").build().perform();
		account.fillpassword("djshjsdh");
		account.clickOnSignButton();
		wait.until(ExpectedConditions.elementToBeClickable(account.SignInButton));
		assertEquals(account.BadEmailFormatError.getText(), EmailFormatError);
	}
	}