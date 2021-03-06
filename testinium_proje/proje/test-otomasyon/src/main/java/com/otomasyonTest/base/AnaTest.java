package com.otomasyonTest.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.exampleautomation.util.TestUtil;
import com.exampleautomation.util.WebEventListener;

public class AnaTest {

	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener eventListener;
	public static EventFiringWebDriver e_driver;

	public AnaTest() {
		try {
			prop = new Properties();
			FileInputStream ip =  new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/exampleautomation" + "/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();

		e_driver = new EventFiringWebDriver(driver);
	

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get("https://www.lcwaikiki.com/tr-TR/TR"); // anasayfa link

	}

}
