Feature: Guest user actions in Demo Webshop


Scenario: user access the login page
Given user has a valid credentials
And user enters <"email"> and <"password"> as a input
Then user verifies the login 

Scenario: user closes the webpage
Given user gets the access to the login page
And user clicks the logout button
Then user closes the webpage

Examples:
        |email                   ||password    |
        |shangaviraji@gmail.com  ||s9677365295 |
        |sarmilaarul@gmail.com   ||sarmi007*   |

