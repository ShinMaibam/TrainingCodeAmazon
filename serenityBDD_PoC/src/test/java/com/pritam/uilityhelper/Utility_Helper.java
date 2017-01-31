package com.pritam.uilityhelper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class Utility_Helper extends PageObject{
	
	public void waitUntilClickable(WebElement element){
		WebDriverWait wait=new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilElementVisible(WebElement element){
		WebDriverWait wait=new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void testnew2(){
		System.out.println("Demo hotFix");
	}

}
