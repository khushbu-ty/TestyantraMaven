package typroject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_01 {
	
	@Test
	public void testone()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		String title=driver.getTitle();
		Reporter.log(title,true);
		driver.close();
		
		
	}

}
