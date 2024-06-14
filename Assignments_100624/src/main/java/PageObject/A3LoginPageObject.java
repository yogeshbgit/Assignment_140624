package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A3LoginPageObject {
	
	WebDriver driver;
	
	public A3LoginPageObject(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(.,'Username')]")
	WebElement getUserName;
	
	@FindBy(xpath="//p[contains(.,'Password')]")
	WebElement getPassword;

	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//img[@alt='profile picture']")
	WebElement profilePicture;
	
	
	public boolean isProfilePictureDisplayed(){
		return profilePicture.isDisplayed();
		
		
	}
	
	public void enterUserName() {
		String sysuserName = getUserName.getText().split(":")[1].trim();
		userName.sendKeys(sysuserName);
	}
	
	public void enterPassword() {
		String syspassword = getPassword.getText().split(":")[1].trim();
		password.sendKeys(syspassword);
	}
	
	public void clickOnLogin() {
		loginButton.click();
		
	}
	
	
}
