package HRMSeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  driver = new FirefoxDriver();
			driver.get("http://alchemy.hguy.co/orangehrm");
	  }

	  @Test
	  public void getEmergencycontacts() throws InterruptedException {
		  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//ul[@id='sidenav']//a[text()='Emergency Contacts']")).click();
	List<WebElement> emergencyList =driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr/td"));
	  for(WebElement we:emergencyList)
	  {
		  System.out.println(we.getText());
	  }
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
	  

}
