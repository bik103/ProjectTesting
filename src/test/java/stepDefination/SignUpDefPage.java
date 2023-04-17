package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.SignUpPage;

public class SignUpDefPage {
   
	SignUpPage s = new SignUpPage();
	
	@Given ("User launch URL")
	public void User_launch_URL() {
		s.launchURL();
		
	}
	
	@When ("user accept all cookies")
	public void  user_accept_all_cookies() {
		s.acceptCookies();
		
	}
	
	@And ("Accept age verification")
	public void  Accept_age_verification() {
		s.ageVerification();
		
	}
	
	@And ("go to signInRegister")
	public void  go_to_signInRegister() {
		s.cursorHover();
	}
	
	@And ("Click on Create account")
	public void  Click_on_Create_account() {
		s.create_account();
	}
	
	@And ("user enters valid credentials")
	public void  user_enters_valid_credentials() {
		s.enteringCredentials();
	}
}
