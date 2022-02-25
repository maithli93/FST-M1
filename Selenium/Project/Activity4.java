package HRMSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  driver=new FirefoxDriver();
		  driver.get("http://alchemy.hguy.co/orangehrm");
	  }

@Test
public void addEmployeeTest() throws InterruptedException {
	 driver.findElement(By.id("txtUsername")).sendKeys("orange");
	 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	 
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[contains(@id,'wPimModule')]/b")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("btnAdd")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("firstName")).sendKeys("john");
	 driver.findElement(By.id("lastName")).sendKeys("william");
	 driver.findElement(By.xpath("//input[@value='Save']")).click();
	 
	 driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	WebElement emp= driver.findElement(By.xpath("//input[contains(@name,'empName')]"));
    emp.sendKeys("john");
    driver.findElement(By.id("searchBtn")).click();
}

@AfterClass
public void afterClass() {
	  driver.quit();
}

}
