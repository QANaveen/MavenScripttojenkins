package project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateBasicElements {
	
	@Test
	public void hyperlink() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement home = driver.findElement(By.xpath("//a[@link='blue' and @href='../home.html'] [@style=\"color: #CC0000\"]"));
		home.click();
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image' and @src='images/link.png']")).click();
	    Thread.sleep(2000);
	    WebElement findthelink = driver.findElement(By.xpath("//a[@style='color:green']"));
	    String linkname = findthelink.getAttribute("href");
	    System.out.println(linkname);
	    Thread.sleep(2000);
	    WebElement brokenlink = driver.findElement(By.xpath("//a[@href='error.html']"));
	    brokenlink.click();
	    String title = driver.getTitle();
	    if(title.contains("404"))
	    {
	    	System.out.println("broken link");
	    }
	    Thread.sleep(2000);
	    driver.navigate().back();
	    
	    WebElement home1 = driver.findElement(By.xpath("//a[@link='blue' and @href='../home.html'] [@style=\"color: #CC0000\"]"));
		home1.click();
		Thread.sleep(2000);
		  driver.navigate().back(); 
		  
		List<WebElement> count = driver.findElements(By.tagName("a"));
		int size = count.size();
		System.out.println(size);
		
		
	}

}
