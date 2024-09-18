package Step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPage {
 static WebDriver driver;
 static String employeeID;
	@Given("open home page")
	public void open_home_page() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@Then("Enter user valid username and password")
	public void enter_user_valid_username_and_password() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

	}
	@Given("click on PIM button")
	public void click_on_pim_button()   {
		 
		driver.findElement(By.xpath("//span[text()='PIM']")).click();	    
	}

	@Then("click add Employee button")
	public void click_add_employee_button()   {
		 
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();	    
	}

	@Then("Enter first name")
	public void enter_first_name() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("x");   
	}

	@Then("Enter last name")
	public void enter_last_name() {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("y");
	}

	@Then("Capture employee ID")
	public void capture_employee_id() {
	
		   employeeID=driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//input")).getAttribute("value");  
	}

	@Then("Click on Save")
	public void click_on_save() {
		System.out.println(employeeID);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}
	@Then("Click on Employee list button")
	public void click_on_employee_list_button() {
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
	}

	@Then("Enter valid Employee id")
	public void enter_valid_employee_id() {
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input")).sendKeys(employeeID);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	}

	@Then("Click on delete button")
	public void click_on_delete_button() {
        System.out.println("Employee with ID " + employeeID + " should be deleted.");
	}

}
