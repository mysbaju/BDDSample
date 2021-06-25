package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GooglePageStepDef {

	WebDriver driver;
	
@Given("I launch google page")
public void i_launch_google_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Setting up browser");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://google.com");
	Assert.assertEquals("Google", driver.getTitle());
    
}

@When("I search Java Tutorial")
public void i_search_java_tutorial() {
    // Write code here that turns the phrase above into concrete actions
	WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("Java Tutorial");
	searchBox.submit();
    
}
@Then("Should display Java result page")
public void should_display_java_result_page() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals("Java Tutorial - Google Search", driver.getTitle());
 
}
@Then("Close the browser")
public void close_the_browser() {
    // Write code here that turns the phrase above into concrete actions
	driver.close();
	driver.quit();
    
}



	
}
