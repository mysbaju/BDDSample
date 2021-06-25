package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/googleSearch.feature",
		glue = "stepdefs",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
//				"html:target/reports/report.html",
//				"usage:target/reports/usagereport",
//				"json:target/reports/jsonreport.json",
//				"junit:taget/reports/junitreport.xml",
//				"rerun:target/failed_scenarios.txt",
//				"com.aventstrack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)
public class GooglePageRunner {

}
