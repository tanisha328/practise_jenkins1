package com.cucumber_17_dec_pack1;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"step_definition"}
		)
public class TestRunner {

}
