package stepDefinitions;


import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import supportAndFaq.SupportAndFaqPage;
import supportAndFaq.SupportAndFaqResultsPage;
import supportAndFaq.WireHomePage;

public class StepDefsSupportAndFaqPage {

	WireHomePage wireHomePage = new WireHomePage();
	SupportAndFaqPage supportAndFaqPage = new SupportAndFaqPage();
	SupportAndFaqResultsPage supportAndFaqResultsPage = new SupportAndFaqResultsPage();

	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() {
		supportAndFaqPage.launchBrowser();
	}

	@Given("^I go to the Wire Home Page$")
	public void i_go_to_the_Wire_Home_Page() {
		wireHomePage.openWireHomeURL();
	}

	@When("^I click on Support & FAQ element$")
	public void i_click_on_Support_FAQ_element() {
		wireHomePage.clickOnSupportFaqElement();
	}

	@Then("^I navigate to Support and FAQ page$")
	public void i_navigate_to_Support_and_FAQ_page() {
		supportAndFaqPage.checkSupportAndFaqPageIsDisplayed();
	}

	@Then("^I verify that the page displays the Support and FAQ title$")
	public void i_verify_that_the_page_displays_the_Support_and_FAQ_title() {
		supportAndFaqPage.checkSupportAndFaqPageTitleIsDisplayed();
	}

	@Then("^the page displays search text box$")
	public void the_page_displays_search_text_box() {
		supportAndFaqPage.checkSearchTextBoxIsDisplayed();
	}

	@Then("^the page displays Getting card$")
	public void the_page_displays_Getting_card() {
		supportAndFaqPage.checkGettingCardIsDisplayed();
	}

	@Then("^the page displays Team Management card$")
	public void the_page_displays_Team_Management_card() {
		supportAndFaqPage.checkTeamManagementCardIsDisplayed();
	}

	@Then("^the page displays Using Wire card$")
	public void the_page_displays_Using_Wire_card() {
		supportAndFaqPage.checkUsingWireCardIsDisplayed();
	}

	@Then("^the page displays Conferencing card$")
	public void the_page_displays_Conferencing_card() {
		supportAndFaqPage.checkConferencingCardIsDisplayed();
	}

	@Then("^the page displays Profile & Settings card$")
	public void the_page_displays_Profile_Settings_card() {
		supportAndFaqPage.checkProfileAndSettingsCardIsDisplayed();
	}

	@Then("^the page displays Guests card$")
	public void the_page_displays_Guests_card() {
		supportAndFaqPage.checkGuestsCardIsDisplayed();
	}

	@Then("^the page displays Privacy & Security card$")
	public void the_page_displays_Privacy_Security_card() {
		supportAndFaqPage.checkPrivacyAndSecurityCardIsDisplayed();
	}

	@Given("^I navigate to Support & FAQ page$")
	public void i_navigate_to_Support_FAQ_page() {
		supportAndFaqPage.openSupportAndFaqPage();
	}

	@When("^I search for a keyword 'call'$")
	public void i_search_for_a_keyword_call() {
		supportAndFaqResultsPage.searchKeyword("call");
	}

	@Then("^I verify that search results are displayed for a keyword 'Call'$")
	public void i_verify_that_search_results_are_displayed_for_a_keyword_Call() {
		supportAndFaqResultsPage.areSearchResultsDisplayed();
	}

	@When("^I search for a keyword '\\*'$")
	public void i_search_for_a_keyword() {
		supportAndFaqResultsPage.searchKeyword("*");
	}

	@Then("^I verify that no results are displayed for a keyword '\\*'$")
	public void i_verify_that_no_results_are_displayed_for_a_keyword() {
		supportAndFaqResultsPage.isNoSearchResultsTextDisplayed();
		supportAndFaqResultsPage.closeBrowser();
	}

}