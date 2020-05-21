Feature: Checking for adding a item to Wish list 

Scenario: Successfully got to buy a item from the cart 
	Given User enter web site link 
	When user enters credentials 
		| keerthiyecham29@gmail.com |keerthi@29 |
	Then user name can be seen on the page 
	Then user searches "sanitizer"
	
	Then user clicks on  sanitizer
	Then user clicks on buynow
	Then click on enter cvv "000"
	
