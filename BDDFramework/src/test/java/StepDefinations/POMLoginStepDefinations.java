/*package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMLoginStepDefinations {
	
	WebDriver driver;
	LoginPage login;
	
	@Given("User is on login page")
	
	public void user_is_on_login_page()
	{
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.saucedemo.com/");
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) 
	{
	   login = new LoginPage(driver);
	   login.enterUsername(username);
	   login.enterPassword(password);
		
	}

	@And("clicks on Login Button")
	public void clicks_on_login_button() 
	{
	   
		login.clickLogin();	
	}
	@Then("User should be navigated to the Home page")
	public void user_should_be_navigated_to_the_home_page() {
	  
		login.isLoggedIn();
		//Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0, "User is on Homepage");
	}

	@And("Close the browser")
	public void close_the_browser() {
	   driver.close();
	}
}*/
