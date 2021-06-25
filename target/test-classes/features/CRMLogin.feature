Feature: CRM Login Feature


#Scenario: Valid Login Scenario
#Given User is already on login page
#When User enters login credentials
#Then User is on Home Page
#Then Close browser


#Scenario: Valid Login Scenario with parameters
#Given User is already on login page
#When User enters "mysorebalaji@gmail.com" and "Helpme.88"
#Then User is on Home Page
#Then Close browser


#Scenario Outline: Valid Login Scenario with example parameters
#Given User is already on login page
#When User enters "<username>" and "<password>"
#Then User is on Home Page
#Then Close browser

#Examples:
#|username							 |password	|
#|testuser1						 |welcome123|
#|mysorebalaji@gmail.com|Helpme.88	|


#Scenario: Valid Login Scenario with dataTable parameters
#Given User is already on login page
#When User enters login credentials
#			|mysorebalaji@gmail.com|Helpme.88	|
#Then User is on Home Page
#Then Close browser

Scenario: Valid Login Scenario with dataTable with headers parameters
Given User is already on login page
When User enters login credentials
			|username							 |password	|
			|mysorebalaji@gmail.com|Helpme.88	|
Then User is on Home Page
Then Close browser






#And User clicks Contacts Link
#And Enter contact details "contact first name, last name"
#And User Save the contacts