Feature: feature description open the application enter the password

@smoke
Scenario Outline: scenario description
	Given open the application
	When  enter the password <username> and <Password>
	And click login button
	Then verify the home page
		
		Examples:
		| username| Password |
		| admin | manager |
		| admin| manager |
		|mahesh|babu|
@Regresion
Scenario: scenario Test the application Performence
    Given Home page is verified
    When Click on user module
    Then Enter the user data		
		