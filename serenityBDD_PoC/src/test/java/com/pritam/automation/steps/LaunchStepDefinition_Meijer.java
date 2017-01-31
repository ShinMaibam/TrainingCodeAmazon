package com.pritam.automation.steps;

import com.pritam.automation.steps.serenity.LaunchSteps_Meijer;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LaunchStepDefinition_Meijer {

	@Steps
	LaunchSteps_Meijer launchsteps;
	
	@Given ("user launch MeijerDotCom")
	public void launchMeijer(){
		launchsteps.launchMeijer();
	}
	
	
}
