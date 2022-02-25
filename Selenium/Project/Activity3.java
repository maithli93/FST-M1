package HRMSeleniumProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
 
	WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  driver=new FirefoxDriver();
		  driver.get("http://alchemy.hguy.co/orangehrm");
	  }
  
  @Test
  public void loginTest() {
	 driver.findElement(By.id("txtUsername")).sendKeys("orange");
	 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	 
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
