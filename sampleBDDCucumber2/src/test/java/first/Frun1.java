package first;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Frun1 {

	
	@CucumberOptions(features="Cucumber\\First.feature",glue="Scenariofirst")
	public class Run1 extends AbstractTestNGCucumberTests {

		
	}
}
