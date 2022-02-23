package TestNGActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");

	}

	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title,"Target Practice");

	}

	@Test
	public void findButton() {
	WebElement blackButton=driver.findElement(By.xpath("//button[contains(@class,'black')]"));
	Assert.assertTrue(blackButton.isDisplayed());
	Assert.assertEquals(blackButton.getText(), "Black");
	}
	
	@Test(enabled=false)
	public void skipTest1() {
		 String subHeading = driver.findElement(By.className("sub")).getText();
	        Assert.assertTrue(subHeading.contains("Practice"));
	}
	
	@Test
	public void skipTest2() {
		throw new SkipException("Skipping test case");    
	}
	

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
