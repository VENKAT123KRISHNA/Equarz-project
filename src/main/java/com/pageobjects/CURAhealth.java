package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class CURAhealth extends Testbase {
	
	@FindBy(id = "txt-username")
	WebElement username;
	@FindBy(id = "txt-password")
	WebElement paswrd;
	@FindBy(id = "btn-login")
	WebElement loginbttn;
	
	public CURAhealth (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}

	public void  curalogin() {
		
		username.sendKeys(props.getProperty("CURA USERNAME"));
		paswrd.sendKeys(props.getProperty("CURA PASWRD"));
		loginbttn.click();
		
		
	}
	
	
	
	
}
