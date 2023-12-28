package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
	List<WebElement> count = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]"));
    System.out.println("The number of suggestions : "+count.size());
    
    
   /* //Get all suggestions
        for(int i=0; i<count.size(); i++) {
    	System.out.println(count.get(i).getText());*/
    
    
    
 /*  for(WebElement suggestioncount : count) {
   System.out.println(suggestioncount.getText());*/
    	
   for(int i=0;i<count.size(); i++) {
	String text = count.get(i).getText();
	if(text.equals("selenium testing"))
	{
		count.get(i).click();
		}
	}
    	
    	driver.quit();
   
        
    }

}