package com.otomasyonTest.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.otomasyonTest.base.AnaTest;

public class Anasayfa extends AnaTest {


	// Initializing the Page Objects:
	public Anasayfa() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		
		return  driver.getTitle();
	}

	
	
	
	
	
	
	
	
	
	
	

}
