package org.stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Hooksclass {
	public static WebDriver driver;
	
	@Before
	private void beforemethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-11\\Desktop\\gow\\cucumber");
		driver=new ChromeDriver();
	}
	@After
	private void aftermethod() {
    driver.quit();
	}

}
