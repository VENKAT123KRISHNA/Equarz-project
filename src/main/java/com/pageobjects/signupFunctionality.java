package com.pageobjects;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class signupFunctionality extends  Testbase{
	
	
	@FindBy(xpath ="//input[@name='f_name']")
	WebElement frstbox;
	@FindBy(xpath ="//input[@name='l_name']")
	WebElement lstbox;
	@FindBy(xpath ="//input[@name='email']")
	WebElement mailbox;
	@FindBy(xpath ="//input[@name='phone']")
	WebElement phbox;
	@FindBy(id ="si-password")
	WebElement pswrdbox;
	@FindBy(xpath ="//input[@name='con_password']")
	WebElement confrmpsrd;
	@FindBy(id ="inputCheckd")
	WebElement chckbox;
	@FindBy(id ="sign-up")
	WebElement signupbtn;
	public signupFunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this );
}
 
	public  Hompage validatesignup(String frst,String lastn,String mail,String phn,String pswrd,String conpsrd) throws Throwable  {
		frstbox.sendKeys("frst");
		lstbox.sendKeys("lastn");
		mailbox.sendKeys("mail");
		phbox.sendKeys("phn");
		pswrdbox.sendKeys("pswrd");
	    confrmpsrd.sendKeys("conpsrd");
		chckbox.click();
		
		Thread.sleep(10000);
		
		//signupbtn.click();
		
		return new Hompage();
	}
}
