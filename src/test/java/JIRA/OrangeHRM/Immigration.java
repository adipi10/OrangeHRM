package JIRA.OrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;


public class Immigration extends LoginTest{
	
	
	@AfterMethod
	public void Immegration() { 
		
		
		WebDriver driver = LoginTest.driver;
		
		
		WebElement addbutton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		addbutton.click();
		System.out.println("Button Clicked");

		WebElement radio1 = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
		radio1.click();
		System.out.println("Radio Button Clicked");

		WebElement number1 = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		number1.click();
		number1.sendKeys("123456");
		System.out.println("Number Button Clicked");
		
		WebElement issdate = driver.findElement(By.xpath("(//input[@placeholder=\'yyyy-dd-mm\'])[1]"));
		issdate.click();
		issdate.sendKeys("2023-28-02");
		System.out.println("Issue Date Selected");

		
		WebElement expdate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
		expdate.click();
		expdate.sendKeys("2025-28-02");
		System.out.println("Expiry Date Selected");

		WebElement eligiblestatus = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("yes");
		System.out.println("Eligible Button Clicked");

		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("Hello Comments");
		System.out.println("Comments Button Clicked");
		
		//WebElement revdate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[3]"));
		//revdate.click();
		//revdate.sendKeys("2023-29-03");
		//System.out.println("Review Date Selected");
		
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();		
		System.out.println("Data Saved");
		
		
		
	}

}