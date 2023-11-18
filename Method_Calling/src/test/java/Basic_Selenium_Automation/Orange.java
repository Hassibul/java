package Basic_Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.).sendKeys("Hassibul");
		// driver.findElement(By.name("name")).sendKeys("joy1998");
		// driver.findElement(By.className("oxd-button oxd-button--medium
		// oxd-button--main orangehrm-login-button"))
		// .click();
		driver.manage().window().maximize();
		// driver.close();

	}

}
