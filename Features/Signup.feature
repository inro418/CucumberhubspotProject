Feature: Create hubspot app for User

Scenario: Create hubspot using Firstname and Lastname


Given User Open Chrome Browser
And User Launching URL
And User Click Signup Link
When User Enter Firstname and Lastname
And User Enter Emailaddress
And User Click Next Button
When User Click Go to Gmail
Then User navigate to Home Page