package com.otomasyonTest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.otomasyonTest.base.AnaTest;

public class AramaTest extends AnaTest {
	
		@FindBy(id = "searchData")
		WebElement arananUrun;
		
		
		@FindBy(xpath ="//*[@id=\"header__container\"]/div/header/div[2]/div/div[2]/div/div/div/div[2]/button") // arama butonu kaynak path (https://www.lcwaikiki.com/tr-TR/TR)
		WebElement searchBtn;
		
		@FindBy(xpath="//*[@id=\"search_input\"]") // metin kutusu kaynak path (https://www.lcwaikiki.com/tr-TR/TR)
		WebElement sonuc;
		
	
		
		public AramaTest() {
			PageFactory.initElements(driver, this);
		}
		
		//Action
		public  void arama(String search) {
			arananUrun.sendKeys(search);
			JavascriptExecutor jsl = (JavascriptExecutor) driver;
			jsl.executeScript("arguments[0].click();", searchBtn);
		}
        
		public String aramaListeleme() {
			
			JavascriptExecutor jsl = (JavascriptExecutor) driver;
			String result =(String)jsl.executeScript("return document.getElementsByClassName(\"sonuc\")[0].getElementsByTagName(\"H1\")[0].innerText;");
			
			return result;
		}
	
	
}
