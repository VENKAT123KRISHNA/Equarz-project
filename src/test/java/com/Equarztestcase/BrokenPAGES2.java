package com.Equarztestcase;

import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.BROKENSLINKS2;
import com.pageobjects.brokenLinks;

public class BrokenPAGES2 extends Testbase {
	
	BROKENSLINKS2 Bl;



public BrokenPAGES2() {
	super();
}

@BeforeMethod
public void brokenss() throws Exception {
	
	setup();
	
	
	Bl=new BROKENSLINKS2 (driver);
	}


@Test(priority=1)
public void Brokenlinks() throws Exception {
  Bl.brokepages();
	
}
@AfterMethod
public void drops() {
	driver.quit();
}

}
