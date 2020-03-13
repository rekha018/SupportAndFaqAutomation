Feature: Wire Support and FAQ 
	This feature verifies the functionality on Support and FAQ page

Scenario: Verify that main elements on Support and FAQ page are displayed 
	Given I launch Chrome browser 
	And I go to the Wire Home Page 
	When I click on Support & FAQ element 
	Then I navigate to Support and FAQ page 
	And I verify that the page displays the Support and FAQ title 
	And the page displays search text box 
	And the page displays Getting card 
	And the page displays Team Management card 
	And the page displays Using Wire card 
	And the page displays Conferencing card 
	And the page displays Profile & Settings card 
	And the page displays Guests card 
	And the page displays Privacy & Security card 
	
Scenario: Search results displayed should be relevant to search keyword 
	Given I navigate to Support & FAQ page 
	When I search for a keyword 'call' 
	Then I verify that search results are displayed for a keyword 'Call' 
	
Scenario: Verify search functionality for no results 
	Given I navigate to Support & FAQ page 
	When I search for a keyword '*' 
	Then I verify that no results are displayed for a keyword '*' 