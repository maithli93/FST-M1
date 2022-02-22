package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new FirefoxDriver();
	     driver.get("https://training-support.net/selenium/simple-form");
	     String title=driver.getTitle();
	     System.out.println("Page Title is: "+title);
	     
	     WebElement firstName=driver.findElement(By.id("firstName"));
	     firstName.sendKeys("merry");
	     WebElement lastName=driver.findElement(By.id("lastName"));
	     lastName.sendKeys("kenlley");
	     
	     WebElement email=driver.findElement(By.id("email"));
         email.sendKeys("abc@example.com");
	     WebElement contactNumber=driver.findElement(By.id("number"));
	     contactNumber.sendKeys("1234658921");
	
	     driver.findElement(By.cssSelector(".ui.green.button")).click();
	     
	   
	     //driver.close();

	     

	     
	}

}
