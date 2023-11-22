package com.Equarztestcase;

import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.PENDINGMPRODUCTS;
import com.pageobjects.signinFunctionality;
import com.utils.signuputils;

public class PENDINGPRODUCTSPAGE extends Testbase{
	
	PENDINGMPRODUCTS pp;
	signinFunctionality sg;
	
	
	public PENDINGPRODUCTSPAGE() {
		super();
	}

	@BeforeMethod
	public void pending() throws Exception {
		
		setup();
		
		sg=new signinFunctionality(driver);
		sg.validatesignin(props.getProperty("Email1"),props.getProperty("Password1"));
		pp=new PENDINGMPRODUCTS(driver);
	}
	
	@Test
	public void pendcyproducts() throws Exception {
		pp.pendsproduct();
	}
	
	@AfterMethod
	public void ends() {
		driver.close();
	}
	
}
