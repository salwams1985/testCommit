package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testChrome {

	public static void main(String[] args) {

		String exeChromeFile ="D:\\Programs\\Automation source\\SeleniumDrivers\\chromedriver.exe" ;
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", exeChromeFile);
		
		driver.navigate().to("www.google.com");

	}

}
