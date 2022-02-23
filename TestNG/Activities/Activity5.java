package TestNGActivities;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
 WebDriver driver;
 
 @BeforeTest(alwaysRun = true)
  public void beforeTest() {
	 driver=new FirefoxDriver();
	 driver.get("https://www.training-support.net/selenium/target-practice");
  }

  @Test (groups = {"HeaderTests", "ButtonTests"})
  public void pageTitleTest() {
	String title = driver.getTitle();
	Assert.assertEquals(title, "Target Practice");
  }
  
  @Test (groups = {"HeaderTests", "ButtonTests"})
  public void headerTest1() {
	 String header3 =driver.findElement(By.id("third-header")).getText();
	Assert.assertEquals(header3, "Third header");
  }
  
  @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
  public void headerTest2() {
	  WebElement header5 = driver.findElement(By.cssSelector("h5.ui.green.header"));
	 Assert.assertEquals(header5.getCssValue("color"),"rgb(33, 186, 69)");
  }
  
  @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
  public void buttonTest1() {
	WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
	Assert.assertEquals(button1.getText(), "Olive");
  }
  
  @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
  public void buttonTest2()
  {
	  WebElement button2= driver.findElement(By.cssSelector("button.brown"));
	  Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
  }
  
  @AfterTest(alwaysRun = true)
  public void afterTest() {
	  driver.close();
  }

}
