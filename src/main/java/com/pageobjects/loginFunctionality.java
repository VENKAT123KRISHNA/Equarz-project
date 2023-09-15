package com.pageobjects;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public final class loginFunctionality extends Testbase{
	@FindBy (id="signinSrEmail")
	WebElement signin;
	@FindBy (id="signupSrPassword")
	WebElement pass;
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement signbtn;
	
	public loginFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public Hompage ValidateLogin() throws Exception {
	signin.sendKeys(props.getProperty("Email"));
	pass.sendKeys(props.getProperty("Password"));
	
	Thread.sleep(10000);
	signbtn.click();
		
      return new  Hompage();

}
}