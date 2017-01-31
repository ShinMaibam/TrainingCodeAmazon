package com.pritam.automation.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://mperks.meijer.com")
public class MperksPage extends PageObject {

	@FindBy(xpath = "//a[@class='create_account btn']")
	private WebElement createAccountButton;
	
	@FindBy(id = "menuSigninOverlay")
	private WebElement signInButton;

	public void userclicksOnYourAccount() {
		createAccountButton.click();
	}
	
	public void verifySignInButton() {
		boolean condition = signInButton.isDisplayed();
		Assert.assertTrue(condition);
		signInButton.click();
	}
	
	
}