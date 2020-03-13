package testRunners;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "resources", glue = "stepDefinitions")

public class TestRunnerSupportAndFaqPage {

}
