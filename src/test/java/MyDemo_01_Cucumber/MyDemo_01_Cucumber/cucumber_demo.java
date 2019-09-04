package MyDemo_01_Cucumber.MyDemo_01_Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class cucumber_demo {
	WebDriver driver;
	@Given("Application is launched by guest user")
	public void application_is_launched_by_guest_user() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for launch");
		driver= shan.configureDriver("chrome");
		  driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("User clicks on sign In link available")
	public void user_clicks_on_sign_In_link_available() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();

		 driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
		
		
	}

	@When("provides the reqired data in the form")
	public void provides_the_reqired_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("SHANkdAmmuuu");
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("kavi");
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("priya");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pwd123456");
		 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("pwd123456");
			 driver.findElement(By.xpath("//input[@value='Female']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kavi@gmail.com");
		 driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9842299999");
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue("1997");
		driver.findElement(By.linkText("22")).click();
		Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("Aug");
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("148,balajiarcd");
		 Select secDrop=new Select (driver.findElement(By.id("securityQuestion")));
			secDrop.selectByVisibleText("What is your Pet Name?");
		 driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("hhppy");
	
	}
	@Then("user submits the data")
	public void user_submits_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("verifies for the account creation")
	public void verifies_for_the_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println((driver.getTitle()));
		  Assert.assertEquals(driver.getTitle(), "Login");
	}


}
