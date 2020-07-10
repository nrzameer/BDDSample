package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.TestRunner;

//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class TestcaseStepDefinition extends TestRunner{

	Drivernstcac d;
//WebDriver driver;
		@Given("I want to write a step with precondition")
		public void i_want_to_write_a_step_with_precondition() throws IOException {
		//	d = new Drivernstcac();
		//	d.openV();
			System.out.println("First case");
			System.out.println("Get isntnace title " + driver.getTitle());
			driver.findElement(By.partialLinkText("DFDF")).click();
//			driver = new  ChromeDriver();
//			driver.get("https://www.calculator.net/");
		}



		@Given("some other precondition \"(.*)\"")
		public void some_other_precondition(String data) {
			System.out.println("data is " + data);
		}
		@When("I complete action")
		public void i_complete_action(DataTable table) {
		// System.out.println(driver.getCurrentUrl());
			for (Map<String, String> data : table.asMaps(String.class, String.class)) {
System.out.println("Data 1 is " + data.get("FirstName"));
System.out.println("Data 2 is " + data.get("LastName"));
				}

		}
		@When("some other action \"(.*)\" and \"(.*)\"")
		public void some_other_action(String data1, String data2) {
			System.out.println("Exavple 1 " + data1);
			System.out.println("Exavple 2 " + data2);
		//driver.findElement(By.partialLinkText("BMI")).click();
		}
//		@When("yet another action")
//		public void yet_another_action(DataTable tab) {
//		    // Write code here that turns the phrase above into concrete actions
//		/*	List<String> data = tab.asList(); 
//			System.out.println("First vaue is "+ data.get(0));
//			System.out.println("Second vaue is "+ data.get(1));
//			System.out.println("First vaue is "+ data.get(2));
//			System.out.println("Second vaue is "+ data.get(3)); */
//			
//			List<Map<String, String>> val = tab.asMaps(null, null);
//			for(Map<String, String> v : val) {
//				//driver.findElement(By.name("cage")).clear();
//				driver.findElement(By.name("cage")).sendKeys(v.get("FirstName"));
//				//driver.findElement(By.name("ckg")).clear();
//				driver.findElement(By.name("ckg")).sendKeys(v.get("LastName"));
//				System.out.println(v.get("FirstName"));
//				System.out.println(v.get("LastName"));
//			}
//			
//			
//		}
//		@Then("I validate the outcomes {} and {}")
//		public void i_validate_the_outcomes(String test1, String test2) {
//			//driver.findElement(By.name("cage")).clear();
//			driver.findElement(By.name("cage")).sendKeys(test1);
//			//driver.findElement(By.name("ckg")).clear();
//			driver.findElement(By.name("ckg")).sendKeys(test2);
//System.out.println("Values are " + test1  + test2);
//		}
//		@Then("check more outcomes {}")
//		public void check_more_outcomes(String testdata) {
//			System.out.println("Data is " + testdata);
//		    // Write code here that turns the phrase above into concrete actions
//		}




}
