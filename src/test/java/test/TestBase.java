package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	public static WebDriver driver;
	public static String user=System.getProperty("user.dir");
	public String applink="https://www.usclaro.com/";
	
	 
	@BeforeSuite
	public void StartDriver() {	
		System.setProperty("webdriver.chrome.driver",user+"/drivers/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt); 
		driver.get(applink);
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void CloseTab() throws Exception {
		//driver.quit();
	}
	
}
