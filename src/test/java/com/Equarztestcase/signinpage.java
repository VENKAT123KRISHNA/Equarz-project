package com.Equarztestcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.signinFunctionality;

public class signinpage extends Testbase {
	
signinFunctionality sg;
	
	public signinpage() {
		super();
	
	}
  @BeforeMethod
	public void initialize() {
		setup();
		sg=new signinFunctionality(driver);
	}
	@Test(priority=1)
	public void verifyLogin() throws Exception {
		sg.validatesignin();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/",url);
		
		
	}

}
