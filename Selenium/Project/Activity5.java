package HRMSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");

	}

	@Test
	public void editUserInfoTest() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		WebElement firstName = driver.findElement(By.xpath("//input[contains(@name,'txtEmpFirstName')]"));
		firstName.clear();
		firstName.sendKeys("John");
		WebElement lastName = driver.findElement(By.xpath("//input[contains(@name,'txtEmpLastName')]"));
		lastName.clear();
		lastName.sendKeys("Doe");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		Thread.sleep(10000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
		if(dropdown.isEnabled()) {
			System.out.println("Dropdown is enabled");
			Select select = new Select(dropdown);
			select.selectByVisibleText("German");
		}
		driver.findElement(By.xpath("//input[@id='personal_DOB']//following-sibling::img")).click();
		WebElement month = driver.findElement(By.xpath("//div/select[@class='ui-datepicker-month']"));
		Select selectedMonth = new Select(month);
		selectedMonth.selectByVisibleText("Jan");

		WebElement year = driver.findElement(By.xpath("//div/select[@class='ui-datepicker-year']"));
		Select selectedYear = new Select(year);
		selectedYear.selectByVisibleText("1993");
		driver.findElement(By.linkText("21"));
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
