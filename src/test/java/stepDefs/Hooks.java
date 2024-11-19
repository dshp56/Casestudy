package stepDefs;

import Base.testBase;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public static void setupDriver() {
		testBase.initDriver();
	}
}
