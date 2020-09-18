package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public WebDriver driver;
	@Given("Browser Is opened")
	public void browser_is_opened()
	{
		
	    driver=new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	    
	}

	@When("User is On google Search Page")
	public void user_is_on_google_search_page() throws InterruptedException 
	{
		
		Thread.sleep(3000);
	    String title = driver.getTitle();
	    System.out.println("Title is::::"+title);
	}

	@When("Enter text")
	public void enter_text() throws InterruptedException 
	{
		driver.findElement(By.name("q")).sendKeys("automation stepbystep",Keys.ENTER);
	    Thread.sleep(3000);
	}
	public List<WebElement> text;

	@When("Click Enter")
	public void click_enter() 
	{
		 text = driver.findElements(By.xpath("//b"));	
		System.out.println(text.size()+"number of links present:::");
	    
		
	}

	@Then("validate the All the Links")
	public void validate_the_all_the_links() throws InterruptedException 
	{
		System.out.println("Linkes Are::::");
		Thread.sleep(3000);
		for(WebElement t:text)
	    {
	    	System.out.println(t.getText());
	    }
		
	}



}
