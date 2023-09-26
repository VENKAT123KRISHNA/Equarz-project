package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Base.Testbase;

public class profileFunctionality extends Testbase{
	
	

	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(css = "[class='navbar-tool-text']")
	WebElement dashboard;

}
