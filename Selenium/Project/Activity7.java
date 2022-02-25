package HRMSeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
 WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
  }

  @Test
  public void addQualification() throws InterruptedException {
	  driver.findElement(By.id("txtUsername")).sendKeys("orange");
	  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//ul[@id='sidenav']//a[text()='Qualifications']")).click();
	  driver.findElement(By.id("addWorkExperience")).click();
	  driver.findElement(By.id("experience_employer")).sendKeys("IBM");
	  driver.findElement(By.id("experience_jobtitle")).sendKeys("Software Tester");
	  driver.findElement(By.id("btnWorkExpSave")).click();
	  
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  

}
