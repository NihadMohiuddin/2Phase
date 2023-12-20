package Practise1;
import java.time.Duration;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class ShadowDOM {
	
	
	
	
public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://books-pwakit.appspot.com/");
	//*Dont use xpath 
	// * remaing anything locators can be used
	
	
	
	
	//To access inside shadow dom or root we must use Javascriptexecutor with shadowdom method and in this method  give the shadow host

	//host which is present immeditly above the shadowroot is host
	WebElement host= driver.findElement(By.xpath("/html/body/book-app"));
	
	SearchContext  root  = host.getShadowRoot();
	root.findElement(By.cssSelector("[id='input']")).sendKeys("Nihad");
	


	
}}





/*
public static void main(String[] args) throws InterruptedException {
	
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://shop.polymer-project.org/");
	
	
			
		WebElement host =driver.findElement(By.tagName("shop-app"));
			
		SearchContext root1 =host.getShadowRoot();
			
			//ladies outwear  link at header tab
		List<WebElement>list=  root1.findElement(By.cssSelector("shop-tabs")).findElements(By.tagName("a"));
		list.get(1).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			//to click on men SHOP NOW btn this host is presnt in 1stroot
			WebElement host2 =root1.findElement(By.name("home"));
			SearchContext root2 =host2.getShadowRoot();
			
			root2.findElement(By.cssSelector("[aria-label=\"Men's Outerwear Shop Now\"]")).click();
		
			
			
			
			
			
			
			
			
			
			
			
			
			
}















	
	
	
}

*/
