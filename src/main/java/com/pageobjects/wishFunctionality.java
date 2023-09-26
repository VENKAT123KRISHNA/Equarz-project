package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class wishFunctionality extends Testbase{
	
	
	@FindBy(id="si-email")
	WebElement signin;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(xpath="//button[@class='btn btn--primary btn-block btn-shadow']")
	WebElement   signbttn;
	
	@FindBy(css = "[alt='Nike']")
	WebElement nikeproduct;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64940eefdea93.png']")
	WebElement nikeshoe;
	@FindBy(css ="[class='btn __text-18px text-danger']")
	WebElement wishbttns;
	
	@FindBy(xpath = "//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbox;
	@FindBy(xpath ="(//span[@class='input-group-text __text-20px'])[1]")
	WebElement searchbttn;
	@FindBy(xpath = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953e5855be3.png']")
	WebElement fujiCAMERAproduct;
	@FindBy(css ="[class='fa fa-heart-o ']")
	WebElement wishbttn;
	

	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/banner/2023-07-21-64ba5d6aa14b4.png']")
	WebElement promobtn;
	@FindBy(xpath = "(//a[@href='http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX'])[1]")
	WebElement blazer;
	@FindBy(css = "[class='fa fa-heart-o ']")
	WebElement wishbtn;
	
	@FindBy(linkText = "(//span[text()='Categories'])[1]")
	WebElement categorybtn;
	@FindBy(linkText = "(//span[text()='Electronics'])[1]")
	WebElement electronics;
	@FindBy(linkText = "(//span[text()='Cameras'])[1]")
	WebElement cameras;
	@FindBy(xpath = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953e5855be3.png']")
	WebElement fujcam;
	@FindBy(css = "[class='fa fa-heart-o ']")
	WebElement wishbn;
	
	public wishFunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this );

		}
		public Hompage Homeproducts() throws Exception {
			
			
			nikeproduct.click();
			nikeshoe.click();
			wishbttns.click();
			
			  return new Hompage();
			  
}
public void productsearch() throws Exception {
	
	signbttn.click();
	searchbox.sendKeys(props.getProperty("searchbox"));
	searchbttn.click();
	fujiCAMERAproduct.click();
	wishbttn.click();

	}
	
    public void promotesproducts() {
    	
    	promobtn.click();
    	blazer.click();
    	 wishbtn.click();
	   }
    
    public void categoryproducts() {
    	
    	 categorybtn.click();
    	 electronics.click();
    	 cameras.click();
    	 fujcam.click();
    	 wishbn.click();
    	 
    	 
    	
    	
    	
    }


}
