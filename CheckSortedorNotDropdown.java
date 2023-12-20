package Practise1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckSortedorNotDropdown {

	
	
	
public static void main(String[] args) throws InterruptedException {
		
	   WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
	
		WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
	 
		Select slct=new Select(dropdown);
	
		List<WebElement> list=slct.getOptions();
		
		System.out.println(list.size());
	
	
	    
	    //take two arraylist original and temp
	    ArrayList originallist=new ArrayList();
	    
	    
	    ArrayList templist=new ArrayList();
	    
	    
	    //adding elemtns in both arraylists
            for (WebElement element : list)
            {
            	originallist.add(element.getText());
            	templist.add(element.getText());
		 
            }
            
           
         
	    System.out.println("Originallist: "+originallist);
	    
	    Collections.sort(templist);//this method sorts
	    
	    System.out.println("Templist after sorting : "+templist);
	    System.out.println();
	    System.out.println();
	    
	    
	    
	    //now comparing original with sorted 
	    if (originallist.equals(templist)) 
	    {
			System.out.println("Dropdown is already Sorted");
		} 
	    
	    else 
	    {
	    	System.out.println("Dropdown is NOT Sorted");
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
}}
