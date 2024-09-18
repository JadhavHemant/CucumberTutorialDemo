@Guru99Application
Feature: Test Guru99 Application

  Scenario Outline: Validate login functinality
    Given User is on Regsiter Page
    When User Eneter Contact information first Name as "<firstname>" and last Name as "<lastname>"  and Phone Number as "<phone>" and Email as "<email>"
    And User Enter mailing information as "<address>"  and city as "<city>" and state as "<state>" postalcode as "<postalCode>" and Countrt as "<country>"
    And user enter user information "<username>" and "<password>" and "<confirmPassword>"
    And user click on submit button

    Scenarios: 
      | firstname | lastname | phone  | email            | address | city   | state | postalCode | country | username         | password   | confirmPassword |
      | Anjali    | Gurav    | 909090 | Anjali@gmail.com | Pune    | Pune   | MH    |     221122 | INDIA   | anjali@gmail.com | Anjali@123 | Anjali@123      |
      | Neha      | Gupta    | 808080 | Neha@gmail.com   | Mumbai  | Mumbai | MH    |     123456 | ERITREA | Neha@gmail.com   | Neha@123   | Neha@123        |

    Examples: 
      | firstname | lastname | phone    | email           | address | city  | state | postalCode | country        | username        | password  | confirmPassword |
      | Rahul     | Durke    |  7070790 | Rahul@gmail.com | Delhi   | Delhi | DL    |     123456 | CANADA         | Rahul@gmail.com | Rahul@123 | Rahul@123       |
      | Manoj     | Shah     | 12445555 | Manoj@gmail.com | Delhi   | Delhi | DL    |     132424 | AMERICAN SAMOA | Manoj@gmail.com | Manoj@123 | Manoj@123       |

    Examples: 
      | firstname | lastname | phone  | email            | address | city  | state | postalCode | country  | username         | password   | confirmPassword |
      | Amar      | Salve    | 909090 | Amar@gmail.com   | Dubai   | Delhi | DL    |     910101 | MALDIVES | Amar@gmail.com   | Amar@123   | Amar@123        |
      | Nikhil    | Patil    | 909090 | Nikhil@gmail.com | Dubai   | Delhi | DL    |     910101 | INDIA    | Nikhil@gmail.com | Nikhil@123 | Nikhil@123      |

    Examples: 
      | firstname | lastname | phone  | email          | address | city  | state | postalCode | country   | username        | password  | confirmPassword |
      | Punam     | Mahajan  | 909090 | Amar@gmail.com | Dubai   | Delhi | DL    |     910101 | AMALDIVES | Punam@gmail.com | Punam@123 | Punam@123       |
