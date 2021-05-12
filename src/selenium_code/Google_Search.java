package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Search {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ula37\\Documents\\GitHub\\I0015N_Selenium_Lab\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Software Testing", Keys.ENTER);
	}

}
