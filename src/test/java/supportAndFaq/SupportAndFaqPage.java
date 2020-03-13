package supportAndFaq;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

public class SupportAndFaqPage extends BasePage {

	public void checkSupportAndFaqPageIsDisplayed() {
		Assert.assertTrue(driver.getCurrentUrl().contains("https://support.wire.com/hc/en-us"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void checkSupportAndFaqPageTitleIsDisplayed() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='welcome-message']")).isDisplayed());
	}

	public void checkSearchTextBoxIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("query")).isDisplayed());
	}

	public void checkGettingCardIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.cssSelector("[title*='Getting Started']")).isDisplayed());
	}

	public void checkTeamManagementCardIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.cssSelector("[title*='Team Management']")).isDisplayed());
	}

	public void checkUsingWireCardIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.cssSelector("[title*='Using Wire']")).isDisplayed());
	}

	public void checkConferencingCardIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.cssSelector("[title*='Conferencing']")).isDisplayed());
	}

	public void checkProfileAndSettingsCardIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.cssSelector("[title*='Profile & Settings']")).isDisplayed());
	}

	public void checkGuestsCardIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.cssSelector("[title*='Guests']")).isDisplayed());
	}

	public void checkPrivacyAndSecurityCardIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.cssSelector("[title*='Privacy & Security']")).isDisplayed());
	}

	public void openSupportAndFaqPage() {
		driver.get("https://support.wire.com/hc/en-us");
	}

}