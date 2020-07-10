package stepdefinitions;

import cucumber.api.java.en.Given;

public class XtcStepdefinition extends Drivernstcac{

	@Given("I get driver instance")
	public void tes() {
		System.out.println("Anotehr class " + driver.getTitle());
	}
}
