package Pages;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TablePage extends MainClass {

	public TablePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@class='btn btn-link pull-right']")
	WebElement AddUser;
	
	@FindBy(xpath = "//tr[@class='smart-table-data-row ng-scope']/td[1]")
	 public List<WebElement> firstColumn;
	
	@FindBy(xpath = "//tr[@class='smart-table-data-row ng-scope']")
	public List<WebElement> Rows;
	
	@FindBy(xpath = "//tr[@class='smart-table-data-row ng-scope']/td")
	 public List<WebElement> columns;
	
	@FindBy(xpath = "//button[@class='btn ng-scope ng-binding btn-primary']")
	WebElement confirmButton;
	

	
	public void clickOnAddUser() {
		clickOnButton(AddUser);
	}
	
	public int numsofcolumn() {
		int nusofcoulmn=firstColumn.size();
		return nusofcoulmn;
		
	}
	public void clickonOkButton() {
		clickOnButton(confirmButton);
	}
	
}

