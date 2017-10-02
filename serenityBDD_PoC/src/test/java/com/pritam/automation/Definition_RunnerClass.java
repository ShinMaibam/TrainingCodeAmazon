package com.pritam.automation;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features", 
		tags = { "@pri1" })

public class Definition_RunnerClass {

	public static final String amazonSite = "https://www.amazon.com";
}
