package Practise1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableTest {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://letcode.in/table");//URL   
		/*
		 * 
		 * Write the code to print the “number of rows” for the below table from the link
            provided by using selenium python or Java. (it must be executable code).
                a. Without using for loop
                b. Without using incrementation
                c. Just try to do it using selenium locators		  *                                              
	
		*/
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
		
		
		
//List<WebElement> tablecolumns=	driver.findElements(By.xpath("//table[@id=\"simpletable\"]//tr/th"));
		
//List<WebElement> tabledata=	driver.findElements(By.xpath("	//table[@id=\"simpletable\"]//tbody//tr/td"));
		
		
List<WebElement> tablerows=	driver.findElements(By.xpath("//table[@id=\"simpletable\"]//tbody/tr"));
		
    
		//System.out.println("total no of data in a Table are : "+tabledata.size());
		
		//System.out.println("No of Columns in a Table are : "+tablecolumns.size());
		
		System.out.println("No of rows in a Table are : "+tablerows.size());
	
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
