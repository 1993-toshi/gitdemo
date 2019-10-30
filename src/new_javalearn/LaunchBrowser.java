package new_javalearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
	
	System.out.print(System.getProperty("users.dir"));
	System.setProperty("webdriver.chrome.driver","/Users/mohitsati/eclipse-workspace/SeleniumLearning" + "/chromedriver");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 driver.get("https://www.google.com/");
}
}
