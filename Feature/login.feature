Feature: Login Action
 
Scenario: Successful Login with Valid Inputs
	Given User is on Home Page
	When User enters Username 
	And User enters Password 
	And user click on login
	Then User should see "Login successful"
	
Scenario: Successful Logout
	When User Logout from the Application
	Then message dispalyed Logout succesfully