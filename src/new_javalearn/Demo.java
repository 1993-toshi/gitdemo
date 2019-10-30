package new_javalearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium code-writing
		
        //create driver object for chrome browser
		//we will strictly implement method of webdriver(interface provide all method to automate)
		//once driver object is created we will implement methods of webdriver
    	/*Class name =X;now place Chromdriver instead of X
	
		X driver=new X()
	   */	
	    //driver is an object name
		//syntax for creating object for class x
		//new creates memory for object
		System.out.print(System.getProperty("users.dir"));
		System.setProperty("webdriver.chrome.driver","/Users/mohitsati/eclipse-workspace/SeleniumLearning" + "/chromedriver");
		//chromedriver class will find property go to path & invoke the chrome driver 
	     WebDriver driver=new ChromeDriver();//give class the webdriver knowledge to object to automate each & every UI
		 //Invoke .exe file to open browser
	     driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());//validate whether landed in current url
	    System.out.println(driver.getPageSource());
		//to get page source 
		}

}
