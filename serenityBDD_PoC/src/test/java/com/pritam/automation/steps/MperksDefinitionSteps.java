package com.pritam.automation.steps;

import net.thucydides.core.annotations.Steps;

import com.pritam.automation.steps.serenity.MperksSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MperksDefinitionSteps {

	@Steps
	MperksSteps mPerks;

	@Given("the user launcher Mperks")
	public void givenTheUserIsOnTheWikionaryHomePage() {
		mPerks.is_the_home_page();
	}
	
	@When("the user clicks on Your Account button")
	public void theUserClicksOnYourAccountButton() {
		mPerks.userClicksOnYourAccount();
	}
	
	@Then("the user should be prompted to sign In")
	public void theUsershouldBePromptedToSignin() {
		mPerks.verifyUserSignIn();
	}

}
