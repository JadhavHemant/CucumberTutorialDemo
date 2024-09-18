package Step;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmDataTable {
	static WebDriver driver;
	@Given("User open browser as {string}")
	public void user_open_browser_as(String browsername) {
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}	   
		else if(browsername.equals("headless")) {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("headless");
			driver=new ChromeDriver(opt);
		}
		else if(browsername.equals("incognito")) {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--incognito");
			driver=new ChromeDriver(opt);
		}
		else {
			System.out.println("Enter valid Browsername");
		}
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password(DataTable dataTable) {
	    List<List<String>> list=dataTable.asLists();
	    String username=list.get(0).get(0);
	    String password=list.get(0).get(1);
	 
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@Then("user Click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
				Thread.sleep(5000);
				driver.quit();
	}


}
