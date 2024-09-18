@Facebook
Feature: Test Facebook application Functionality

  Scenario Outline: Validate Facebook Register page
    Given User open a "<browsername>" browser
    And User enter firstName as "<firstname>" and lastName as "<lastname>"
		And User Select Date as "<date>" and Month as "<month>" and year as "<year>"
		
		  Examples: 
      | browsername | firstname | lastname | date | month | year |
      | chrome      | Dipali    | patil    |   21 | Feb   | 2010 |
      | edge        | Rahul     | Patil    |   12 | Dec   | 2005 |
      | chrome      | Kavita    | page     |   24 | Mar   | 2009 |
      | incognito   | Kriti     | Patil    |   18 | Jun   | 2019 |
      | edge        | Komal     | page     |   11 | Aug   | 2003 |
		
		
		Examples: 
      | browsername | firstname | lastname | date | month | year |
      | chrome      | Dipali    | patil    |   21 | Feb   | 2011 |
      | edge        | Rahul     | Patil    |   12 | Dec   | 2012 |
      | chrome      | Kavita    | page     |   24 | Mar   | 2013 |
      | incognito   | Kriti     | Patil    |   18 | Jun   | 2014 |
      | edge        | Komal     | page     |   11 | Aug   | 2015 |
		
		Examples: 
      | browsername | firstname | lastname | date | month | year |
      | chrome      | Dipali    | patil    |   21 | Feb   | 2016 |
      | edge        | Rahul     | Patil    |   12 | Dec   | 2017 |
      | chrome      | Kavita    | page     |   24 | Mar   | 2018 |
      | incognito   | Kriti     | Patil    |   18 | Jun   | 2019 |
      | edge        | Komal     | page     |   11 | Aug   | 2020 |
		