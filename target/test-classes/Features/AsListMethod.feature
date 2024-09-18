Feature: Test orange HRM application
	
	Scenario: Validate the login functionality
	
	Given user is login page
	When user enter valid username and valid password
		| Admin | admin123 |
	Then user click on login button
