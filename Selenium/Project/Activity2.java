package HRMSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/orangehrm");
  }

  @Test
  public void getHeaderUrl() {
		WebElement headerUrl=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		System.out.println("Header Url :" + headerUrl.getAttribute("src"));
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
