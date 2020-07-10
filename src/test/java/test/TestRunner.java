package test;

import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.TestNGCucumberRunner;
//import io.cucumber.testng.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature_files",
glue= {"stepdefinitions"}, tags= {"@tsgT","@Test"},
format=
{"pretty",
"html:target/cucumber-reports/cucumber-pretty",
"json:target/cucumber-reports/CucumberTestReport.json"}
)
public class TestRunner {
	 private TestNGCucumberRunner testNGCucumberRunner;
	protected static WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	 
	 @BeforeSuite()
	 public void openBrowser() {
		 System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.get("https:\\www.calculator.net");
	 }
	 
	 
	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
			report = new ExtentReports(System.getProperty("user.dir") + "/reports/Extentreport.html");
			test = report.startTest("SDET Batch");
	    }
	 
	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	 
	    @DataProvider
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }
	 
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
			report.endTest(test);
			report.flush();
	        testNGCucumberRunner.finish();
	    }
	    
	    public static String takeScreenShot(WebDriver driver, String screenhotName) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "/reports/test" + screenhotName +".png" ;
			File destiantionFile = new File(destination);
			org.apache.commons.io.FileUtils.copyFile(source, destiantionFile);
			return destination;
		}
		
		@AfterMethod
		public void getScrenResult(ITestResult result) throws IOException {
			if(result.getStatus()==ITestResult.FAILURE) {
				String screenShotPath = takeScreenShot(driver,result.getName());
				test.log(LogStatus.FAIL, "Testcase is failed for " + result.getName() + result.getThrowable() + test.addScreenCapture(screenShotPath));
			}
			
		}
}
