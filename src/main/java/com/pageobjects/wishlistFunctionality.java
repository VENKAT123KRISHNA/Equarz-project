package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.wishlistbase;

public class wishlistFunctionality extends wishlistbase{
  
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	//@FindBy(xpath ="//button[@class='close __close']")
	//WebElement closebtn;
	@FindBy(css = "[alt='Nike']")
	WebElement nikeproduct;
	@FindBy(css ="[class='btn __text-18px text-danger']")
	WebElement wishbttns;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64946b6ddb4d7.png']")
	WebElement nikeshoe;
	@FindBy(xpath = "//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbox;
	@FindBy(xpath ="(//span[@class='input-group-text __text-20px'])[1]")
	WebElement searchbttn;
	@FindBy(xpath = "//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953e2446e92.png']")
	WebElement CAMERAproduct;
	@FindBy(css ="[onclick='addToCart()']")
	WebElement cartbox;
	@FindBy(css ="[class='btn __text-18px text-danger']")
	WebElement wishbttn;
	public wishlistFunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this );

		}
		public Hompage Homeproducts() throws Exception {
			
			Thread.sleep(10000);
			
			signbttn.click();
			nikeproduct.click();
			wishbttns.click();
			
			  return new Hompage();
			  
}
public void productsearch() throws Exception {
	
	Thread.sleep(10000);
	
	signbttn.click();
	searchbox.sendKeys(props.getProperty("searchbox"));
	searchbttn.click();
	CAMERAproduct.click();
	wishbttn.click();
}
		
		
		
}