import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver driver;

		@BeforeTest
		public void beforeTest(){
	
		String baseDIRPath = System.getProperty("user.dir");
		String FirefoxServerPath = baseDIRPath + "\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driverr", FirefoxServerPath);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");


		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		driver.manage().window().maximize();
		}
		
		@AfterTest
		public void afterTest(){
			
			driver.quit();
		}
		
		

	

}
