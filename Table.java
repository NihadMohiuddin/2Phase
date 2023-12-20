 package Practise1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;//to scroll down
		 js.executeScript("window.scrollBy(0,100)");
		
		
		 List<WebElement> rows =driver.findElement(By.id("customers")).findElements(By.tagName("tr"));
		
		System.out.println("Rows are "+rows.size());
		
		 List<WebElement> colummns=rows.get(0).findElements(By.tagName("th"));
		
			System.out.println("Coulmns are "+colummns.size());
		     
			int rownum=0;
			int columnsnum=0;
		
			       for (WebElement row : rows)
			       {
					
			    	   List<WebElement> columns= row.findElements(By.tagName("td"));
			    	        rownum++;
			    	        columnsnum=0;
			    	   for (WebElement col : columns)
			    	   {
			    		   columnsnum++;
			    		   String txt=col.getText();
			    		 System.out.print( col.getText()+"   ");
			    		     
			    		   
			    		   if (txt.equals("UK")) 
			    		        {
								   System.out.println(txt +" is present in rows:colum "+rownum+":"+columnsnum);
							    break;
			    		        }
			    		   
			    		  
			    		   
			    		   
					   }
			    	   
				  System.out.println();
			       
			       
			       
			       }
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
