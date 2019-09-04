package bdcstepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class bgmdemo {
	WebDriver driver;
	@Given("user has a valid credentials")
	public void user_has_a_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver= shan1.configureDriver("chrome");
		  driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
	}

	@Given("user enters the credentials to the login page")
	public void user_enters_the_credentials_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shangaviraji@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("s9677365295");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Then("user verifies the login")
	public void user_verifies_the_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println((driver.getTitle()));
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
		  
	}
	

	@Given("user selects electronics")
	public void user_selects_electronics() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		 WebElement search= driver.findElement(By.xpath("//input[@type='text']"));
			search.sendKeys("S");
		 search.sendKeys("m");
		 search.sendKeys("a");
		 search.sendKeys("r");
		 search.sendKeys("t");
		 
		 search.sendKeys("p");
		 search.sendKeys("h");
		 search.sendKeys("o");
		 search.sendKeys("n");
		 search.sendKeys("e");
		 
		
	}

	@Given("user selects cellphone in it")
	public void user_selects_cellphone_in_it() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
		  driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
	@Then("user add the smart phone to the cart")
	public void user_add_the_smart_phone_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
	// search.sendKeys("e");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}

	@Given("user selects apparel&shoes")
	public void user_selects_apparel_shoes() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		WebElement search= driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("B");
	 search.sendKeys("l");
	 search.sendKeys("u");
	 search.sendKeys("e");
	 search.sendKeys(" ");
	 search.sendKeys("J");
	 search.sendKeys("e");
	 search.sendKeys("a");
	 search.sendKeys("n");
	 search.sendKeys("s");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Given("user add the blue jean to the cart")
	public void user_add_the_blue_jean_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		 // driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
	}

}
