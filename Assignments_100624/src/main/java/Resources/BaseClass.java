package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties pro;
	public String browser;
	public String url;
	
	public WebDriver makeMyTripInitialize() throws IOException {
		
		pro = getProperties();
		 browser = pro.getProperty("browser");
		 url = pro.getProperty("makeMyTripUrl");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return driver;
	}
	
public WebDriver openSourceInitialize() throws IOException {
		
		pro = getProperties();
		 browser = pro.getProperty("browser");
		 url = pro.getProperty("openSourceUrl");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return driver;
	}
	
public WebDriver seleniumInitializer() throws IOException {
	
	pro = getProperties();
	 browser = pro.getProperty("browser");
	 url = pro.getProperty("seleniumUrl");
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	return driver;
}

	public Properties getProperties() throws IOException {
		pro = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\a2z\\eclipse-workspace\\Assignments_100624\\src\\main\\java\\Resources\\data.properties");
		pro.load(file);
		return pro;
	}

}
