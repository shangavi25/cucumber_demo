package bdcstepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class shan1 {

	public static WebDriver configureDriver(String browserName) {
		WebDriver driver= null;
		if(browserName.equals("explorer"))
		{ System.setProperty("webdriver.ie.driver", 
				  "C:\\Users\\training_b6b.01.07\\Downloads\\eclipse-java-oxygen-3a-win32-x86_64\\ide\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		}
		else if(browserName.equals("chrome"))
		{System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\training_b6b.01.07\\Downloads\\eclipse-java-oxygen-3a-win32-x86_64\\chrome\\chromedriver.exe");
		  driver=new ChromeDriver(); }
		else if (browserName.equals("firefox"))
		{System.setProperty("webdriver.gecko.driver", 
				  "C:\\Users\\training_b6b.01.07\\Downloads\\eclipse-java-oxygen-3a-win32-x86_64\\firefoxx\\geckodriver.exe");
		  driver=new FirefoxDriver(); }
		
		
		return driver;
		
	}
}


