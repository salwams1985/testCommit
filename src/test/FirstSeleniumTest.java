package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Programs\\Automation source\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("www.google.com");
		
		openChromeDriver();

	}
	
	public static void openChromeDriver() {
		String exeChromeFile ="D:\\Programs\\Automation source\\SeleniumDrivers\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", exeChromeFile);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("www.google.com");
	}

}
