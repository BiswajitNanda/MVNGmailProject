package com.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GMailcreateaccountPage {


	@FindBy(xpath="//*[@id='FirstName']")
	public WebElement firstname;
	
	@FindBy(xpath="//*[@id='LastName']")
	public WebElement lastname;
	
	@FindBy(xpath="//*[@id='GmailAddress']")
	public WebElement username;
	
	@FindBy(xpath="//*[@id='Passwd']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='PasswdAgain']")
	public WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id='TermsOfService']")
	public WebElement termsofservice;
	
	@FindBy(xpath="//*[@id='submitbutton']")
	public WebElement Nextstep;
	
	// Business logic
	public void doCreateaccount(String myfirstname,String mylastname, String mypassword, String myconfirmpassword)
	{
	
		firstname.sendKeys(myfirstname);
		lastname.sendKeys(mylastname);
		password.sendKeys(mypassword);
		confirmpassword.sendKeys(myconfirmpassword);
		termsofservice.click();
		Nextstep.click();
		
			
	}
}
