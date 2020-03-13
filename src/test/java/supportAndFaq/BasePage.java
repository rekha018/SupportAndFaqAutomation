package supportAndFaq;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/rekha/Downloads/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.quit();
	}

}

