package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePageFactory;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageFactorySteps {

	static WebDriver driver;
	LoginPageFactory Login;
	HomePageFactory home;

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
		Login= new LoginPageFactory(driver);
		Login.enterUsername(username);
		Login.enterPassword(password);
		
	}

	@And("clicks on Login Button")
	public void clicks_on_login_button() 
	{
		Login.clickLogin();
	}

	@Then("User should be navigated to the Home page")
	public void user_should_be_navigated_to_the_home_page() {
	  
		home = new HomePageFactory(driver);
		home.IsCartDisplay();
	}

	@And("Close the browser")
	public void close_the_browser() {
	   driver.close();
	}


}
