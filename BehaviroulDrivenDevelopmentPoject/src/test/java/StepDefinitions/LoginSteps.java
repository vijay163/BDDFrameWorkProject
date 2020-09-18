package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{
	@Given("user is on Login page")
	public void user_is_on_login_page() 
	{
		System.out.println("Its From Given Method");
	}

	@When("User Enter UserName And Password")
	public void user_enter_user_name_and_password() 
	{
		System.out.println("Its From When Method");
	}

	@When("click on Login button")
	public void click_on_login_button() 
	{
		System.out.println("Its from When or And");
	}

	@Then("User is Navigated To the HomePage")
	public void user_is_navigated_to_the_home_page() 
	{
		System.out.println("Its Then MEthod	");
	}


}
