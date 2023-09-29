package com.pageobjects;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class BuynowFunctionality extends Testbase{
	
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/banner/2023-07-21-64ba5d6aa14b4.png']")
	WebElement banner;
	@FindBy (css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64954c5de6998.png']")
	WebElement SLIMCOAT;
	
	
	@FindBy(css ="[alt='Nike']")
	WebElement nikeproduct;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64946b6ddb4d7.png']")
	WebElement nikeshoe;
	
	
	
	@FindBy(xpath =   "(//span[text()='Electronics'])[1]")
	WebElement electronics;
	@FindBy(xpath  = "//span[text()='Cameras']")
	WebElement camera;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953e2446e92.png']")
	WebElement canonEOScam;
	
	@FindBy(xpath = "//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbox;
	@FindBy(xpath ="(//span[@class='input-group-text __text-20px'])[1]")
	WebElement searchbttn;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-649541e3e319e.png']")
	WebElement pansonicCam;
	
	@FindBy(xpath = "//span[text()='Buy now']")
	WebElement buybtnss;
	 
	
	public BuynowFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public Hompage bannerproducts() throws Exception {
		banner.click();
		SLIMCOAT.click();
		 buybtnss.click();
		return new Hompage();
	}
	
	public void homeproducts() {
		nikeproduct.click();
		nikeshoe.click();
		 buybtnss.click();
	}
	
	public void categeryproducts() throws Exception {
		
		Actions ac=new Actions (driver);
		ac.moveToElement( electronics).build().perform();
		
		camera.click();
		canonEOScam.click();
		   buybtnss.click();
	}
	
	public void searchproducts() {
		searchbox.sendKeys(props.getProperty("searchbox"));
		searchbttn.click();
		pansonicCam.click();
		buybtnss.click();
	}

}
