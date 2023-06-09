package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LogInPage;

public class LogInDefPage {
	LogInPage login = new LogInPage();
	
	@Given("user launch site url")
	public void login() {
		login.login_site_url();
	}
	
	@When("accept all cookies")
	public void accept_all_cookies() {
		login.accept_all_cookies();
	}
	
//	@And("select country")
//	public void select_country() {
//		login.select_country();
//	}
	
	
	@And("age verification")
	public void age_ver() {
		login.age_ver();
	}

	@And("go to account")
	public void go_to_account(){
		login.go_to_accounts();
	}
	
	@And("go to signin or register")
	public void go_to_login(){
		login.go_to_login();
	}
	
	@And("enter valid email and password")
	public void enter_valid_email_and_password() {
	    login.enter_valid_email_and_password();
	}
	
	@And("click login")
	public void click_login() {
		login.click_login();
	}
	
//	@Then("validate login")
//	public void validate_login() {
//	   login.validate_login();
//	}
	
//	@And("close the browser")
//	public void close_browser(){
//		login.close_browser();
//	}
}
