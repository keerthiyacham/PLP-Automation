Feature: selecting product and clicking on Wishlist

  Scenario: Successfully clicking on the wishlist to selected product
    Given I am not home page
    And I am on the login page
    When I enter my username and my password 
    | keerthiyecham29@gmail.com | keerthi@29 | 
    And click on loginbutton
    And Mousehover on more and selecting the brand and selecting the product
    And click on the Wishlist button
