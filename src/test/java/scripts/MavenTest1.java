package scripts;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MavenTest1 {
	
	WebDriver driver;
	
	
	@DataProvider(name="test dataprovider")
	public Object[][] data(){
		
		return null;
		
		
	}
	
	@DataProvider(name="dataprovider")
	public Object[][] data1(){
		
		return null;
		
		
	}

	@Test(priority=1,groups="Regress",dataProvider = "test dataprovider")
	public void Method2(String username,String password,String dummy) throws InterruptedException {
		
		
		
		driver.get("https://www.facebook.com/");  //ctrl+shift+o
		
		driver.navigate().to("url");
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("")).sendKeys(username);
		
		driver.get("");
		
		
}
	@Test(dataProvider = "dataprovider")
	public void Test2() throws InterruptedException {
		
		
		
		driver.get("https://www.facebook.com/");  //ctrl+shift+o
		
		driver.navigate().to("url");
		driver.navigate().refresh();
		
		driver.get("");
		
		
}
	
	@Test()
	public void login() throws InterruptedException {
		
		
		
		driver.get("https://www.facebook.com/");  //ctrl+shift+o
		
		driver.navigate().to("url");
		driver.navigate().refresh();
		
		driver.get("");
		
		
}
	
	
	
	 //Annotations
	
//	@Test
//	@BeforeTest
//	@AfterTest
//	@BeforeSuite
//	@AfterSuite
//	@BeforeClass
//	@AfterClass
//  @BeforeMethod
//	@AfterMethod
	
//	@Beforesuite
//	@BeforeTest
//	@BeforeClass
//	@BeforeMethod
//	@Test
//	@AfterMethod
//	@AfterClass
//	@AfterTest
//	@AfterSuite
	
	
	
	
	
	@BeforeSuite
	public void openBrowser() {
		
       System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	}
	
	
	@AfterSuite
	public void closeBrowser() {
		

		 driver.quit();
	}
	
}
