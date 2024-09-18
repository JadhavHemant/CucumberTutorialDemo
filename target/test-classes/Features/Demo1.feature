@Demo1

Feature: End To End Testing Of OrangeHRM

  Scenario: Login functinality
    Given open home page
    Then Enter user valid username and password 

  Scenario: Click on PIM
    Given click on PIM button
    Then click add Employee button
    And Enter first name
    And Enter last name
    And Capture employee ID
    And Click on Save
    
  Scenario: Delete employee
  Then Click on Employee list button 
  Then Enter valid Employee id 
  And Click on delete button
    
   