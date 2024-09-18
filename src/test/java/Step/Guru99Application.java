package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Guru99Application {

	static WebDriver driver;
	@Given("User is on Regsiter Page")
	public void user_is_on_regsiter_page() {
	    driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    
	}

	@When("User Eneter Contact information first Name as {string} and last Name as {string}  and Phone Number as {string} and Email as {string}")
	public void user_eneter_contact_information_first_name_as_and_last_name_as_and_phone_number_as_and_email_as(String fname, String lname, String phone, String email) {
	   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	   driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
	   driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
	   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(email);
	}
	
	@When("User Enter mailing information as {string}  and city as {string} and state as {string} postalcode as {string} and Countrt as {string}")
	public void user_enter_mailing_information_as_and_city_as_and_state_as_postalcode_as_and_countrt_as(String addre, String city, String state,  String postal,String contry) {
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(addre);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		 driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		   driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postal);
		   WebElement cont=driver.findElement(By.xpath("//select[@name='country']"));
		   Select sel =new Select(cont);
		   sel.selectByVisibleText(contry);
	}
	@When("user enter user information {string} and {string} and {string}")
	public void user_enter_user_information_and_and(String username, String password, String confirmPassword) {
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmPassword);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    driver.quit();
	}
}
