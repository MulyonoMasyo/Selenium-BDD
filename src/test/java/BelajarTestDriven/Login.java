package BelajarTestDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class Login {
//	
//	WebDriver driver=null;
//	
//	@Given("browser open")
//	public void broser_open() {
//		System.setProperty("webdriver.chrome.driver","D:/QualityAssurance/Project Selenium/SeleniumProject/driver/chromedriver.exe");
//		driver = new ChromeDriver();
//	   
//	}
//	
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_and(String username, String password) {
//	
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	
//	}
//
//	@And("user click on login")
//	public void user_click_on_login() {
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//	  
//	}
//
//}
