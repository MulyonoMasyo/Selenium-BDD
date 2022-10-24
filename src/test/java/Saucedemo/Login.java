package Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String saucedemo="https://www.saucedemo.com/";
		
		driver.navigate().to(saucedemo);
		
		WebElement username=driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		WebElement ButtonLogin=driver.findElement(By.name("login-button"));
		ButtonLogin.click();
		
		
		
	}

}
