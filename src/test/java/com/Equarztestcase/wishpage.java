package com.Equarztestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.signinFunctionality;
import com.pageobjects.wishFunctionality;

public class wishpage extends Testbase{
	
	wishFunctionality wf;
	signinFunctionality sf;
		
		public wishpage() {
			super();
		
		}
	  @BeforeMethod
		public void initialize() throws Exception {
			setup();
			sf=new signinFunctionality (driver);
			sf.validatesignin(props.getProperty("Email1"),props.getProperty("Password1"));
			wf=new wishFunctionality(driver);
		}
		@Test(priority=1)
		public void homeproduct() throws Exception  {
			wf.Homeproducts();
			}
		@Test(priority=2)
		public void searchproduct() throws Exception {
			wf.productsearch();
		}

		@Test(priority = 3)
		public void categoriesProducts() {
			wf.categoryproducts();
		}
		@Test(priority = 4)
		public void promoproducts() {
			wf.promotesproducts();
		}
	   
		@AfterMethod
		public void ALL() {
			driver.close();
		}

}
