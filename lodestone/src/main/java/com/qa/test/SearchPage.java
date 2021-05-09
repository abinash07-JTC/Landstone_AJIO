package com.qa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class SearchPage extends TestBase {
	
	String item="";
	
	@FindBy(name="searchVal")
	WebElement q;
	
	@FindBy(className="ic-search")
	WebElement btnk;
	
	public SearchPage() {
		PageFactory.initElements(driver , this);
	}
	
	public String validateSearch() {
		return driver.getTitle();
		
	}
	
	
	public void Searching(String sdata)  {
		q.sendKeys(sdata);
		btnk.click();
		
		
	}
	
	public String validateSearchedPage() {
		return driver.getTitle();
	}
	
		public void Searched() {
		List<WebElement> list = driver.findElements(By.xpath("//*[@role='rowgroup']//a"));
		
		
		int maxPrice=0;
		
		
		for(int i=0;i<=5;i++) {
			String name=driver.findElements(By.xpath("//div[@class='name']")).get(i).getText();
			String oPrice = driver.findElements(By.xpath("//span[@class='orginal-price']")).get(i).getText();
		    String dPrice=driver.findElements(By.xpath("//div[@class='contentHolder']//span[@class = 'price  ']")).get(i).getText();
		
		    System.out.println("Item name is:--- "+name+" ---:Original value:--- "+oPrice+" ---:and Discount value: "+dPrice);
	     
		    oPrice = oPrice.replace("Rs.","");
			oPrice = oPrice.replace(" ","");
			oPrice = oPrice.replace(",","");
			int intPrice=Integer.parseInt(oPrice);
			
			if(intPrice>maxPrice) {
				maxPrice=intPrice;
				item=name;
			} 
		}
		
		
		 
	
	

}
		public void maxPriceItem() {
			System.out.println("Costliest Jeans:--"+item);
		}
		

}