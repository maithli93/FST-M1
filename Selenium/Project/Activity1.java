package HRMSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
 WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/orangehrm");
  }

  @Test
  public void verifyTitle() {
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "OrangeHRM");
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
