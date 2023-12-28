package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
      driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Kurti");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div[1]/div/svg")).click();
	}

}
