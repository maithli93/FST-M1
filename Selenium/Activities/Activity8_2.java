package automationFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/selenium/tables");
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));

		System.out.println("Number of columns: " + cols.size());
		System.out.println("Number of columns: " + rows.size());
		
		WebElement secColumsValue = driver
				.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Second row value before: " + secColumsValue.getText());	

	WebElement columnHeader_1 = driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]"));
	columnHeader_1.click();
	WebElement secColumsValueAfter = driver
			.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
	System.out.println("Second row value after: " + secColumsValueAfter.getText());
	
	List<WebElement> footerValues = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
	for (WebElement we : footerValues) {
		System.out.println("Footer value is: " + we.getText());

	}


	}
}
