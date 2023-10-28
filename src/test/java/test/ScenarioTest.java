package test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.HomePage;
import Pages.PersonalInfo;


public class ScenarioTest extends TestBase{

	public String ErrorMS= "Invalid CAPTCHA";
	HomePage hp;
	PersonalInfo pi;
	Actions action;
	JavascriptExecutor jse;
	
	@Test(alwaysRun = true)
	public void Hoverandclick() throws InterruptedException{
		HomePage hp = new HomePage(driver);
		hp.acceptallcookies();
		Actions action = new Actions(driver);
		action.moveToElement(hp.solution).build().perform();
		 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		 wait.until(ExpectedConditions.elementToBeClickable(hp.MPLS));
		
	} 
	@Test(dependsOnMethods = "Hoverandclick" )
	public void scrolldownToPersonalInfo(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4200)");
	}
	@Test(dependsOnMethods = "scrolldownToPersonalInfo" )
	public void FillInformation() throws InterruptedException{
		PersonalInfo pi =new PersonalInfo(driver);
		driver.switchTo().frame("form-usclaro");
		Thread.sleep(3000);
		pi.fillallinPersonIformation("Mariana", "Vasquez", "claro", "mariana.vasquez@claro.com", "1122334455", "MPLS");
		assertEquals(ErrorMS, pi.error.getText(), "error!!!!!!not match");
	}
	}
