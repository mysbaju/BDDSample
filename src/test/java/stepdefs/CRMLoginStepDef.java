package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CRMLoginStepDef {
	
	WebDriver driver;

	
		@Given("User is already on login page")
		public void user_is_already_on_login_page() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://ui.cogmento.com/"); //Add the URL
		    
		}

//		@When("User enters login credentials")
//		public void user_enters_login_credentials() {
//		    // Write code here that turns the phrase above into concrete actions
//			driver.findElement(By.name("email")).sendKeys("mysorebalaji@gmail.com");
//		    driver.findElement(By.name("password")).sendKeys("Helpme.88");
//		    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//		}
		

//		@When("User enters login credentials")
//		public void user_enters_login_credentials(DataTable userCred) {
//		    
//			java.util.List<String> data = userCred.asList();
//			driver.findElement(By.name("email")).sendKeys(data.get(0));
//		    driver.findElement(By.name("password")).sendKeys(data.get(1));
//		    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//		}

		@When("User enters login credentials")
		public void user_enters_login_credentials(DataTable userCred) {
		    
			List<Map<String,String>> data = userCred.asMaps();
			driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
		    driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
		    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		}
		
		@When("User enters {string} and {string}")
			public void user_enters_and(String strUser, String strPwd) {
				driver.findElement(By.name("email")).sendKeys(strUser);
			    driver.findElement(By.name("password")).sendKeys(strPwd);
			    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			}



		@Then("User is on Home Page")
		public void user_is_on_home_page() {
		    // Write code here that turns the phrase above into concrete actions
			boolean isValid = driver.findElement(By.className("user-display")).isDisplayed();
			Assert.assertTrue(isValid);
		    
		}
		@Then("Close browser")
		public void close_browser() {
		    // Write code here that turns the phrase above into concrete actions
			
			driver.close();
			driver.quit();
		    
		}



}
