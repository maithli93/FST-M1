package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.training-support.net");
	     String title=driver.getTitle();
	     System.out.println("Page Title is: "+title);
	     driver.findElement(By.xpath("//*[@id='about-link']")).click();
	     System.out.println("Title of current page: "+driver.getTitle());
	     driver.close();
	}

}
