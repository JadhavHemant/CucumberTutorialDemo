package RunnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/Features",
		glue="Step",
		dryRun=false,
		monochrome=true,
		plugin= {
				"json:Reports/abc.json",
				"junit:Reports/abc.xml",
				"html:Reports/abc.html",
				"pretty:Reports/abc/txt"
		},
		tags="@Guru99Application"
		)
		


public class TestRunner {

}
