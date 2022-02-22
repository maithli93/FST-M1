package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.training-support.net");
    String title=driver.getTitle();
    System.out.println("Title of Page: "+title);
    //find About Us by id
    WebElement id=driver.findElement(By.id("about-link"));
    System.out.println("Text in Element: "+id.getText());
    //className
//    WebElement className=driver.findElement(By.className("green"));
//    System.out.println("Text in Element: "+className.getText());
//    //link Text
//    WebElement linkText=driver.findElement(By.linkText("About Us"));
//    System.out.println("Text in Element: "+linkText.getText());
//    //cssSelector
//    WebElement cssSelector=driver.findElement(By.cssSelector(".green"));
//    System.out.println("Text in Element: "+cssSelector.getText());
    
    driver.close();
	}

}
