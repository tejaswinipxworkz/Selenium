package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Wikipedia_MultipleWindows 
public class MultipleWindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id ='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		
		System.out.println("Number of Links:"+ searchlinks.size());
		
//	List<WebElement> Links =driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
//	System.out.println("Number of suggestions : "+Links.size());
	for(WebElement link :searchlinks ) {
		System.out.println("Pages : "+link.getText());
		link.click();
	}
	}

}
