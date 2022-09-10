package test;
import static org.testng.Assert.assertNotSame;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.AddUserForm;
import Pages.TablePage;

public class DeletUser extends TestBase{
	
	TablePage table;
	AddUserForm addData;
	
	@Test (priority = 1, alwaysRun = true)
	public void delete() {
		table =new TablePage(driver);
		int nuberofrows=table.Rows.size();
		System.out.println("this is number of rows "+nuberofrows);
		for(int i=0;i<nuberofrows;i++) {
			  try {
			List<WebElement>cols=table.Rows.get(i).findElements(By.tagName("td"));
			for(int j=1;j<cols.size();j++) {
				String value=driver.findElement(By.xpath("//tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				System.out.println("the value is"+value);
				if (value.equals("novak")){
					WebElement delete =driver.findElement(By.xpath("//tbody/tr["+(i+1)+"]/td[11]/button"));
					delete.click();
					break;
				}
				} 
			  }
			  catch (Exception e) {
		}
			  
		}
		table.clickonOkButton();
		}
	
	@Test(dependsOnMethods = "delete")
	public void validatedelteuser() {
		table =new TablePage(driver);
		int nuberofrows=table.Rows.size();
		System.out.println("befoe "+ nuberofrows);
		for(int i=0;i<nuberofrows;i++) {
			String valueofTheardcoulm = driver.findElement(By.xpath("//tbody/tr["+(i+1)+"]/td[3]")).getText();
			assertNotSame(valueofTheardcoulm, "novak");	
		}
	}
	
}