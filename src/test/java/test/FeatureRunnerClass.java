package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:/target/CumcumberReport.html"})
public class FeatureRunnerClass {
	//	just run this class as j-unit to run all the feature files together and also to generate
	//  the cucumber report in html saved in the target folder.
}
