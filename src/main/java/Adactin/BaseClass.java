package Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
		}
		return driver;
	}

	public static void urllaunch(String url) {
		driver.get(url);
	}
	
	public static void input(WebElement email,String value) {
		email.sendKeys(value);

	}
	
	public static void button(WebElement email) {
		email.click();
	}
	
}
