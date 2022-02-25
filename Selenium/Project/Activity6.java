package HRMSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
	}

	@Test
	public void getDirectoryItems() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement directoryTab = driver.findElement(By.id("menu_directory_viewDirectory"));
		directoryTab.isDisplayed();
		Thread.sleep(2000);
		directoryTab.click();
		String headerText=driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
		Assert.assertEquals(headerText, "Search Directory");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
