package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ActiPractice 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public WebDriver driver;
	@Given("open the application")
	public void open_the_application() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
	}

	@When("^enter the password (.*) and (.*)$")
	public void enter_the_password_and(String string, String string2) throws InterruptedException 
	{
		driver.findElement(By.name("username")).sendKeys(string);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(string2);

	}

	@When("click login button")
	public void click_login_button() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@Then("verify the home page")
	public void verify_the_home_page() 
	{
		String title = driver.getTitle();
		String actTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(title, actTitle);
	}


@Given("Home page is verified")
public void home_page_is_verified() throws InterruptedException
{
	driver.manage().window().setPosition(new Point(-500,0));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Settings']/../div[2]/img")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
	

}

@When("Click on user module")
public void click_on_user_module() throws InterruptedException 
{
	String path="C:\\Users\\Admin\\git\\Maven_Project\\ActiTIME\\data";
	driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("file")).sendKeys(path);
}

@Then("Enter the user data")
public void enter_the_user_data() 
{
	System.out.println("Regresion Test is Success full");
}


}
