Feature: Delete Individual in salesforce application

Scenario Outline: Delete Individual
Given Enter the username as <UserName>
And Enter the password as <Password>
When Click on Login button
Then Verify logon successful
When Click on toggle menu button
And click View All
And click Individuals from App Launcher
Given Enter data in the searchbox - Individuals tab as <lstName>
When Click on dropdown icon against first displayed name
And Select the option Delete
And Click on Delete in the displayed popup
Then Verify individual is deleted successfully using last name as <lstName>

Examples:
|UserName|Password|lstName|
|hari.radhakrishnan@qeagle.com|Leaf@1234|Kumar|
|hari.radhakrishnan@qeagle.com|Leaf@1234|Kumars|

