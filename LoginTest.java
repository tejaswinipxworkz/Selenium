package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
	//WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://github.com/");
	//Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("login")).sendKeys("tejaswinip.xworkz@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Tcsteju@13");
	driver.findElement(By.name("commit")).click();
	String acttitle = driver.getTitle();
	String exptitle = "GitHub";
	if(acttitle.equals(exptitle)) {
		System.out.println("Test passed");
	}
	else
	{
		System.out.println("Test failed");
	}
	driver.quit();
	}
	

}
