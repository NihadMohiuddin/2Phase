package Practise1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opennewTABandWINdow {
	
	
public static void main(String[] args) {
	
	
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.redbus.in/");
	
  
	
	//Opens new tab 
	//driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://mvnrepository.com/artifact/com.google.appengine/appengine-api-1.0-sdk");

	
	
	//Opens new window 
	//driver.switchTo().newWindow(WindowType.WINDOW);

	driver.get("https://www.youtube.com/watch?v=3x7nf3tZ05w&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=28");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
