package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookTest {
	
	@Before
	public void start() {
		System.out.println("Before Hook is invoked");
	}
	
	@After
	public void end() {
		System.out.println("After hook is onoked");
	}

}
