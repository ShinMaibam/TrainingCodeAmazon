package com.pritam.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.pritam.uilityhelper.Constants_Amz;
import com.pritam.uilityhelper.Utility_Helper;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage_Amazon extends PageObject{

	Utility_Helper utility;
	
	//Search Field
	@FindBy (id="twotabsearchtextbox")
	public WebElement searchfieldHP;
	
	//Search icon
	@FindBy (xpath="//*[@id='nav-search']//*[@class='nav-search-submit nav-sprite']/input")
	public WebElement searchiconHP;
	
	//Search Result search key display
	@FindBy (xpath="//*[@id='s-result-count']//*[@class='a-color-state a-text-bold']")
	public WebElement searchKeyDisplayHP;
	
	//Your Account
	@FindBy (xpath="//*[@id='nav-link-yourAccount']/span[contains (@class, 'nav-line-2')]")
	public WebElement youraccountdropdown;
	
	//Email field
	@FindBy (id="ap_email")
	public WebElement emailfieldsignin;
	
	//Password Field
	@FindBy (id="ap_password")
	public WebElement passwordfieldlogin;
	
	//Sign In button
	@FindBy (id="signInSubmit")
	public WebElement signinbutton;
	
	@FindBy (xpath="//h1[@class='a-spacing-small']")
	public WebElement signInHeaderText;
	
/*--------------10/14/16--------------------*/	
	
	@FindBy (id="nav-link-yourAccount")
	public WebElement helloSignInHP;
	
	@FindBy (xpath="//*[@id='nav-flyout-ya-newCust']/a")
	public WebElement startherelink;
	
	@FindBy (xpath="//*[@id='ap_register_form']//h1[@class='a-spacing-small']")
	public WebElement createaccounttext;
	
	@FindBy (id="ap_customer_name")
	public WebElement yournametextboxfieldCreateAccount;
	
	@FindBy (id="ap_email")
	public WebElement emailIDtextboxfieldCreateAccount;
	
	@FindBy (id="ap_password")
	public WebElement enterpasswordfieldcreateAccount;
	
	@FindBy (id="ap_password_check")
	public WebElement reenterpasswordfieldcreateAccount;
	
	@FindBy (id="continue")
	public WebElement createaYourAmazonAccountButton;
	
	/*@FindBy (="")
	public WebElement ;
	
	@FindBy (="")
	public WebElement ;
	
	@FindBy (="")
	public WebElement ;
	
	@FindBy (="")
	public WebElement ;
	
	@FindBy (="")
	public WebElement ;
	*/
	
	
	
/*========================================>>>>>>>>>>> Page Actions <<<<<<<<<<<<<<======================================*/
	
	public void clickyouraccount() throws InterruptedException{
		youraccountdropdown.click();
		Thread.sleep(2000);
	}
	
	public void enteremailid (){
		emailfieldsignin.sendKeys("ngantoi@gmail.com");
	}
	
	public void enterpassword (){
		passwordfieldlogin.sendKeys("leima");
	}
	
	public void click_signinbutton(){
		signinbutton.click();
	}
	
	public void validate_signInPageDisplay(){
		Assert.assertEquals("Sign in", signInHeaderText.getText());
	}
	
	//Enter Search key into Search field
	public void search_item(String item){
		utility.waitUntilClickable(searchfieldHP);
		searchfieldHP.sendKeys(item);
	}
	
	//Click on Magnifying search icon
	public void click_searchicon(){
		searchiconHP.click();
	}
	
	//Validate Search Key Display
	public void validate_SearchKeyDisplay(String item){
		utility.waitUntilElementVisible(searchKeyDisplayHP);
		System.out.println("Displayed value is " + "\"" + item + "\"");
		Assert.assertEquals("\""+item+"\"", searchKeyDisplayHP.getText());
	}
	
/*------------------------------------------10-14-16----------------------------*/	
	public void hovermouse_HelloSignIn() throws InterruptedException{
		Actions movemouse=new Actions(getDriver());
		movemouse.moveToElement(youraccountdropdown).perform();
		Thread.sleep(1000);
		utility.waitUntilClickable(startherelink);
		startherelink.click();		
	}
	
	public void validate_createAccountTextDisplay(){
		utility.waitUntilElementVisible(createaccounttext);
		Assert.assertEquals(Constants_Amz.createaccountText, createaccounttext.getText());
	}
	
	public void enterYourName(String name){
		yournametextboxfieldCreateAccount.sendKeys(name);	
	}
	
	public void enterEmailId_createAccount(String email){
		emailIDtextboxfieldCreateAccount.sendKeys(email);	
	}
	
	public void enterPassword_createAccount(String pwd){
		enterpasswordfieldcreateAccount.sendKeys(pwd);
	}
	
	public void reEnterPassword_createAccount(String confpwd){
		reenterpasswordfieldcreateAccount.sendKeys(confpwd);
	}
	
	public void clickCreateMyAmzAccButton(){
		createaYourAmazonAccountButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
