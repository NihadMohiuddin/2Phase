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

public class opennewtabinYoutube {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.youtube.com/");
	
	Thread.sleep(2000);
	WebElement box=driver.findElement(By.xpath("//input[@id=\"search\"]"));
	
	box.click();
	box.sendKeys("allahu");
	
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@class=\"sbsb_b\"]//li//div[@class=\"sbqs_c\"]"));
	

	
      	for (int i = 0; i < list.size(); i++) 
	   {
		
		String txt=list.get(i).getText();
		System.out.println(txt);
		
	   }
	
      	box.sendKeys(Keys.ENTER);
	
	
      	
     ///
      	
      	
  // WebElement  firstthumbnail =driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-image/img"));
      
   WebElement  secondthumbnail =driver.findElement(By.xpath("html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[2]/div[1]/ytd-thumbnail/a/yt-image/img"));
       	
      	
     	Actions act=new Actions(driver);
      	act.contextClick(secondthumbnail).perform();
      	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();//right cliks on elemnt and arrows down to navigate to "open in new tab" in context window
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
}
	
}
