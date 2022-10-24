package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//driver.get("https://google.com");
		
		String udemy="https://www.udemy.com/";
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://code2care.org/pages/enable-eclipse-dark-mode");
		Thread.sleep(2000);
		
		String originalWindow=driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(udemy);
		Thread.sleep(5000);
		
		//driver.close();
		
	}
}
