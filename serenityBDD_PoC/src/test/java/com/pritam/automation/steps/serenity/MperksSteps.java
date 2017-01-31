package com.pritam.automation.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import com.pritam.automation.pages.MperksPage;

public class MperksSteps extends ScenarioSteps {

	MperksPage mPerksPage;

	@Step
	public void is_the_home_page() {
		mPerksPage.open();
	}

	@Step
	public void userClicksOnYourAccount() {
		mPerksPage.userclicksOnYourAccount();

	}
	@Step
	public void verifyUserSignIn() {
		mPerksPage.verifySignInButton();
	}

}