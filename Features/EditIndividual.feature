Feature: Editing Individual in salesforce application

Scenario Outline: Edit Individual
Given Enter the username as <UserName>
And Enter the password as <Password>
When Click on Login button
Then Verify logon successful
When Click on toggle menu button
And click View All
And click Individuals from App Launcher
Given Enter data in the searchbox - Individuals tab as <Name>
When Click on dropdown icon against first displayed name
And Select the option Edit
And Select the salutation as Mr
Given Enter the firstname as <FirstName>
When Click on Save in Edit individual screen
Then Verify individual is edited successfully as <FirstName>

Examples:
|UserName|Password|Name|FirstName|
|hari.radhakrishnan@qeagle.com|Leaf@1234|Kumar|Ganesh|
|hari.radhakrishnan@qeagle.com|Leaf@1234|Kumaras|Sekhar|
