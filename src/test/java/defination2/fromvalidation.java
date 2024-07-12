package defination2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fromvalidation {
	 WebDriver driver;
	
	
	
	@Given("open the simple form website")
	public void open_the_simple_form_website() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
	    driver.get("https://v1.training-support.net/selenium/simple-form");
	    driver.manage().window().maximize();
	}

	@When("enter the firstname,lastname,email,contact number")
	public void enter_the_firstname_lastname_email_contact_number() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("firstName")).sendKeys("masai");
		driver.findElement(By.id("lastName")).sendKeys("sachool");
		driver.findElement(By.id("email")).sendKeys("masai@yahoo.com");
		driver.findElement(By.id("number")).sendKeys("7411849067");
	}

	@When("enter the messsage")
	public void enter_the_messsage() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//textarea[@rows=\"2\"]")).sendKeys("well come to Masai school");
	}

	@Then("sumbit the form")
	public void sumbit_the_form() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
}
