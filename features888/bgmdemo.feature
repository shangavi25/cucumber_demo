Feature: adding items to cart

Background: user launches the demowebshop
Given user has a valid credentials
And user enters the credentials to the login page
Then user verifies the login 


Scenario: user adds item to the cart
Given user selects electronics
And user selects cellphone in it
Then  user add the smart phone to the cart

Scenario: user adds another item to the cart
Given user selects apparel&shoes
And user add the blue jean to the cart
