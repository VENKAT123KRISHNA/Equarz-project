package com.equarzlogin.testcase;

import org.testng.Assert; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utils.signupUtils;
import com.base.signupbase;
import com.pageobjects.signfunctionality;
import com.pageobjects.signupfunctionality;

public class signuplogin extends signupbase {
  signupfunctionality sg;
	
	public signuplogin() {
		super();
	
	}
  @BeforeMethod
	public void initialize() {
		setup();
		sg=new signupfunctionality(driver);
	}
	@Test(priority=1)
	public void verifyURL (){
		
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/customer/auth/sign-up",url);
	}
	@Test(priority = 2,dataProvider ="signupdata",dataProviderClass =signupUtils.class)
	
	public void validatesignup(String frst,String lastn,String mail,String phn,String pswrd,String conpsrd) throws Throwable {
	       
	sg.validatesignup(frst,lastn,mail,phn,pswrd,conpsrd);
	
	
	
}
}