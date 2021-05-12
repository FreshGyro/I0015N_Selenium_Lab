package selenium_code;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Google_Grid {

	WebDriver driver;
	String baseURL, nodeURL;
	
	public static void main(String[] args) throws MalformedURLException {
		Google_Grid test = new Google_Grid();
		test.setUp();
		test.gridTest();
		test.afterTest();
	}
	
	public void setUp() throws MalformedURLException {
		baseURL = "https://www.google.com";
		nodeURL = "http://3.236.7.224:4444/wd/hub";
		
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(new URL(nodeURL), capability);
	}
	
	public void afterTest() {
		driver.quit();
	}

	public void gridTest() {
		driver.get(baseURL);
		driver.findElement(By.name("q")).sendKeys("Software Testing", Keys.ENTER);
	}
}
