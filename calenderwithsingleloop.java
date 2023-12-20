package Practise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderwithsingleloop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
	  
		
		String Expmonth="Jan";
		String Expyear="2026";
		
		
		WebElement calnedrbox=driver.findElement(By.id("onward_cal"));
		calnedrbox.click();
		
		Thread.sleep(2000);
	
	String txtmonthyear=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
	String [] a=txtmonthyear.split(" ");
    
	String  monthtxt=a[0];
	String  yeartxt=a[1];
	
	
	
	while (!(monthtxt.equals(Expmonth) && yeartxt.equals(Expyear)))
	{
		
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();//nxtbtn
		
		txtmonthyear=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
		String [] a1=txtmonthyear.split(" ");
	    
		  monthtxt=a1[0];
		  yeartxt=a1[1];
	}
	
	
	
	
	
	
	}
	}
