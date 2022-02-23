package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
 WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }

  @Test
  public void loginTest(){
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("password");
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
	  String loginMsg = driver.findElement(By.xpath("//div[contains(text(),' admin')]")).getText();
	  System.out.println("Login msg: "+loginMsg);
	  Assert.assertEquals("Welcome Back, admin",loginMsg);
  }
 
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
