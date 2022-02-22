package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.training-support.net/selenium/simple-form");
	     String title=driver.getTitle();
	     System.out.println("Page Title is: "+title);
	     driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abc");
	     driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("xyz");
	     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@example.com");
	     driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234567890");
	     driver.findElement(By.xpath("//textarea")).sendKeys("Entered all the details");
	     driver.findElement(By.xpath("//input[contains(@class,'green')]")).click();

	     
	     


	}

}
