

Feature: BDC validation on demowebshop

Scenario: Registered user access to cart in DemoWebshop
Given user launched demo webshop app in chrome browser
Then user searches fr the item of his choice
And adds that item to the cart

Scenario: Registered user access track the ordered item in DemoWebshop

Given user has already placed an order for his favorite item
And user tries to access the order tracking dashboard
Then identifies the state of order