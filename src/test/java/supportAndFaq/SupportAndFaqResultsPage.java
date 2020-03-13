package supportAndFaq;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SupportAndFaqResultsPage extends BasePage {

	public void searchKeyword(String keyword) {
		WebElement serchTextBox = driver.findElement(By.name("query"));
		serchTextBox.sendKeys(keyword);
		serchTextBox.sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void areSearchResultsDisplayed() {
		WebElement searchResultsDescription = driver.findElement(By.className("page-header-description"));
		Assert.assertEquals(searchResultsDescription.getText(), "40 results for \"call\"");
	}

	public void isNoSearchResultsTextDisplayed() {
		WebElement searchResultsDescription = driver.findElement(By.className("page-header-description"));
		Assert.assertEquals(searchResultsDescription.getText(), ("No results for \"*\""));
	}

}