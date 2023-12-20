package Practise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestdropdown1 {

	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bing.com/");
		Thread.sleep(2000);
	    driver.findElement(By.id("sb_form_q")).sendKeys("Java");
	    Thread.sleep(2000);
	
	   WebElement dropdwon= driver.findElement(By.xpath("//ul[@id=\"sa_ul\"]"));
	   List<WebElement> list = dropdwon.findElements(By.tagName("li"));
	 
	   System.out.println("Total items in a list are "+  list.size());
	   System.out.println();
	

	   
	                for (int i = 0; i < list.size(); i++)
	               {
		
	                    String txt=	list.get(i).getText();
	                	System.out.println(txt);
	             
	                        if (txt.toLowerCase().contains("java jdk"))
	                       	
	                        {
	                        	list.get(i).click();
	                        	break;
					        } 
	                       
	                       
	               }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
}