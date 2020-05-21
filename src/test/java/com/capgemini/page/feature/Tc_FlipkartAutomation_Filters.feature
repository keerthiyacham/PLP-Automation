Feature: Applying Filters to the products

  Scenario: Successfully apply the filters to the product
    Given I am not home page
    And I am on the login page
    When I enter my username and my password 
    | keerthiyecham29@gmail.com | keerthi@29 | 
    And click on loginbutton
    And click on search button and 
    Then user searches "sanitizer"
    And apply the Filters to particular product
 