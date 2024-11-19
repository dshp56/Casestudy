package Base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testBase {

	private static testBase testBase;
	private static WebDriver driver;
	public static Properties prop;
	
	private testBase() {
		String strBrowser = "Chrome";
		
		if(strBrowser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
				System.out.println("Init driver..."+driver);
			}
		else if(strBrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();;
		System.out.println("Driver Obj..."+driver);
	}
	public static void initDriver() {
		if (testBase == null) {
			testBase = new testBase();
		}
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void OpenUrl(String url) {
		driver.get(url);
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		testBase = null;
	}
}
