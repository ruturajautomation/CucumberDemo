Feature: Free CRM Contacts

Scenario Outline: Free CRM New contact

Given User is already on login page

When Title of login page is Facebook

Then User enters "<username>" and "<password>"

And user clicks on facebook 

Then User enters "<firstname>" and "<lastname>" and "<position>"

And Close the Browser

Examples:
		|username|password|firstname|lastname|position|
		|naveenk|test@123|Pranay|Pawar|Forward|
		
