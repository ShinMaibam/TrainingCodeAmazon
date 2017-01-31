package com.pritam.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.meijer.com/")
public class MeijerPage extends PageObject {

	@FindBy(id = "nav_search")
	private WebElement searchProduct;

	@FindBy(id = "nav_search_submit")
	private WebElement submitSearch;

	@FindBy(xpath = "//*[@id='searchWrap']/div[1]/p[1]")
	private WebElement errorMessage;

	public void userSearchForProduct() throws InterruptedException {
		searchProduct.clear();
		searchProduct.sendKeys("computer");
		searchProduct.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// submitSearch.submit();

	}

	public void verifyUserInPlp() {
		boolean condition = errorMessage.isDisplayed();
		Assert.assertTrue(condition);
	}
}