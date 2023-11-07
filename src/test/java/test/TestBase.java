package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	public static String user=System.getProperty("user.dir");
	public String applink="https://www.netflix.com/";
	
	 
	@BeforeSuite
	public void StartDriver() {	
		System.setProperty("webdriver.chrome.driver",user+"/drivers/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt); 
		driver.get(applink);
		driver.manage().window().maximize();
		String title =driver.getTitle();
		String URL =driver.getCurrentUrl().toString();
		System.out.println("the title is "+ ">>>>>>> "+ title);
		System.out.println("the URL is "+ ">>>>>>> "+ URL);
	}
	
	@AfterSuite
	public void CloseTab() throws Exception {
		driver.quit();
	}
}
