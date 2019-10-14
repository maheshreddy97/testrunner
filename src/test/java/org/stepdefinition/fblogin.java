package org.stepdefinition;

import org.objectrepository.loginpage;

import com.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fblogin extends Base{
	loginpage l=new loginpage();
	
@Given("the user is in fb page")
public void the_user_is_in_fb_page() {
    launch("https://www.facebook.com");
}

@When("the user enters the username,password and click login btn")
public void the_user_enters_the_username_password_and_click_login_btn(String username,String password) {

fill(l.getName(),username);
fill(l.getPass(),password);
btn(l.getBtn());
}

@Then("the user navigates to the successful page")
public void the_user_navigates_to_the_successful_page() {
System.out.println("success");}



}
