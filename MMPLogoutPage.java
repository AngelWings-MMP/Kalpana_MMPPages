package MMPPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MMPLogoutPage {
	WebDriver driver;
	WebDriverWait wait;
	
	MMPLogoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void logout()
	{
		wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))).click();
		driver.close();
	}
}
	

