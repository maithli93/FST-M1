package automationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/selenium/ajax");
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		
		driver.findElement(By.xpath("//button[contains(text(),'Content')]")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1[contains(text(),'HELLO!')]"), "HELLO!"));
		
		String text=driver.findElement(By.id("ajax-content")).getText();
		System.out.println(text);
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		String lateText=driver.findElement(By.id("ajax-content")).getText();
		System.out.println(lateText);
		
		driver.close();

	}

}
