package automationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		WebElement userName=driver.findElement(By.xpath("//input[starts-with(@class,'username')]"));
		WebElement password=driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));

		userName.sendKeys("admin");
		password.sendKeys("password");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String loginMsg=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("Login Message: "+loginMsg);
		
		
     
	}

}
