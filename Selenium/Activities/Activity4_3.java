package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.training-support.net/selenium/target-practice");
	     String title=driver.getTitle();
	     System.out.println("Page Title is: "+title);
	    String thirdHeader= driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
	    System.out.println("Third header's text is: "+thirdHeader);
	    
	  String fifthHeader=driver.findElement(By.xpath("//h5")).getCssValue("color");
	  System.out.println("Fifth header's color is: "+fifthHeader);
	  
	  String violetButton=driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
	  System.out.println("Violet button's classes are: "+violetButton);
	  
	  String greyButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
     System.out.println("Grey button's text is: "+greyButton);
     
     driver.close();
}
}