package com.Equarztestcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.Addressfunctionality;
import com.pageobjects.profileFunctionality;
import com.pageobjects.signinFunctionality;

public class profilepage extends Testbase{
	

	profileFunctionality pf;
	signinFunctionality sf;
	
	public profilepage() {
		super();
	}
	@BeforeMethod
	public void intialize() throws Exception {
		setup();
		sf=new signinFunctionality(driver);
		sf.validatesignin(props.getProperty("Email1"),props.getProperty("Password1"));
		pf=new profileFunctionality(driver);
		pf.editprofile();
	}
    @Test(priority=1)
	public void profile() throws Exception {
    	pf.editdetails();
    	String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/user-account",url);
		}
	
	@Test(priority=2)
		public void image() throws Exception {
			pf.editimage();
			String url=driver.getCurrentUrl();
			Assert.assertEquals("http://e-quarz.com/user-account",url);
		}
	
	
	
	
	
}	

