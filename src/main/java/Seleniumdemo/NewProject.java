package Seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/C:/Users/Pranay/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.cricbuzz.com/");
		System.out.println(driver.getTitle());
		

	}

}
