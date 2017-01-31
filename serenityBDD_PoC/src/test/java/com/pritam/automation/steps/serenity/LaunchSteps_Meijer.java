package com.pritam.automation.steps.serenity;

import com.pritam.automation.pages.LaunchPage_Meijer;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LaunchSteps_Meijer extends ScenarioSteps {

	LaunchPage_Meijer launchpage;
	
	@Step
	public void launchMeijer(){
		getDriver().manage().window().maximize();
		launchpage.open();
	}
	
}
