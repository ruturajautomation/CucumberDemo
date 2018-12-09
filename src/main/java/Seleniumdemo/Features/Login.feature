Feature: Try to Learn Automation

Scenario Outline: Login and find the Automation 

Given User is already on login page

When Title of login page is Facebook



Then User enters "<username>" and "<password>"

And user clicks on facebook 

And Close the Browser

Examples:
		|username|password|
		|naveenk|test@123|
