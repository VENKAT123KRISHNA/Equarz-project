package com.equarzlogin.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.signbase;
import com.pageobjects.signfunctionality;

public class signinpage extends signbase{
	signfunctionality sg;
	
	public signinpage() {
		super();
	
	}
  @BeforeMethod
	public void initialize() {
		setup();
		sg=new signfunctionality(driver);
	}
	@Test(priority=1)
	public void verifyLogin() throws Exception {
		sg.validatesignin();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/",url);
		
		
	}
	
	
	}
