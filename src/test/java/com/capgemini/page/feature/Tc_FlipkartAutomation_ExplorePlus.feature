Feature: Explore Plus

  Scenario: checking MyCoinBalance and MyRewardStore in explore plus
    Given I am not home page
    And I am on the login page
    When I enter my username and my password 
    | keerthiyecham29@gmail.com | keerthi@29 | 
    And I click on login Button
    Then I am on HomePage 
    Then I click on explore plus
    And Check MyCoinBalance by clicking
    And also check MyRewardStore by clicking
     
    
    
