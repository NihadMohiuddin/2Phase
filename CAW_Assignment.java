package Practise1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class CAW_Assignment {

	static WebDriver driver;
	static WebElement TextBox_elem;
	static JSONArray jsonarray;
	
	public static void main(String[] args) throws IOException, ParseException {
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
	
	ClickonTableData();
	Insertdata_andClickOnRefresh();
	AssertingJsondataandUITabledata();
	
	}
	
	
	
	
	
	public static void ClickonTableData() throws IOException, ParseException
	{
		
		WebElement tabledatalink=driver.findElement(By.xpath("//summary[text()=\"Table Data\"]"));
		tabledatalink.click();
		
		
	}
	
	
	
	
	
	public static void Insertdata_andClickOnRefresh() throws IOException, ParseException
	{
		WebElement TextBox=driver.findElement(By.id("jsondata"));
		WebElement Refrshbtn=driver.findElement(By.id("refreshtable"));
		
		
		TextBox.clear();
		System.out.println(GetJsonData());
		TextBox.sendKeys(GetJsonData());
		 Refrshbtn.click();
	}
	
	
	
	
	
	 
	public static String GetJsonData() throws IOException, ParseException 
	{
       String path=System.getProperty("user.dir")+"\\src\\test\\java\\Data.json";
	 
       FileReader fr=new FileReader(path);
	   JSONParser jsonparse=new JSONParser();
	   Object obj=  jsonparse.parse(fr);
	
	   jsonarray=(JSONArray) obj;
	
	   String jsondata=jsonarray.toString();//converting jsonarray to string
	 
	   return jsondata;
	  
	}
	
	
	
	
	
	public static void AssertingJsondataandUITabledata()
	{

		
		
		WebElement table=driver.findElement(By.id("dynamictable"));
		List<WebElement> tablerows=table.findElements(By.tagName("tr"));
	
	
			
			  
			for (int i=1; i<= jsonarray.size() ; i++)
			  {
	          
	    	    List<WebElement> tabledata= tablerows.get(i).findElements(By.tagName("td"));
	            
	    	    String TableGender=tabledata.get(0).getText();
	    	    String StrTableAge=tabledata.get(1).getText();
	    	     Long TableAge= Long.parseLong(StrTableAge);
	    	   
	    	     String TableName=tabledata.get(2).getText();
	    	    
	    	    
				JSONObject obj=(JSONObject) jsonarray.get(i-1);
				
				String jsonName=(String) obj.get("Name");
			    Long jsonAge	=(Long)obj.get("Age");
				String jsonGender=(String)obj.get("Gender");
			
				System.out.println(" ");
	    	
				System.out.print("TableGender is "+TableGender+"  TableAge is "+TableAge+"  TableName is "+TableName );
	    	    System.out.println(" ");
	    	    System.out.print( "JsonGender is "+jsonGender+ " JsonAge is "+jsonAge+ " JsonName is "+jsonName );

	    	   
	    	    assertEquals(TableGender, jsonGender);
	    	    assertEquals(TableAge, jsonAge);
	    	    assertEquals(TableName, jsonName);
	    	    
	    	    
	    	    
			  }
	
			
			
		}
	
		
		
	
		
		
		
		
		
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

