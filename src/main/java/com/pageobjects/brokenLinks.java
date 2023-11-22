package com.pageobjects;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class brokenLinks extends Testbase{
	
	
	@FindBy(tagName = "a")
	List<WebElement> links;
	
	public brokenLinks(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	
	public void pages() throws Exception{
		
		Thread.sleep(2000);
		List<WebElement>linkss=links;
		
	System.out.println(linkss.size());
		
	for(int i=0; i<links.size();i++) {
		
		WebElement element=links.get(i);
		String url=element.getAttribute("href");
		URL link=new URL( url);
		HttpURLConnection htpcon= (HttpURLConnection) link.openConnection();
		Thread.sleep(2000);
		htpcon.connect();
		int responcode=htpcon.getResponseCode();
		if(responcode!=200) {
			System.out.println(url+ " - "+ " is broken link");
//		}
//		else {
//			System.out.println(url+ " - "+ " valid link ");
//		
		}
		
		
		
		
	}
	
	
	}
	}
	


