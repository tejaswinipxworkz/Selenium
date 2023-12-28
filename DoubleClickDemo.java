package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
    	
		WebElement f1 =	driver.findElement(By.xpath("//input[@id='field1']"));
	    f1.clear();
	    f1.sendKeys("Welcome");
	    
	    WebElement doubleclick = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	
     	Actions act = new Actions(driver);
	    act.doubleClick(doubleclick).perform();
	    
	    WebElement f2 =  driver.findElement(By.xpath("//input[@id='field2']"));
	    System.out.println("Field2 value : "+ f2.getAttribute("value"));
	    
	    String copiedText =  f2.getAttribute("value");
	    if(copiedText.equals("Welcome")) {
	    	System.out.println("Login passed");
	    }else {
	    	System.out.println("Login failed");
	    }
	    driver.quit();
	
	  
	}

}
