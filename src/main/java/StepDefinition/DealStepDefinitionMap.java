package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepDefinitionMap {


	WebDriver driver;

	@Given("^User is already on login page$")
		public void User_is_already_on_login_page() {

			System.setProperty("webdriver.chrome.driver", "/C:/Users/Pranay/Downloads/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.freecrm.com/index.html");
		}

	@When("^Title of login page is Facebook$")
		public void title_of_login_page_facebook() {
			String title = driver.getTitle();
			System.out.println(title);

			Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);

		}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enters_and(String username, String password) throws Throwable {
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(5000);

		}

	@Then("^user clicks on facebook$")
		public void user_clicks_on_facebook() {
			WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", loginBtn);

		}

	@Then("^User enters username and password$")
		public void user_enters_username_and_password(DataTable credentials) throws InterruptedException {
			//Map data = credentials.asMaps(String.class, String.class);
		
		List<List<String>> data = credentials.raw();
			driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
			driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
			Thread.sleep(5000);

		}

	@Then("^User enters the deals details$")
		public void user_enters_the_deals_details(DataTable deal) {
			List<List<String>> details = deal.raw();

			driver.switchTo().frame("mainpanel");
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[5]/a"))).build().perform();
			driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[5]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys(details.get(0).get(0));
			driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys(details.get(0).get(1));
			driver.findElement(By.xpath("//*[@id=\"probability\"]")).sendKeys(details.get(0).get(2));
			driver.findElement(By.xpath("//*[@id=\"prospectForm\"]/table/tbody/tr[1]/td/input[1]")).click();
		}

	@And("Close the Browser")
		public void Close_the_browser() {
			driver.close();
		}

}

