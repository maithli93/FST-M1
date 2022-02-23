package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
  
  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get(" https://www.training-support.net/selenium/login-form");
  }
  
  @DataProvider(name = "Authentication")
  public static Object[][] credentials() {
      return new Object[][] { { "admin", "password" }};
  }
  

  
  @Test (dataProvider = "Authentication")
  public void loginTestCase(String Username, String Password) {
      WebElement usernameField = driver.findElement(By.id("username"));
      WebElement passwordField = driver.findElement(By.id("password"));
      
      usernameField.sendKeys(Username);
      passwordField.sendKeys(Password);
      
      driver.findElement(By.xpath("//button[@class='ui button']")).click();
      
      String loginMsg = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals(loginMsg, "Welcome Back, admin");
  }
  
  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.quit();
  }

}
