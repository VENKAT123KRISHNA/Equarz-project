package com.Equarztestcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Testbase;
import com.pageobjects.HomlinksFunctionality;
import com.pageobjects.signinFunctionality;

public class homelinkspage extends Testbase{
	

	 HomlinksFunctionality hl;
	 signinFunctionality sg;
	 
	 public homelinkspage() {
		 super();
	 }
	 @BeforeMethod
	public void links() throws Exception {
		setup();
		sg=new signinFunctionality(driver);
		sg.validatesignin(props.getProperty("Email"),props.getProperty("Password"));
		hl=new  HomlinksFunctionality(driver);
	}
 @Test(priority=1)
	public void  Featureslinks() throws Exception {
		hl.featurelinks();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/products?data_from=featured&page=1", url);
		}
     @Test(priority=2)
	public void LatestproductS() {
		hl.latestproduct();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/products?data_from=latest&page=1", url);
	}
  @Test(priority=3)
  public void sellproducts() {
	   hl.selproduct();
	   String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/products?data_from=best-selling&page=1", url);
  }
 
 @Test(priority=4)
	  public void TopSrated() {
		 hl.toprated(); 
		 String url=driver.getCurrentUrl();
			Assert.assertEquals("http://e-quarz.com/products?data_from=top-rated&page=1", url);
	  }
  @Test(priority=5)
  public void  Profile() {
	   hl.profiles();
	   String url=driver.getCurrentUrl();
		Assert.assertEquals("", url);
 }
  // @Test(priority=6)
  // public void  Wishlist() {
	// hl.wishlists();
	 //String url=driver.getCurrentUrl();
		//Assert.assertEquals("http://e-quarz.com/products?data_from=featured&page=1", url);
  

   @Test(priority=7)
   public void Trackorder()  {
   	hl.trackorders();
   	String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/track-order", url);
    }
   
   @Test(priority=7)
   public void Refundspolicy()  {
   	hl.refundpolicy();
   	String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/refund-policy", url);
    }
   

  @Test(priority=8)
   public void ReturnpolicyS() {
	  hl.returnpolicy();
	  String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/return-policy", url);
  }

 @Test(priority=9)
 public void CancelpolicyS() {
	  hl.cancelpolicy();
	  String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/cancellation-policy", url);
 }
@Test(priority=10)
 public void suporttickts() {
	 
	 hl.suportsticket();
	 String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/account-tickets", url);
	 
 }
 
 public void termconditions() {
	 hl.conditions();
	 String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/terms", url);
	 
 }
 public void privpolicy() {
	 hl.privpolicys();
	 String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/privacy-policy", url);
	 
 }
 
 @AfterMethod
 public void alllink() {
	  driver.close();
	 
 }

}
