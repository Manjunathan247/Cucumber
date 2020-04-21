package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	private static WebDriver driver=null;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
	}

	@When("^User enters Username$")
	public void user_enters_Username() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("admin");
	}

	@When("^User enters Password$")
	public void user_enters_Password() throws Throwable {
		 driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("^user click on login$")
	public void user_click_on_login() throws Throwable {
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@Then("^User should see \"([^\"]*)\"$")
	public void user_should_see(String arg1) throws Throwable {
		  System.out.println("Login Successfully");
	}
	
	@When("^User Logout from the Application$")
	public void user_Logout_from_the_Application() throws Throwable {
		driver.findElement (By.id("logoutLink")).click();
	}

	@Then("^message dispalyed Logout succesfully$")
	public void message_dispalyed_Logout_succesfully() throws Throwable {
		 System.out.println("LogOut Successfully");
	}


}
