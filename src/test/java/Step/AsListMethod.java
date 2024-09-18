package Step;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AsListMethod {
	static WebDriver driver;

	@Given("user is login page")
	public void user_is_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password(DataTable dataTable) {
		List<List<String>> list = dataTable.asLists();

		String uname = list.get(0).get(0);
		String pass = list.get(0).get(1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
				Thread.sleep(5000);
				driver.quit();
	}

}
