Feature: Google Page Search
  This feature is for verifying google page


Scenario: Search Java Tutorial
Given I launch google page
When I search Java Tutorial
Then Should display Java result page
And Close the browser