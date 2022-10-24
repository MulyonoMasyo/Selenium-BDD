package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String seleniumFrame= "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
		
		
		driver.navigate().to(seleniumFrame);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Alert")).click();
		
	}

}
