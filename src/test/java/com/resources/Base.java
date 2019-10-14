package com.resources;

import org.openqa.selenium.WebElement;
import org.stepdefinition.Hooksclass;

public class Base {
	public void launch(String url) {
Hooksclass.driver.get(url);
}
	public void fill(WebElement e,String Name) {
		e.sendKeys(Name);

	}
	public void btn(WebElement e) {
		e.click();
	}

}
