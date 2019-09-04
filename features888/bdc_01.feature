Feature: Guest user actions in Demo Webshop

@Sanity
Scenario: Users choice to opt for an account
Given user access the signup page
And gets the credentials

@Regression
Scenario: User access to login page of the Demo Webshop

Given user has valid creds as inputs for Demo Webshop
And provide the valid creds as inputs for the login process
Then verifies the state for the login status

