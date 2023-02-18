package steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginsteps {	
	
	WebDriver driver;
	
	@Given("I am on the Orange HRM login page")
	public void i_am_on_the_orange_hrm_login_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 
   
	
      
	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);	
	}
	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

	}
	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium')]")).click();
	}
	@Then("I should see the Orange HRM dashboard")                          
    public void i_should_see_the_orange_hrm_dashboard() {                   
		String text = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals(text,"Dashboard");
		driver.quit();
	} 

	
	@Then("I should see an error message")
	public void i_should_see_an_error_message() {
	   String errorMessage = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
	   Assert.assertEquals(errorMessage, "Invalid credentials");
	   driver.quit();
	}
	
	
	
	
	
	
	
	
	
	/*	
	@When("I enter valid username as Admin")
	public void i_enter_valid_username_as_admin() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}
	@When("I enter valid password as admin123")
	public void i_enter_valid_password_as_admin123() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	}*/
	
	
	/*
	 * @When("I enter Invalid username as Admin") public void
	 * i_enter_invalid_username_as_admin() {
	 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kannan");
	 * 
	 * }
	 * 
	 * @When("I enter Invalid password as admin123") public void
	 * i_enter_invalid_password_as_admin123() {
	 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	 * }
	 */
	
	
	
	
	
	
	
	
	/*
	
	
	WebDriver  driver;

@Given("user us on login page")
public void user_us_on_login_page() {
	WebDriverManager.chromedriver().setup();
	driver1 = new ChromeDriver();
	driver1.get("https://bookcart.azurewebsites.net/");
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	// Write code here that turns the phrase above into concrete actions
    
}
@When("enter invalid username")
public void enter_invalid_username() {
	driver1.findElement(By.xpath("//span[text()='Login']")).click();
    // Write code here that turns the phrase above into concrete actions
    
}
@When("enters invalid password")
public void enters_invalid_password() {
	driver1.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[1]")).sendKeys("kannan");
	driver1.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[2]")).sendKeys("password");
    // Write code here that turns the phrase above into concrete actions
   
}
@Then("it should be not allow to login")
public void it_should_be_not_allow_to_login() {
    // Write code here that turns the phrase above into concrete actions
	driver1.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
    
}*/

}
