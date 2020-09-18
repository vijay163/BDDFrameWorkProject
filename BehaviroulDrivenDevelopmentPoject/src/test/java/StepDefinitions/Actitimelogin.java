
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Actitimelogin 
{
	public WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}

	@Given("Swith to login Page")
	public void swith_to_login_page()
	{
		driver.get("http://localhost/login.do");
	}

	@When("User Enter UserName and Password")
	public void user_enter_user_name_and_password() 
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

	}

	@When("click Enter")
	public void click_enter() 
	{
		driver.findElement(By.xpath("//a[text()='Login']")).sendKeys(Keys.ENTER);

	}

	@Then("User is in homePage")
	public void user_is_in_home_page()
	{
		String title="actiTIME - Enter Time-Track";
		String actual = driver.getTitle();
		Assert.assertEquals(title, actual);
        System.out.println("tilt is matched::"+title);				

	}


}
