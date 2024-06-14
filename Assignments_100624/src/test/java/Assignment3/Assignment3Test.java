package Assignment3;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import PageObject.A3LoginPageObject;
import Resources.BaseClass;

public class Assignment3Test extends BaseClass{
	
	WebDriver driver;
	A3LoginPageObject lpo ;
	@BeforeTest
	public void setup() throws IOException {
		driver = openSourceInitialize();
	}
	
	@Test
	public void validateLogin() {
		
		lpo = new A3LoginPageObject(driver);
		lpo.enterUserName();
		lpo.enterPassword();
		lpo.clickOnLogin();
		Assert.assertTrue(lpo.isProfilePictureDisplayed());
		
	}
 
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
