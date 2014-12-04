package com.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GMailLoginPage {

	@FindBy(id="link-signup")
	public WebElement createaccount;
	
	// Business logic
	public void doCreateaccount()
	{
	
		createaccount.click();
	
		
	}
}
