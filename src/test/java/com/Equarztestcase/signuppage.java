package com.Equarztestcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.signupFunctionality;
import com.utils.signuputils;

public class signuppage extends Testbase{
	
	
	 signupFunctionality sg;
		
		public signuppage() {
			super();
		
		}
	  @BeforeMethod
		public void initialize() {
			setup();
			sg=new signupFunctionality(driver);
		}
		@Test(priority=1)
		public void verifyURL (){
			
			String url=driver.getCurrentUrl();
			Assert.assertEquals("http://e-quarz.com/customer/auth/sign-up",url);
		}
		@Test(priority = 2,dataProvider ="signupdata",dataProviderClass =signuputils.class)
		
		public void validatesignups(String frst,String lastn,String mail,String phn,String pswrd,String conpsrd) throws Throwable {
		       
		sg.validatesignup(frst,lastn,mail,phn,pswrd,conpsrd);
		
		
		
	}

}
