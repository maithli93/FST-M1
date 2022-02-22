package automationFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/selenium/tables");
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'celled')]/tbody/tr[1]/td"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'celled')]/tbody/tr"));

		System.out.println("Number of columns: " + cols.size());
		System.out.println("Number of columns: " + rows.size());

		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class,'celled')]/tbody/tr[3]/td"));
		for (WebElement we : thirdRow) {
			System.out.println("Third row's column value: " + we.getText());

		}

		WebElement secColumsValue = driver
				.findElement(By.xpath("//table[contains(@class,'celled')]/tbody/tr[2]/td[2]"));
		System.out.println("Second row's second column value: " + secColumsValue.getText());
		
		driver.close();

	}

}
