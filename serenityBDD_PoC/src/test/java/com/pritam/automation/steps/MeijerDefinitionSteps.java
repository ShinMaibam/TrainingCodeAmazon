package com.pritam.automation.steps;

import net.thucydides.core.annotations.Steps;

import com.pritam.automation.steps.serenity.MeijerSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MeijerDefinitionSteps {

	@Steps
	MeijerSteps meijerStep;

	@Given("the user launcher Meijer")
	public void givenTheUserLaunchesMeijer() {
		meijerStep.is_the_home_page();
	}

	@When("the user searches for a product")
	public void theUsersearchesForAProduct() throws InterruptedException {
		meijerStep.theUserSearches();
	}

	@Then("the user should be in Product Listing page")
	public void theUserShouldBeInPlP() {
		meijerStep.verifyUserInPlp();
	}
}
