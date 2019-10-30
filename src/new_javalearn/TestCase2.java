package new_javalearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		
		//Create a driver object for firefox class
		//we will strictly implement methods of webdriver
		
		System.out.print(System.getProperty("users.dir"));
	    System.setProperty("webdriver.gecko.driver","/Users/mohitsati/testing" + "/geckodriver");
		
		WebDriver driver=new ChromeDriver();//give webdriver knowldge to 
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle())
		;

	}

}
