package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Barani\\eclipse-workspace\\FreeCRMBDDFrameworkNew\\src\\main\\java\\Features\\login.feature",
				glue={"helpers","stepDefinitions"}
		//glue={"classpath:/C:\\Users\\Barani\\eclipse-workspace\\FreeCRMBDDFrameworkNew\\src\\main\\java\\stepDefinitions"}
		//format= {"pretty","html:test-outout"}
		)

public class TestRunner {

}
