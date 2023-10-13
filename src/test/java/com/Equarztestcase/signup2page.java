package com.Equarztestcase;

import org.testng.Assert; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.signupFunctionality;
import com.utils.signuputils;
import com.utils.sognup2tUtils;

public class signup2page extends Testbase{
	
	 signupFunctionality su;
	 
	 private final String sheetName="signup";
		
		public signup2page() {
			super();
		}
		@DataProvider
		public String[][] signups() throws Exception{
			return sognup2tUtils.signupdata(sheetName);
			
		}
		
		 @BeforeMethod
		public void initialize() {
			setup();
			su=new signupFunctionality(driver);
		}
		 
		@Test(priority=1)
		public void verifyURL (){
			
			String url=driver.getCurrentUrl();
			Assert.assertEquals("http://e-quarz.com/customer/auth/sign-up",url);
		}
		@Test(priority = 2,dataProvider ="signups",dataProviderClass =signup2page.class)
		
		public void validatesignups(String frst,String lastn,String mail,String phn,String pswrd,String conpsrd) throws Throwable {
		       
		su.validatesignup(frst,lastn,mail,phn,pswrd,conpsrd);
		
		
		
		
		
	}


}
