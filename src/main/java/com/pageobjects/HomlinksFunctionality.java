package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class HomlinksFunctionality extends Testbase{
	
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(css = "[href='http://e-quarz.com/products?data_from=featured&page=1']") 
	 WebElement featurelink;
	@FindBy(css = "[href='http://e-quarz.com/products?data_from=latest&page=1']")
	WebElement latestproducts;
	@FindBy(xpath = "(//a[@href='http://e-quarz.com/products?data_from=best-selling&page=1'])[1]")
	WebElement selproducts;
	@FindBy(xpath = "(//a[@href='http://e-quarz.com/products?data_from=top-rated&page=1'])[1]")
	WebElement toprate;
	@FindBy(xpath = "(//a[@href='http://e-quarz.com/customer/auth/login'])[1]")
	WebElement profile;
	@FindBy(css = "[class='navbar-tool-text']")
	WebElement dasboard;
	@FindBy(linkText = "//a[text()='Wish List']")
	//WebElement wishlist;
	//@FindBy(linkText = "//a[text()='Track Order']")
	WebElement trackorder;
	@FindBy(linkText = "//a[text()='Refund policy']")
	WebElement refundspolicy;
	@FindBy(linkText = "//a[text()='Return policy']")
	WebElement returnpolicy;
	@FindBy(linkText = "//a[text()='Cancellation policy']")
	WebElement cancelpolicy;
	@FindBy(css = "[href='http://e-quarz.com/account-tickets']")
	WebElement suporticket;
	@FindBy(css = "[href='http://e-quarz.com/terms']")
	WebElement termsbtn;
	@FindBy(css = "[href='http://e-quarz.com/privacy-policy']")
	WebElement privacypolicy;
	
	public HomlinksFunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this );

		}
		public Hompage featurelinks() throws Exception {
			featurelink.click();
			 return new Hompage();
      }
    
		public void latestproduct() {
			latestproducts.click();
		}
		
		public void selproduct() {
			selproducts.click();
			}
		public void toprated() {
			toprate.click();
		}
		public void  profiles() {
			
			profile.click();
			Actions ac=new Actions(driver);
			ac.moveToElement( dasboard).build().perform();
			
		}
    // public void  wishlists() {
    	// wishlist.click();
     
 
     public void trackorders() {
    	 trackorder.click();
     }
     public void refundpolicy() {
    	 refundspolicy.click();
     }
     
     public void returnpolicy() {
    	 returnpolicy.click();
     }
     public void cancelpolicy() {
    	 cancelpolicy.click();
     }

    public void suportsticket() {
    	suporticket.click();
    }
    public void conditions() {
    	termsbtn.click();
    
    }

    public void privpolicys() {
    	privacypolicy.click();
    

    }
}


