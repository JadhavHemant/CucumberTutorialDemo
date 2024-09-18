Feature: OrangeHRM Login Page Validate

Scenario: Login Page validate 
Given User open browser as "chrome" 
When User enter valid username and password
			|Admin|admin123|
Then user Click on login button 			