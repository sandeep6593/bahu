package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
				glue={"stepDef"},
				plugin={"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
						"usage:target/cucumber-usage.json","junit:target/cucmber-results.xml"})
public class TestRunner {

}
