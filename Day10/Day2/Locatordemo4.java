package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//css with tag and id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac book");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mac book");
		
		//css with tag and class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mac book");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Mac book");

		//css with tag and attribute
		//driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("Mac book");
		//driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys("Mac book");
		
		//css with tag, class and attribute
		//driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("Mac book");
		//driver.findElement(By.cssSelector(".search-box-text[name=\"q\"]")).sendKeys("Mac book");

		
	}

}
