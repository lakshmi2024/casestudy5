Feature: Test cart
Scenario: Test  cart functionality
Given open application
When clicks signin
Then enters username
Then enter password
Then click login
Then type product
Then click search
And check cart
Then close application
