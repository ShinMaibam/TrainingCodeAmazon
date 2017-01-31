package com.pritam.automation.steps.serenity;

import com.pritam.automation.pages.HomePage_Amazon;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSerenitySteps_Amazon extends ScenarioSteps {

	HomePage_Amazon homepage;

	@Step
	public void user_SearchForItem(String item) {
		homepage.search_item(item);
		homepage.click_searchicon();
	}

	@Step
	public void user_SeeSearchKeyNextToSearchResultNumbers(String item) {
		homepage.validate_SearchKeyDisplay(item);
	}

	@Step
	public void user_clickonYourAccountlink() throws InterruptedException {
		homepage.clickyouraccount();
	}

	@Step
	public void SignIn_PageDisplay() {
		homepage.validate_signInPageDisplay();
	}

	@Step
	public void user_enteremailidandpassword() {
		homepage.enteremailid();
		homepage.enterpassword();
	}

	@Step
	public void click_onSignInbutton() {
		homepage.click_signinbutton();
	}

	@Step
	public void user_hovermousetohellosigninandselectclickherelink() throws InterruptedException {
		homepage.hovermouse_HelloSignIn();
	}

	@Step
	public void create_AmazonAccountPageDisplay() {
		homepage.validate_createAccountTextDisplay();
	}

	@Step
	public void enter_YourNewAccountDetails(String name, String email, String pwd, String confpwd) {
		homepage.enterYourName(name);
		homepage.enterEmailId_createAccount(email);
		homepage.enterPassword_createAccount(pwd);
		homepage.reEnterPassword_createAccount(confpwd);
	}

	@Step
	public void clickcreate_youramazonAccountButton() {
		homepage.clickCreateMyAmzAccButton();
	}

}
