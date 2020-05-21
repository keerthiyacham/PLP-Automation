Feature: Footer 

  Scenario: Redirecting from home page to footers option page
    Given I am not home page
    And I am on the login page
    When I enter my username and my password 
    | keerthiyecham29@gmail.com | keerthi@29 | 
    And I click on login Button
    Then I am on HomePage 
    And scroll the Homepage 
    And I click on Shipping feature in footer 
    And  I click on ReturnPolicy feature in footer
    And  I click on FlipkartStories feature in footer