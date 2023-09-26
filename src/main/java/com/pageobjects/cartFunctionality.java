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
	@FindBy(xpath = "//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953e2446e92.png']")
	WebElement CAMERAproduct;
	@FindBy(css ="[onclick='addToCart()']")
	WebElement cartbox;
	
	@FindBy(linkText = "(//span[text()='Categories'])[1]")
	WebElement categorybtn;
	@FindBy(linkText = "(//span[text()='Electronics'])[1]")
	WebElement electronics;
	@FindBy(linkText = "(//span[text()='Cameras'])[1]")
	WebElement cameras;
	@FindBy(xpath = "(//a[@href='http://e-quarz.com/product/fujifilm-x-t5-mirrorless-camera-with-18-55mm-lens-silver-24uZ7t'])[1]")
	WebElement fujcam;
	@FindBy(css = "[onclick='buy_now()']")
	WebElement buysbtn;
	
	@FindBy(css ="[alt='Nike']")
	WebElement nikeproduct;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64946b6ddb4d7.png']")
	WebElement nikeshoe;
	@FindBy(linkText = "//span[text()='Buy now']")
	WebElement Buybtn;
	
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/banner/2023-07-21-64ba5d6aa14b4.png']")
	WebElement promobtn;
	@FindBy(xpath = "(//a[@href='http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX'])[1]")
	WebElement blazer;
	@FindBy(css = "[class='btn btn-secondary element-center __iniline-26 btn-gap-right']")
	WebElement buybttn;
	
	

	public cartFunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this );

		
	}
	public Hompage searchproducts() throws Exception {
		
		signbttn.click();
		searchbox.sendKeys(props.getProperty("searchbox"));
		searchbttn.click();
		CAMERAproduct.click();
		cartbox.click();
	    return new Hompage();
	}	
	public void categeryproducts() {
		categorybtn.click();
		Actions ac=new Actions (driver);
		ac.moveToElement(electronics).build().perform();
		cameras.click();
		fujcam.click();
		 buysbtn.click();
     
	}
	public void homeproducts() {
		nikeproduct.click();
		nikeshoe.click();
		Buybtn.click();
	}

	public Hompage bannerproducts() {
		promobtn.click();
		blazer.click();
		buybttn.click();
		return new Hompage();
}
	
	

}
