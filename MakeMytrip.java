package Practise1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMytrip {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
	
	
	
	WebElement loginbox = null;
		
		try
		{
			   loginbox=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span"));
			if (loginbox.isDisplayed()) 
			{
				loginbox.click();
				
			}
			
		}	
		catch (Exception e) 
		{
		   	}
			
	
		
		Thread.sleep(2000);
		try
		{  //if popu displayed then switch tothat pop up inside the frame
			driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		    driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
            driver.switchTo().defaultContent();
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		
	
	 
	   try {
		   loginbox.click();
	      } 
	   catch (Exception e) 
	       {
	
	       }
	   
	
		driver .findElement(By.xpath("//div[@class=\"flt_fsw_inputBox dates inactiveWidget \"]")).click();//calenderbtn
	
		
	 Test(2024,"November",8);
	
	
	}
	
	
	
	     public static void Test(int Year, String month, int Date) throws InterruptedException
		{
			
			
			String Month1;
			String year1;
			
			String Month2;
			String year2;
		
			
			
			List<WebElement> MOnthYeaTXT=driver.findElements(By.xpath("//div[@class=\"DayPicker-Caption\"]"));

			
				  while (true) 
				  {
				
				      
					   String txt1=MOnthYeaTXT.get(0).getText();
					  
				
					   String  txt2=MOnthYeaTXT.get(1).getText();
				
					 
					   
					   String [] a1=txt1.split(" ");
					   Month1=a1[0];
					   year1= a1[1];
			  
					   
					   
			
					   String [] a2=txt2.split(" ");
					   Month2=a2[0];
					   year2= a2[1];
			  
					   
					   
					   
				int yearint1= Integer.parseInt(year1);
				int yearint2= Integer.parseInt(year2);
					  
					      if (( Month1.equalsIgnoreCase(month)  &&  yearint1==(Year) ) || (Month2.equalsIgnoreCase(month)  &&  yearint2==(Year)))
					      {
							break;
					      } 
					    
					   
					   
					     else 
					     {
						  driver.findElement(By.xpath("//div[2]/div/div[1]/span[2]")).click();
						  
						  MOnthYeaTXT=driver.findElements(By.xpath("//div[@class=\"DayPicker-Caption\"]"));
						
						  }
					   
				            
		   }//while 
				  
				 
				  
				  String Monthtxt;
				  String datetxt;
			  List<WebElement> dates= driver.findElements(By.xpath("//div[@aria-label]"));
			  
			  for (int i = 0; i < dates.size(); i++) 
			  {
				 String txt= dates.get(i).getAttribute("aria-label");				  
		     	String [] a=txt.split(" ");  
		     	  Monthtxt=a[1];
		     	  datetxt=a[2];
		     	int intdatetxt= Integer.parseInt(datetxt);
		     	
		     	if ((month.contains(Monthtxt) && intdatetxt==(Date)) )
		     	  {
		     		 dates.get(i).sendKeys(Keys.PAGE_DOWN);
                      dates.get(i).click();
		     	
		     		break;
				  }
		     	  
		     	  
			  }
			  
			
			
			
			
			
			
			
		}
	
	   
	
	
	
	
		
	}


	
	

