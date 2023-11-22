package com.Equarztestcase;

import org.testng.Assert; 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.logoutfunctionality;
import com.pageobjects.signinFunctionality;

public class logoutpage extends Testbase{
	
	logoutfunctionality lg;
	signinFunctionality sf;
	
	public logoutpage() {
		super();
	}
  @BeforeMethod
  public void intialize() throws Exception{
	  setup();
	  sf=new signinFunctionality(driver);
	  sf.validatesignin(props.getProperty("Emails1"),props.getProperty("Password1"));
	  lg=new logoutfunctionality(driver);
	  
	   }
	@Test
	public void logout() throws Exception {
		
		lg.signout();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/",url);
		
	}
	
	@AfterMethod
	public void out() {
		driver.close();
	}
	
	
	
	
	
	
	
}
