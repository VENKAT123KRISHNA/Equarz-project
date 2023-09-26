package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class signinFunctionality extends Testbase{
	
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	

	public signinFunctionality(WebDriver driver) {
	PageFactory.initElements(driver,this );

	}
	public Hompage validatesignin(String string, String string2) throws Exception {
		signin.sendKeys(props.getProperty("Email1"));
		pass.sendKeys(props.getProperty("Password1"));
	
		Thread.sleep(10000);
		
		signbttn.click();
		
		
	    
	    return new Hompage();
	
         
	
}	

}
