package Step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;

public class FacebookOutline {
	WebDriver driver;

	@Given("User open a {string} browser")
	public void user_open_a_browser(String browsername) {
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equals("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		} else if (browsername.equals("headless")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("headless");
			driver = new ChromeDriver(opt);
		} else {
			System.out.println("Enter valid Browser Name");
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");

	}

	@Given("User enter firstName as {string} and lastName as {string}")
	public void user_enter_first_name_as_and_last_name_as(String fname, String lname) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
	}

	@Given("User Select Date as {string} and Month as {string} and year as {string}")
	public void user_select_date_as_and_month_as_and_year_as(String Day, String Month, String Year) throws InterruptedException {
		WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
		Select selDate = new Select(Date);
		selDate.selectByValue(Day);

		WebElement Mon = driver.findElement(By.xpath("//select[@id='month']"));
		Select selMon = new Select(Mon);
		selMon.selectByVisibleText(Month);
		
		WebElement yea = driver.findElement(By.xpath("//select[@id='year']"));
		Select selyea = new Select(yea);
		selyea.selectByValue(Year);
		Thread.sleep(2000);
		driver.quit();
	}
}
