package com.tests;

//import junit.framework.Assert;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class testCreateaccount {		
		
		//public static void main(String[] args) {
	@Test
	public void test()
	{

			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.gmail.com");
			
			// Initializing the Gmail login page 			
			GMailLoginPage lp = PageFactory.initElements(driver, GMailLoginPage.class);
			
			// Clicking on Create account 
			lp.doCreateaccount();
			
			// Initializing the Gmailcreateaccount page
			
			GMailcreateaccountPage ap = PageFactory.initElements(driver, GMailcreateaccountPage.class);
			ap.doCreateaccount("Biswajit", "Nanda", "@pass12345", "@pass12345");
			
			//System.out.println(driver.findElement(By.id("errormsg_0_GmailAddress")).getText());
			
			Assert.assertEquals("You can't leave this empty.",driver.findElement(By.id("errormsg_0_GmailAddress")).getText() );
			
			
			
			
			
		}

	}


