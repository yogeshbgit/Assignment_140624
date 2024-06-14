package Assignment2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import Resources.BaseClass;

public class Assignment2Test extends BaseClass{
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException {
		driver=makeMyTripInitialize();
	}
	
	@Test
	public void validateURL() {
		String expectedUrl = url;
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
