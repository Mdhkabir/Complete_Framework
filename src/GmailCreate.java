import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailCreate extends BaseTest{
	


	@Test
	public void loginCreate() throws InterruptedException{
		
		

		WebElement SignInButton = driver.findElement(By.xpath("//*[@id='gb_70']"));
		SignInButton.click();
		Thread.sleep(2000);
		
		WebElement pageTitle = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1"));
		System.out.println(pageTitle.getText());
		String title = pageTitle.getText();
		Assert.assertEquals("One account. All of Google.", title);
		
		//user click on create account link

		WebElement createAccount = driver.findElement(By.xpath(".//*[@id='link-signup']/a"));
		createAccount.click();
		Thread.sleep(2000);
	

	}

}
