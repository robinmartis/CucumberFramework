Feature: Facebook Login 

Scenario Outline:Check the new registration 
	Given User is on home page 
	When User enter "<username>" and "<password"> 
	And Click on Create new account button 
	And Enter First Name 
	And Enter last Name 
	And Enter Phone no 
	And Enter New Password
	
Examples:
|username|password|
|Robin.martis@abc.com|abcdefg|
	
