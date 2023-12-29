
Feature: Login page automation of saucedemo app 
Scenario Outline: Login is successful with valid credentials
Given User is on login page
When user enters valid "<username>" and "<password>"
And clicks on Login Button
Then User should be navigated to the Home page
And Close the browser

Examples: 
| username | password |
| standard_user | secret_sauce |


