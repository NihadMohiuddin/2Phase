package Practise1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender1 {
public static void main(String[] args) {
	
	
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("http://flights.qedgetech.com/user/nihad.html");
    
	//login id
	driver.findElement(By.name("email")).sendKeys("md.Nihadm@gmail.com");
	driver.findElement(By.name("password")).sendKeys("allahu786");
	driver.findElement(By.xpath("//button[contains(text(),\"Sign In\")]")).click();
	
	
	driver.findElement(By.id("search-date")).click();
	
	
	
	  String Expcmonth="September";
      String Expcyear="2025";
	
	
	           //in qedge two while loop first year and then month
	               
	             
	             	
	
                //*******************With single while loop putting true in while  by sdet*****************************************
	
	                while (true)
	                {    
	                	
	                	   String fulltxtmonthyear=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
	                		
	    	            
	    	               String[] a= fulltxtmonthyear.split(" ");
	    	
	    	               String monthtxt=a[0];
	    	               String yeartxt=a[1];
	                	
		
	                	if (monthtxt.equals(Expcmonth) && yeartxt.equals(Expcyear))
	                		
	                	{
							break;
						} 
	                	
	                	else 
						{         //if not equal click on next btn
                                 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
						}
	                	
	                }
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
