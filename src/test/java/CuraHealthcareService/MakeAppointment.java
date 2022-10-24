package CuraHealthcareService;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeAppointment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://katalon-demo-cura.herokuapp.com/";
		driver.navigate().to(URL);
		WebElement BtnMakeAppointment=driver.findElement(By.id("btn-make-appointment"));
		BtnMakeAppointment.click();
		
		WebElement username=driver.findElement(By.id("txt-username"));
		username.sendKeys("John Doe");
		WebElement password=driver.findElement(By.id("txt-password"));
		password.sendKeys("ThisIsNotAPassword");
		WebElement BtnLogin=driver.findElement(By.id("btn-login"));
		BtnLogin.click();
		
		Select facility = new Select(driver.findElement(By.id("combo_facility")));
		facility.selectByVisibleText("Hongkong CURA Healthcare Center");
		
		WebElement CheckApplyForHospital=driver.findElement(By.id("chk_hospotal_readmission"));
		CheckApplyForHospital.click();
		
		WebElement RadioMedicaid=driver.findElement(By.id("radio_program_medicaid"));
		RadioMedicaid.click();
		
		WebElement VisitDate=driver.findElement(By.id("txt_visit_date"));
		VisitDate.sendKeys("08/09/3000");
		
		WebElement BtnBookAppointment=driver.findElement(By.id("btn-book-appointment"));
		BtnBookAppointment.click();
		
		
		
		
		
		
	}

}
