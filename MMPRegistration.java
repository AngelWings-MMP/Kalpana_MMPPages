package MMPPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MMPRegistration {
	WebDriver driver;
	WebDriverWait wait;

	MMPRegistration(WebDriver driver)
	{
		this.driver = driver;
	}

	public String[] Register() throws InterruptedException
	{
		String[] PageTitles = new String[2];
		
		driver.findElement(By.xpath("//ul[@id='navigation']//a[text()='Patient Login']")).click();
		driver.findElement(By.xpath("//*[@id='testimonials']//a[text()='Register']")).click();
		
		PageTitles[0] = driver.getTitle();
		
		driver.findElement(By.id("firstname")).sendKeys("HaarikaM");
		driver.findElement(By.id("lastname")).sendKeys("SeleniumM");
		driver.findElement(By.id("datepicker")).sendKeys("06/31/1992");
		driver.findElement(By.id("license")).sendKeys("12345678");
		driver.findElement(By.id("ssn")).sendKeys("123-45-6783");
		driver.findElement(By.id("state")).sendKeys("NC");
		driver.findElement(By.id("city")).sendKeys("Bloomington");
		driver.findElement(By.id("address")).sendKeys("Abc Lane");
		driver.findElement(By.id("zipcode")).sendKeys("28117");
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("height")).sendKeys("170");
		driver.findElement(By.id("weight")).sendKeys("120");
		driver.findElement(By.id("email")).sendKeys("HaarikaM@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium123");
		driver.findElement(By.id("username")).sendKeys("Haarika10");
		driver.findElement(By.id("confirmpassword")).sendKeys("Selenium123");
		Select question = new Select(driver.findElement(By.id("security")));
		question.selectByVisibleText("what is your pet name");
		driver.findElement(By.id("answer")).sendKeys("Snoopy");
		driver.findElement(By.xpath("//*[@id='container_body']//input[@value='Save']")).sendKeys(Keys.ENTER);
		
        Thread.sleep(5000);
		
        PageTitles[1] = driver.getTitle();
		return PageTitles;
	}

}
