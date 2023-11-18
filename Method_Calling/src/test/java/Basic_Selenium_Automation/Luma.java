package Basic_Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Luma {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("Hasiibul1000@gmail");
		driver.findElement(By.id("pass")).sendKeys("huh121");
		driver.findElement(By.name("send")).click();
		driver.manage().window().maximize();
		// driver.close();

	}

}
