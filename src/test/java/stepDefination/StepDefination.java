package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class StepDefination {
	static WebDriver driver;
	
    @Given("^User is on the Login Page$")
    public void user_is_on_the_login_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "/Users/abhishekpatel/Desktop/chromedriver");
		driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/login"); 
    }
    
    @When("^User logins in the application with proper username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logins_in_the_application_with_proper_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	 driver.findElement(By.id("email")).sendKeys(strArg1);
         driver.findElement(By.id("pass")).sendKeys(strArg2);
         driver.findElement(By.id("loginbutton")).click();
    }
    
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        driver.getCurrentUrl().compareTo("https://www.facebook.com/");
        System.out.println("Sucessfull");
    }
    
    @And("^profile is displayed \"([^\"]*)\"$")
    public void profile_is_displayed_something(String strArg1) throws Throwable {
        	if(strArg1 == "True") {
        	driver.findElement(By.cssSelector("a[class='_5afe']")).isDisplayed();
        	}
            System.out.println("Profile Dsiplayed:"+strArg1);
        
        
    }

}