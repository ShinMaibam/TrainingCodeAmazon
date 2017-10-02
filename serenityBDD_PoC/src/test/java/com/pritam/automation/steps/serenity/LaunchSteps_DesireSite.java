package com.pritam.automation.steps.serenity;

import com.pritam.automation.Definition_RunnerClass;
import com.pritam.automation.pages.LaunchPage_DesireSite;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LaunchSteps_DesireSite extends ScenarioSteps{
	
	LaunchPage_DesireSite launchpage;
	
	@Step
	public void launch_desireSite(){
		getDriver().manage().window().maximize();
		//launchpage.open();
		launchpage.openAt(Definition_RunnerClass.amazonSite);
	}

}
