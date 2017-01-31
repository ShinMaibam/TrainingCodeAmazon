package com.pritam.automation.steps;

import com.pritam.automation.steps.serenity.LaunchSteps_DesireSite;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LaunchStepDefinition_DesireSite {
	
	@Steps
	LaunchSteps_DesireSite launchSteps;
	
	@Given ("user launch desire website")
	public void launch_desire_site(){
		launchSteps.launch_desireSite();
	}
}
