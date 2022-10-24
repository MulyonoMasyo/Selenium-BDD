package BelajarCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {


	WebDriver driver=null;

	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","D:/QualityAssurance/Project Selenium/SeleniumProject/driver/chromedriver.exe");
		driver = new ChromeDriver();
	
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com");

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Automation Step by step");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navaigate to search result")
	public void user_is_navaigate_to_search_result() {
		driver.getPageSource().contains("Online Courses");

	}

	


}
