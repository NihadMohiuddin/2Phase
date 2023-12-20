package Practise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Size_Location_CookiesiofElment {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	///	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.apple.com/in/?afid=p238%7Cs8Vs8GkTq-dc_mtid_187079nc38483_pcrid_645364328155_pgrid_112258962467_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
		
	
	
	WebElement pic=driver.findElement(By.xpath("/html/body/main/section[2]/div[1]/div/div/a"));
		
	System.out.println(pic.getSize());//(1263, 594)
	
	    int height=pic.getSize().getHeight();
		System.out.println("Height is "+height);   //Height is 594
		
		int width=pic.getSize().getWidth();
		System.out.println("Width is "+width);    //Width is 1263
	
		
		
		
	
		System.out.println(	pic.getLocation());  //(0, 44)
		
		int Xcoordinate=pic.getLocation().getX();
		System.out.println(Xcoordinate);      //0
		
		int Ycoordinate=pic.getLocation().getY();
		System.out.println(Ycoordinate);      //44
		
		//*******************************************************************************************************************************
		  
		//to print all cookies wiht methid getname()
		java.util.Set<Cookie> set=	driver.manage().getCookies(); //return type is cookie of set
		
		System.out.println("Size of cookies are "+set.size());
		
		System.out.println();
		System.out.println();
		
		
		
		for (Cookie cookie : set)                             
		    {
		            String txtcookies= cookie.getName();
	                System.out.println(txtcookies);
		    
		    }
		
		
        //add cookie object and then add cookie
		Cookie cokie=new Cookie("nameofcookie", "gfhdghjdghdg");
	      
		driver.manage().addCookie(cokie);         
	
	    driver.manage().deleteCookieNamed("nameofcookie");   //to delte  cookie using name
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
}
}
