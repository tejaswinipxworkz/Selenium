package Day9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabAndWindowDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=16857846764675749753&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.flipkart.com/account/login?ret=/");
	}

}
