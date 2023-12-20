package Practise1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablePriceCount {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://letcode.in/table");
		
		List<WebElement> prices=driver.findElements(By.xpath("//table[@id=\"shopping\"]//tbody//td[2]"));
		
		
		//tottal sum element
		String totalsum=driver.findElement(By.xpath("//*[@id=\"shopping\"]/tfoot/td[2]/b")).getText();
		  
		//convertins string to int
		int totalvalue = Integer.parseInt(totalsum);
		  
		   
	
		
		int i=0,sum=0;
		for (WebElement webElement : prices) 
		{
			
			String price=webElement.getText();
	          i=Integer.parseInt(price);
	          sum+=i;
	         
	          //or  sum=sum+i;
	                  
		
		}
		
		System.out.println("total isssss "+sum);
		
		
		if (totalvalue==sum)
		
		{
			System.out.println("PASS");
		} 
		else 
		{
			System.out.println("FAIL");
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
