package com.pageobjects;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	
	@FindBy(xpath = "//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbox;
	@FindBy(xpath ="(//span[@class='input-group-text __text-20px'])[1]")
	WebElement searchbttn;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953f2d2a1eb.png']")
	WebElement sonyalphacam;
	
	

	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/banner/2023-07-21-64ba5d6aa14b4.png']")
	WebElement promobtn;
	@FindBy(css =   "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64954c5de6998.png']")
	WebElement blazer;
	
	
	@FindBy(xpath =   "(//span[text()='Electronics'])[1]")
	WebElement electronics;
	@FindBy(xpath  = "//span[text()='Cameras']")
	WebElement camera;
	@FindBy(css = "[src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-23-64953e2446e92.png']")
	WebElement canonEOScam;
	
	@FindBy(css = "[class='fa fa-heart-o ']")
	WebElement wishbtn;
	
	public wishFunctionality(WebDriver driver) {
		PageFactory.initElements(driver,this );

		}
		public Hompage Homeproducts() throws Exception {
			
			
			nikeproduct.click();
			nikeshoe.click();
			wishbtn.click();
			
			  return new Hompage();
			  
}
public void productsearch() throws Exception {
	
	signbttn.click();
	searchbox.sendKeys(props.getProperty("searchbox"));
	searchbttn.click();
	sonyalphacam.click();
	wishbtn.click();

	}
	
    public void promotesproducts() {
    	
    	promobtn.click();
    	blazer.click();
    	 wishbtn.click();
	   }
    
    public void categoryproducts() {
    	
    	Actions ac=new Actions (driver);
		ac.moveToElement(electronics).build().perform();
		camera.click();
		canonEOScam.click();
    	 wishbtn.click();
    	 
    	 
    	
    	
    	
    }


}
