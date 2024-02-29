package JIRA.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void invokechrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("Admin");
		System.out.println("username entered");

		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("admin123");
		System.out.println("password entered");

		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();
		System.out.println("Clicked on login");

		WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		myInfo.click();
		System.out.println("Clicked on myinfo");

		WebElement imme = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
		imme.click();
		System.out.println("Clicked on Immegration");

	}

}
