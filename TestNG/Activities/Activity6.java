package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
  WebDriver driver;
  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }

  @Test
  @Parameters({ "Username", "Password" })
  public void loginTest(String Username,String Password) {
	  WebElement username=driver.findElement(By.id("username"));
	  WebElement password=driver.findElement(By.id("password"));
	  
	  username.sendKeys(Username);
	  password.sendKeys(Password);
	  driver.findElement(By.xpath("//button[@class='ui button']")).click();
	  
	  String loginMsg = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals(loginMsg, "Welcome Back, admin");
  }
  
  
  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.close();
  }

}
