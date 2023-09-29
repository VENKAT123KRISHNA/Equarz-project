package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class cartFunctionality extends Testbase {
	

	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(xpath = "//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbox;
	@FindBy(xpath ="(//span[@class='input-group-text __text-20px'])[1]")
	WebElement searchbttn;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-649541e3e319e.png']")
	WebElement pansonicCam;
	
	@FindBy(xpath =   "(//span[text()='Electronics'])[1]")
	WebElement electronics;
	@FindBy(xpath  = "//span[text()='Cameras']")
	WebElement camera;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953e2446e92.png']")
	WebElement canonEOScam;
	
	@FindBy(css ="[alt='Nike']")
	WebElement nikeproduct;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64946b6ddb4d7.png']")
	WebElement nikeshoe;
	
	
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/banner/2023-07-21-64ba5d6aa14b4.png']")
	WebElement promobtn;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-6495491569cb4.png']")
	WebElement blazer;
	
	
	@FindBy(css = "[href='http://e-quarz.com/wishlists']")
	WebElement wishbox;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-6495427bae9fd.png']")
	WebElement wildcrafbag;
	
	@FindBy(css = "[onclick='addToCart()']")
	WebElement addcartbtn;
	

	public cartFunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this );

		
	}
	public Hompage searchproducts() throws Exception {
		
		
		searchbox.sendKeys(props.getProperty("searchbox"));
		searchbttn.click();
		pansonicCam.click();
		 addcartbtn.click();
	    return new Hompage();
	}	
	public void categeryproducts() {
		
		Actions ac=new Actions (driver);
		ac.moveToElement(electronics).build().perform();
		camera.click();
		canonEOScam.click();
		 addcartbtn.click();
     
	}
	public void homeproducts() {
		nikeproduct.click();
		nikeshoe.click();
		addcartbtn.click();
	}

	public Hompage bannerproducts() {
		promobtn.click();
		blazer.click();
		addcartbtn.click();
		return new Hompage();
}

	public void wishproducts() {
		wishbox.click();
		wildcrafbag.click();
		addcartbtn.click();
	}
	

}
