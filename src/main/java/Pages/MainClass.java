package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainClass {

	public static WebDriver driver;
	public Select select;
	public Actions action;
	
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
	
	
	public String getattributesrc(WebElement element) {
		return element.getAttribute("src").toString();
	}
}
	
	