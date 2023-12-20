package Practise1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutocompleteteGooglePlacesDRopdwon {

	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		
		
		
		
	      WebElement box=	driver.findElement(By.id("autocomplete"));
	      box.clear();
	
		  box.sendKeys("American");
		  String value= box.getAttribute("value");
	    	

		  while (value!=null)
		   {
				
				if (value.contains("American Fork"))
	    		{
					box.sendKeys(Keys.ENTER);
				System.out.println(value+" is clicked");
					break;
				}
			
				else 
			   {
				box.sendKeys(Keys.ARROW_DOWN);
				value= box.getAttribute("value");
				
			   }
		   
		   
		   
		   }
		
		
		
		
		
		
		
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

