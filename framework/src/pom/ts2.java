package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ts2 {
	
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 ts1 exmp = new ts1(driver);
		 exmp.login_btn();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 exmp.login_btn();
		 
		 
		 
		 
		
	}
	

}
