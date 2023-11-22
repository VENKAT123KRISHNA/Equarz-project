package com.Equarztestcase;

import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.BuynowFunctionality;
import com.pageobjects.brokenLinks;
import com.pageobjects.signinFunctionality;

public class brokenpages extends Testbase{
	
	brokenLinks bl;
	
	
	public brokenpages() {
		super();
	}
	
	@BeforeMethod
	public void brokens() throws Exception {
		
		setup();
		
		
		bl=new brokenLinks (driver);
		}
	
	
	@Test(priority=1)
	public void Brokenlinks() throws Exception {
		bl.pages();
		
	}
	@AfterMethod
	public void drop() {
		driver.quit();
	}
	
	
	
	
	
	

}
