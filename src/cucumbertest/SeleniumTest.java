package cucumbertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	private static WebDriver driver = null;
	public static void main(String[] args) {
		// Open the Browser
		 
        driver = new FirefoxDriver();
 
        //Set Implicit wait
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Enter the URL
 
        driver.get("http://localhost/login.do");
 
        // Find the element (UserName) and send the values
 
        driver.findElement(By.id("username")).sendKeys("admin"); 
 
        // Find the element (Password) and send the values
 
        driver.findElement(By.name("pwd")).sendKeys("manager");
 
        // click on Login button
 
        driver.findElement(By.xpath("//div[.='Login ']")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("Login Successfully");
 
        // click on logout
 
        driver.findElement (By.id("logoutLink")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("LogOut Successfully");
 
        // Close the driver
 
        driver.quit();
 
	}
 




}
