package test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import Pages.AddUserForm;
import Pages.TablePage;
import uti.GenrateData;

public class AddUserTest extends TestBase {

	TablePage table;
	AddUserForm addData;
	int before;
	int after;
	
	
	
	@Test(priority = 1, alwaysRun = true)
	public  void stepOneCreatingUser() {
		table= new TablePage(driver);
		String actualT=driver.getTitle();
		assertEquals(actualT, "Protractor practice website - WebTables");
		before=table.numsofcolumn();
		System.out.println(before);
		table.clickOnAddUser();
		}
		
	
	@Test(dependsOnMethods = "stepOneCreatingUser" )
	public void fillform() {
		table =new TablePage(driver);
		addData =new AddUserForm(driver);
		addData.setUserData(GenrateData.genrate(), GenrateData.genrate(), GenrateData.genrate(), GenrateData.genrate());
		addData.company("AAA");
		addData.setRule("Customer");
		addData.setEmail(GenrateData.genrate()+"@test.com");
		addData.setCellPhone(GenrateData.genrtaephone());
		addData.clickonSave();
		after=table.numsofcolumn();
		System.out.println(after);
	 
		
	}
	@Test(dependsOnMethods = "fillform")
	public void assert_change() {
		assertEquals(after-1, before);
	}
	
	
	
	}




	
