package TestNGActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	   driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net");
  }
  
  @Test
  public void verifyTitle() {
	  String title=driver.getTitle();
	  Assert.assertEquals("Training Support",title);
	  driver.findElement(By.id("about-link")).click();
	 String newTitle=driver.getTitle();
	 System.out.println("Title of Page: "+newTitle);
	  Assert.assertEquals("About Training Support",newTitle);
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
