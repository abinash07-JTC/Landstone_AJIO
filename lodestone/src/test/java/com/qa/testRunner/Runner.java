package com.qa.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/com/qa/feature/ajio.feature"},
		
		glue =   {"com.qa.stepDefinations"},
		plugin = {"pretty"}, 
		dryRun=false
		)




public class Runner {

}
