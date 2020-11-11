package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	

	 WebDriver driver;

	 @Given("^user is already on login page$")
	 public void user_is_already_on_login_page()
	 {
 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\chromedriver.exe");  
		 driver = new ChromeDriver();
		 
		 driver.get("https://classic.crmpro.com");
	 }
	 
	 @When("^title of login page is Free CRM$")
	 
	 public void title_of_login_page_is_Free_CRM()
	 {
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	 }
	 
	 
	
	 
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password() 
	 {
		 driver.findElement(By.name("username")).sendKeys("batchautomation");
		 driver.findElement(By.name("password")).sendKeys("Test@12345");
	 }
	 
	 
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button()
	 {
		 WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();", loginBtn);
	    	
	 }
	 
	 @Then("^user is on home page$")
	 public void user_is_on_home_page()
	 
	 {
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("CRMPRO", title);
	 }
	 
}