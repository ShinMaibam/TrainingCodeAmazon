package com.pritam.automation.steps;

import com.pritam.automation.steps.serenity.HomePageSerenitySteps_Amazon;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomePageStepDefinition_Amazon {

	@Steps
	HomePageSerenitySteps_Amazon hpserenitysteps;

	@When("user search for item '(.*)'")
	public void userSearchForItem(String item) {
		hpserenitysteps.user_SearchForItem(item);
	}

	@When("user should see search key '(.*)' next to search result numbers")
	public void userSeeSearchKeyNextToSearchResultNumbers(String item) {
		hpserenitysteps.user_SeeSearchKeyNextToSearchResultNumbers(item);
	}

	@Then("user click on Your Account link")
	public void userclickonYourAccountlink() throws InterruptedException {
		hpserenitysteps.user_clickonYourAccountlink();
	}

	@Then("Sign In page display")
	public void SignInPageDisplay() {
		hpserenitysteps.SignIn_PageDisplay();
	}

	@Then("user enter email id and password")
	public void userenteremailidandpassword() {
		hpserenitysteps.user_enteremailidandpassword();
	}

	@Then("click on Sign In button")
	public void clickonSignInbutton() {
		hpserenitysteps.click_onSignInbutton();
	}

	@Then("user hover mouse to hello sign in and select click here link")
	public void userhovermousetohellosigninandselectclickherelink() throws InterruptedException {
		hpserenitysteps.user_hovermousetohellosigninandselectclickherelink();
	}

	@Then("create amazon account page display")
	public void createAmazonAccountPageDisplay() {
		hpserenitysteps.create_AmazonAccountPageDisplay();
	}

	@Then("enter your new account details '(.*)' '(.*)' '(.*)' '(.*)'")
	public void enterYourNewAccountDetails(String name, String email, String pwd, String confpwd) {
		hpserenitysteps.enter_YourNewAccountDetails(name, email, pwd, confpwd);
	}

	@Then("click create your amazon account button")
	public void clickcreateyouramazonAccountButton() {
		hpserenitysteps.clickcreate_youramazonAccountButton();
	}

}
