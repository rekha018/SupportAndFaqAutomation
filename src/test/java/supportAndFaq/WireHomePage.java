package supportAndFaq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WireHomePage extends BasePage {

	public void openWireHomeURL() {
		driver.get("https://wire.com/en/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void clickOnSupportFaqElement() {
		WebElement supportANdFaqElement = driver
				.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/footer/div[1]/div/div[4]/a[2]"));
		supportANdFaqElement.click();
	}

}