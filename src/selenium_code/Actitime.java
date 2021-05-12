package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ula37\\Documents\\GitHub\\I0015N_Selenium_Lab\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.actitime.com/");
		driver.findElement(By.xpath("/html/body/section/header/div/div/div[2]/div/a")).click();
		driver.findElement(By.id("first-name")).sendKeys("aaa");
		driver.findElement(By.id("last-name")).sendKeys("bbb");
		driver.findElement(By.id("email")).sendKeys("qukjzfsw@sharklasers.com");
		driver.findElement(By.id("company")).sendKeys("LTU");
	}

}
