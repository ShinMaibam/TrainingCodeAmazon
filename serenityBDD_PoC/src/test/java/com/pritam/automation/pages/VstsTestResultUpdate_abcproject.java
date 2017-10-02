package com.pritam.automation.pages;

import net.serenitybdd.core.pages.PageObject;

public class VstsTestResultUpdate_abcproject extends PageObject {

	public static String scenarioName;
	public static int pointId;
	public static int planId;
	
	public void vstsInitialize (String tcname, int testpointID, int testplanID){
		scenarioName = tcname;
		pointId = testpointID;
		planId = testplanID;		
	}
	
	
}
