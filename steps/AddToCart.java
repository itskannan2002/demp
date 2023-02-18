package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
	
	WebDriver driver;
	
	@Given("user opening the website")
	public void userOpeningTheWebsite() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	     driver.get("https://bookcart.azurewebsites.net/login");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("login with {string} and {string}")
	public void loginWithAnd(String username, String password) {
		driver.findElement(By.xpath("//input[@data-placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	     
	}

	@When("search the {string}  in search page  and add to cart")
	public void searchTheInSearchPageAndAddToCart(String product) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys(product);
		driver.findElement(By.cssSelector("span.mat-option-text")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-raised-button')]//span)[1]")).click();	}

	@Then("check the product is added")
	public void checkTheProductIsAdded() throws InterruptedException {
		Thread.sleep(2000);
	     String cartsize = driver.findElement(By.id("mat-badge-content-0")).getText();
	     Assert.assertEquals(Integer.parseInt(cartsize)>0, true);
	     driver.quit();
	     
	}
}
