package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class MainClass {

	protected WebDriver driver;
	public Select select;
	
	public MainClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	protected WebDriver getDriver() {
        return driver;
    }
 

	public static void clickOnButton(WebElement element) {
		element.click();
	}
	
	public static void selectvalue(WebElement element, String Value) {
	Select select=new Select(element);
	select.selectByVisibleText(Value);
	
	}
	
	public static void filladdvalue(WebElement element, String value) {
		if(element!=null) {
			element.click();
			element.sendKeys(value);
		} 
	}
		}