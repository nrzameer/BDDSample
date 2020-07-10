package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import wrapper.CommonClass;

public class Drivernstcac {

	protected static WebDriver driver;
	public void openV() throws IOException {
		driver = new  ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.partialLinkText("BMI")).click();
		driver.findElement(By.name("cage")).sendKeys(CommonClass.getDataFromExcel(1, 1));
	}
	
}
