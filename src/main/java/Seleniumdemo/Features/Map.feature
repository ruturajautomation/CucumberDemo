Feature: Deal Data Creation 

Scenario: Creation of new deal from Data table 

	Given User is already on login page 
	
	When Title of login page is Facebook 
	
	Then User enters username and password 
		|username|password|
		|naveenk |test@123| 
		
	Then user clicks on facebook 
	
	Then User enters the deals details 
		|Title      |Amount|Probability|Commission|
		|Newone deal|100   |   50      |   10     |
		
	And Close the Browser 
	
