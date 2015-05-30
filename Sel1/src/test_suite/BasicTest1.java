package test_suite;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;

public class BasicTest1 {

	public static void main(String[] arg){
		//Selenium code
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}
}
