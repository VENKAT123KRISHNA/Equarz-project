package com.pageobjects;

import java.net.HttpURLConnection; 
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Testbase;

public class BROKENSLINKS2 extends Testbase {
	
	@FindBy(tagName = "a")
	List<WebElement> links;
	
	public BROKENSLINKS2(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	
	public void brokepages() throws Exception{
		
		Thread.sleep(2000);
		Set<String> brokenlinkUrls = new HashSet<String>();
		List<WebElement> linkss = links;
		System.out.println(links.size());

		for (WebElement link : links) {
			String linkURL = link.getAttribute("href");	
			//Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("hostname", 80));
			URL url = new URL(linkURL);
			URLConnection urlConnection = url.openConnection();//proxy
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			if(httpURLConnection.getResponseCode() != 200)
			{
				brokenlinkUrls.add(linkURL);
			}
//				System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());
//			else
//				System.err.println(linkURL + " - " + httpURLConnection.getResponseCode() + " - " + httpURLConnection.getResponseMessage());
			
			httpURLConnection.disconnect();
		}

		driver.quit();
		
		for (String brokenLinkUrl : brokenlinkUrls) {
			System.err.println(brokenLinkUrl);
		}
	}

	}

