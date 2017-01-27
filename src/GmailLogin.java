import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GmailLogin extends BaseTest{
	
	
	@Test
	
	public void login() throws InterruptedException{

	

		
		WebElement SignInButton = driver.findElement(By.xpath("//*[@id='gb_70']"));
		SignInButton.click();
		Thread.sleep(2000);
		
		WebElement pageTitle = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1"));
		System.out.println(pageTitle.getText());
		String title = pageTitle.getText();
		Assert.assertEquals("One account. All of Google.", title);
		

		driver.findElement(By.xpath("//*[@id='Email']")).clear();
		
		
		//user typed username
		WebElement UserName = driver.findElement(By.xpath("//*[@id='Email']"));
		UserName.sendKeys("remoteituniversity");
		Thread.sleep(2000);
		
		//user click on next button
		WebElement NextButton = driver.findElement(By.xpath("//*[@id='next']"));
		NextButton.click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void logOut(){
		System.out.println("system log out");
		
	}
	
		
		
		
		
		
		
		
		
		


}
