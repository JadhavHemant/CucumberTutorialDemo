package Step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;

public class FacebookParameters {
	static WebDriver driver;

	@Given("user open {string} browser")
	public void user_open_browser(String Browsename) {
		if (Browsename.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browsename.equals("edge")) {
			driver = new EdgeDriver();
		} else if (Browsename.equals("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		} else if (Browsename.equals("headless")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("headless");
			driver = new ChromeDriver(opt);
		}
		driver.get("https://www.facebook.com/reg");

	}

	@Given("user enter first name as {string} and last name as {string}")
	public void user_enter_first_name_as_and_last_name_as(String Fname, String Lname) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Fname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Lname);

	}

	@Given("use select bith date {int} and month is {string} and year {int}")
	public void use_select_bith_date_and_month_is_and_year(Integer Day, String Month, Integer Year)
			throws InterruptedException {

		System.out.println(Day + "" + Month + "" + Year);

		// For Day
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select sel = new Select(day);
		String date = Day.toString();
		sel.selectByValue(date);
		List<WebElement> wb = driver.findElements(By.name("birthday_day"));

		for (WebElement element : wb) {
			System.out.println(element.getText());
		}

		// For Month

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));

		Select monthSel = new Select(month);

		monthSel.selectByVisibleText(Month);

		List<WebElement> months = driver.findElements(By.id("month"));

		for (WebElement a : months) {
			String b = a.getText();
			System.out.println(b);
		}

		// For Year

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select selYear = new Select(year);
		String years = Year.toString();
		selYear.selectByVisibleText(years);

		List<WebElement> yearslist = driver.findElements(By.xpath("//select[@name='birthday_year']"));

		for (WebElement y : yearslist) {
			String list = y.getText();
			System.out.println(list);
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
