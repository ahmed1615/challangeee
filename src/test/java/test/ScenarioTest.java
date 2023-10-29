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

public class ScenarioTest extends TestBase{

	public String ErrorMS= "Invalid CAPTCHA";
	HomePage hp;
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
		HomePage hp = new HomePage(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4270)");
		/* this is also for get the scr value and navigate to it
		String SoucreURL = hp.getSourceURL();
		System.out.println(SoucreURL);
		driver.navigate().to(SoucreURL);
			*/
		driver.switchTo().frame(0);
		hp.fillname("Mariana");
		hp.filllastname("Vasquez");
		hp.fillcompanyName("claro");
		hp.fillemail("mariana.vasquez@claro.com");
		hp.fillnumber("+52156411584");
		hp.fillinterstingin("MPLS");
		jse.executeScript("window.scrollBy(0,400)");
		hp.clickonsubmitB();
		jse.executeScript("window.scrollBy(0,400)");
		 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		 wait.until(ExpectedConditions.visibilityOf(hp.error));
		assertEquals(hp.error.isDisplayed(), true);
		assertEquals(hp.error.getText().toString(), ErrorMS);

	}

	}
