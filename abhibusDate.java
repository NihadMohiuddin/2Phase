package Practise1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abhibusDate {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		
		driver.findElement(By.id("datepicker1")).click();
		
		String ExpMonth="December";
		String  ExpDate= "8";
		
		
		List<WebElement> monthtxt=driver.findElements(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
		
		
		List<WebElement> Month=	driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]"));

		//or 
		
		if (ExpMonth.equalsIgnoreCase("November")) 
		{
			
			List<WebElement> dates1	=	Month.get(0).findElements(By.tagName("td"));
	
			for (WebElement date : dates1)
			{
				
				if (date.getText().equals(ExpDate))
                  {
					date.click();
					break;
					
				  } 
			}
			
		} 
		
		//if month is  december
		else 
		{
			List<WebElement> dates2	=	Month.get(1).findElements(By.tagName("td"));
			  
			for (WebElement date : dates2)
			{
				
				if (date.getText().equals(ExpDate))
                  {
					date.click();
					break;
					
				  } 
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


