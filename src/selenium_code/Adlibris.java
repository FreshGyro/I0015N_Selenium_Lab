package selenium_code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Adlibris {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ula37\\Documents\\GitHub\\I0015N_Selenium_Lab\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://Adlibris.Com/se/");
		driver.findElement(By.id("q")).sendKeys("praktisk mjukvarutestning", Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div/div[1]/div/div/div/div/div/div[1]/div/h4/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/div[4]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/header/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div/header/div[4]/div/a")).click();
	}

}
