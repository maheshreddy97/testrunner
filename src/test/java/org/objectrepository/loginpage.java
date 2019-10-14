package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooksclass;

import cucumber.api.HookType;

public class loginpage {
	public loginpage() {  
		PageFactory.initElements(Hooksclass.driver, this);
		
   	}
	@FindBy(id="email")
	private WebElement Name;
	
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(xpath="//label[@id='loginbutton']")
	private WebElement btn;
	public WebElement getName() {
		return Name;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getBtn() {
		return btn;
	}
	
	

}
