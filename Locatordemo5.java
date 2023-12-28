package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo5 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
	
		String Productname = driver.findElement(By.xpath("//a[@title='Show products in category Electronics'][normalize-space()='Electronics']")).getText();
		System.out.println(Productname);
		// TODO Auto-generated method stub
		//a[@title='Show products in category Electronics'][normalize-space()='Electronics']
	}

}
