package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver;

	@Given("^User is on Google Home Page$")
	public void userIsOnGooglePage() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}

	@When("^User types in Cheese and hits ENTER$")
	public void userTypesInCheeseAndHitsENTER() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
	}

	@Then("^Show how many search results were shown$")
	public void showHowManySearchResultsWereShown() throws Throwable {
		String resultStats = driver.findElement(By.id("result-stats")).getText();
		System.out.println("Number of results found: " + resultStats);
	}

	@And("^Close the browser$")
	public void closeTheBrowser() throws Throwable {
		driver.quit();
	}
}
