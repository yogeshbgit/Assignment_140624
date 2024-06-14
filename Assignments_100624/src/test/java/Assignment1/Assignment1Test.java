package Assignment1;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Resources.BaseClass;

public class Assignment1Test extends BaseClass{
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException{
		driver = makeMyTripInitialize();
	}
	
	@Test
	public void validateTitle() {
		String expectedUrl = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		String actualUrl = driver.getTitle();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
