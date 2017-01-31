package com.pritam.automation.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import com.pritam.automation.pages.MeijerPage;

public class MeijerSteps extends ScenarioSteps {

	MeijerPage meijerPage;

	@Step
	public void is_the_home_page() {
		meijerPage.open();
	}

	@Step
	public void theUserSearches() throws InterruptedException {
		meijerPage.userSearchForProduct();

	}

	@Step
	public void verifyUserInPlp() {
		meijerPage.verifyUserInPlp();
	}
}